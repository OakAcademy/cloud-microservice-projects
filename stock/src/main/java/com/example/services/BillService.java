package com.example.services;

import java.util.List;

import com.example.entities.Bill;

public interface BillService {
List<Bill> getAllBills();
void saveBill(Bill bill);
Bill getBillById(long id);
void deleteBillById(long id);

}
