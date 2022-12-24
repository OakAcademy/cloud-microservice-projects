package com.example.web;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.entities.Bill;
import com.example.entities.Product;
import com.example.entities.SoldProduct;
import com.example.services.BillService;
import com.example.services.ProductService;
import com.example.services.SoldProductService;

import jakarta.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private ProductService productservice;

	@Autowired
	private BillService billservice;
	@Autowired
	private SoldProductService soldProductService;

	@GetMapping("/Basket")
	public String Basket(Model model)
	{
		List<SoldProduct> allsoldproducts=soldProductService.getAllProducts();
		List<SoldProduct> soldProducts=new ArrayList<SoldProduct>();
		for(SoldProduct sp:allsoldproducts)
		{
			if(sp.isIn_basket()==true)
				soldProducts.add(sp);
		}
		List<Product> products=productservice.getAllProducts();
		model.addAttribute("products",products);
		model.addAttribute("soldproducts",soldProducts);
		return "Basket";
	}
	@PostMapping("/saveBill")
	public String saveBill(@ModelAttribute("modelBill")Bill bill,HttpServletResponse response)
	{
		
		List<Bill> bills=billservice.getAllBills();
		Bill nowbill=null;
		for(Bill bl:bills)
		{
			if(bl.isEmployee_confirmed()==false) {
				nowbill=bl;
				break;
			}
		}
		
		nowbill.setAdmin_confirmed(false);
		nowbill.setEmployee_confirmed(true);
		nowbill.setBill_date(bill.getBill_date());
		nowbill.setCustomerName(bill.getCustomerName());
		nowbill.setCustomersurname(bill.getCustomersurname());
		nowbill.setTotal_price(bill.getTotal_price());
		billservice.saveBill(nowbill);
		List<SoldProduct> soldProducts=soldProductService.getAllProducts();
		for(SoldProduct sp:soldProducts)
		{
			if(sp.isIn_basket()==true)
			{
				sp.setIn_basket(false);
				soldProductService.saveSoldProduct(sp);
			}
		}
		return "redirect:/Employee/EmployeeProductList";
	}
	
	@GetMapping("/cancelTheSale")
	public String cancelTheSale(HttpServletResponse response) {
		
		List<SoldProduct> soldProducts=soldProductService.getAllProducts();
		List<SoldProduct> selectedSoldProduct=new ArrayList<SoldProduct>();
		long billId=0;
		for(SoldProduct sp:soldProducts)
		{
			if(sp.isIn_basket()==true)
			{
				selectedSoldProduct.add(sp);
				soldProductService.deleteSoldProductById(sp.getId());
				billId=sp.getBill_Id();
			}
		}
		billservice.deleteBillById(billId);
		for(SoldProduct selectSoldProduct:selectedSoldProduct)
		{
			Product product=productservice.getProductById(selectSoldProduct.getProduct_Id());
			product.setStock(product.getStock()+selectSoldProduct.getPiece());
			productservice.saveProduct(product);
		}
		return "redirect:/employee/EmployeeProductList";
		
	}
	
	@GetMapping("/createBill")
	public String createBill(Model model)
	{
		List<Bill> bills=billservice.getAllBills();
		Bill modelbill=null;
		for(Bill bill:bills)
		{
			
			if(bill.isEmployee_confirmed()==false)
				modelbill=bill;
		}
		int totalPrice=0;
		List<SoldProduct> soldProducts=soldProductService.getAllProducts();
		for(SoldProduct sp:soldProducts)
		{
			if(sp.isIn_basket())
			{
				totalPrice+=productservice.getProductById(sp.getProduct_Id()).getPrice()*sp.getPiece();
			}
		}
		modelbill.setTotal_price(totalPrice);
		model.addAttribute("modelbill",modelbill);
		return "createBill";
		
	}
	
	@PostMapping("/AddBasket")
	public String AddBasket(String piece, String ProductId, HttpServletResponse response) {
		List<Bill> bills = billservice.getAllBills();
		Boolean haveEmptyBill = false;
		long emptyBillId = 0;

		if (bills.size() == 0) {
			Bill bill = new Bill();
			bill.setCustomerName("");
			bill.setCustomersurname("");
			bill.setTotal_price(0);
			bill.setBill_date(java.sql.Date.valueOf(LocalDate.now()));
			bill.setEmployee_confirmed(haveEmptyBill);
			bill.setAdmin_confirmed(false);
			billservice.saveBill(bill);
			AddBasket(piece, ProductId, response);

		} else {
			for (Bill bill : bills) {
				if (bill.isEmployee_confirmed() == false) {
					haveEmptyBill = true;
					emptyBillId = bill.getId();
				}
			}
			Boolean alreadyexistinBasket = false;
			List<SoldProduct> soldProducts = this.soldProductService.getAllProducts();
			for (SoldProduct sp : soldProducts) {
				if (sp.isIn_basket() == true) {

					alreadyexistinBasket = true;
					break;
				}
			}

			if (alreadyexistinBasket) {
				Product product = productservice.getProductById(Long.parseLong(ProductId));
				product.setStock(product.getStock() - (Integer.parseInt(piece)));
				productservice.saveProduct(product);
			} else {
				Product product = productservice.getProductById(Long.parseLong(ProductId));
				product.setStock(product.getStock() - (Integer.parseInt(piece)/2));
				productservice.saveProduct(product);

			}
			
			if(haveEmptyBill)
			{
				Boolean alreadyexist=true;
				List<SoldProduct> soldproducts=soldProductService.getAllProducts();
				for(SoldProduct soldproduct:soldProducts)
				{
					if(soldproduct.getProduct_Id()==Long.parseLong(ProductId) && soldproduct.isIn_basket()==true)
					{
						soldproduct.setPiece(soldproduct.getPiece()+Integer.parseInt(piece));
						soldProductService.saveSoldProduct(soldproduct);
						alreadyexist=false;
						
					}
					
				}
				
				
				if(alreadyexist)
				{
					SoldProduct soldProduct=new SoldProduct();
					soldProduct.setProduct_Id(Long.parseLong(ProductId));
					soldProduct.setPiece(Integer.parseInt(piece));
					soldProduct.setIn_basket(true);
					soldProduct.setBill_Id(emptyBillId);
					soldProductService.saveSoldProduct(soldProduct);
					
				}
			}
			else
			{
				Bill bill = new Bill();
				bill.setCustomerName("");
				bill.setCustomersurname("");
				bill.setTotal_price(0);
				bill.setBill_date(java.sql.Date.valueOf(LocalDate.now()));
				bill.setEmployee_confirmed(haveEmptyBill);
				bill.setAdmin_confirmed(false);
				billservice.saveBill(bill);
				AddBasket(piece, ProductId, response);
				
			}
		}
		return "redirec:/employee/EmployeeProductList";

	}

	@GetMapping("/EmployeeProductList")
	public String EmployeeProductList(Model model) {
		List<Product> list = productservice.getAllProducts();
		model.addAttribute("products", list);
		return "AdminProductList";

	}

	@GetMapping("/ProductDetail/{id}")
	public String ProductDetail(@PathVariable(value = "id") long id, Model model) {
		Product product = productservice.getProductById(id);
		model.addAttribute("product", product);
		SoldProduct soldProduct = new SoldProduct();
		model.addAttribute("soldProduct", soldProduct);
		return "ProductDetail";
	}
}
