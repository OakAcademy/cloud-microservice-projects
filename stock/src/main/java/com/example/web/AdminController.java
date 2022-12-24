package com.example.web;

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

@Controller
@RequestMapping("/admin")
public class AdminController {

	private ProductService productservice;
	@GetMapping("/AddProduct")
	public String AddProduct(Model model)
	{
		
		Product product=new Product();
		model.addAttribute("product",product);
		return "AddProduct";
	}
	
	@Autowired
	private BillService billservice;
	@GetMapping("/BillList")
	public String BillList(Model model)
	{
		List<Bill> bills=billservice.getAllBills();
		model.addAttribute("bills",bills);
		return "BillList";
	}
	
	@GetMapping("/ConfirmBill/{id}")
	public String ConfirmBill(@PathVariable(value="id") long id)
	{
		Bill bill=billservice.getBillById(id);
		bill.setAdmin_confirmed(true);
		billservice.saveBill(bill);
		return "redirect:/admin/BillList";
	}
	@Autowired
	private SoldProductService soldProductservice;
	
	@GetMapping("/CancelTheBill/{id}")
	public String CancelTheBill(@PathVariable(value="id")long id)
	{
		List<SoldProduct> soldproducts=soldProductservice.getAllProducts();
		List<SoldProduct> selectedSoldProducts=new ArrayList<SoldProduct>();
		for(SoldProduct sp:soldproducts)
		{
			if(sp.getBill_Id()==id)
			{
				selectedSoldProducts.add(sp);
				soldProductservice.deleteSoldProductById(sp.getId());
			}
			
		}
		billservice.deleteBillById(id);
		for(SoldProduct selectsoldproduct:selectedSoldProducts)
		{
			Product product=productservice.getProductById(selectsoldproduct.getProduct_Id());
			product.setStock(product.getStock()+selectsoldproduct.getPiece());
			productservice.saveProduct(product);
		}
		
		return "redirect:/admin/BillList";
	}
	
	@GetMapping("/UpdateProduct/{id}")
	public String UpdateProduct(@PathVariable(value="id")long id,Model model)
	{
		Product product=productservice.getProductById(id);
		model.addAttribute("product",product);
		return "UpdateProduct";
		
	}
	
	@GetMapping("/AdminProductList")
	public String AdminProductList(Model model)
	{List<Product> list=productservice.getAllProducts();
	model.addAttribute("products",list);
		return "AdminProductList";
		
	}
	@PostMapping("/saveProduct")
	public String SaveProduct(@ModelAttribute("product") Product product)
	{
		
		productservice.saveProduct(product);
		return "redirect:/admin/AdminProductList";
	}
	@GetMapping("/DeleteProduct/{id}")
	public String DeleteProduct(@PathVariable(value="id")long id) {
		
		productservice.deleteProduct(id);
		return "redirect:/admin/AdminProductList";
		
		
	}
	
	
	
	
	
	
	
	
}
