package org.jsp.controller;

import org.jsp.dao.Items_Invoice_Dao;
import org.jsp.dto.Invoice;
import org.jsp.dto.Items;

public class Items_Invoice_Controller {

	public static void main(String[] args) {
		Items items=new Items();
		items.setId(103);
		items.setName("condam");
		items.setBrand("man force");
		items.setPrice(35);
		
		Invoice invoice=new Invoice();
		invoice.setId(3);
		invoice.setAddress("mumbai");
		invoice.setCname("yugi");
		
		//items.setInvoice(invoice);
		invoice.setItems(items);
		
		Items_Invoice_Dao dao=new Items_Invoice_Dao();
	//	dao.saveItems(items);
		//dao.saveInvoice(invoice);
		
		//when we find a object in one to one bidirectional mapping we will get stackoverflowerror  so 
		//to resole it we have we have remove the reference var which is overrided
		//in  opposite class i.e. Invoice toString() 
		
		//dao.findItems(101);
		//dao.updateItems(items);
		//dao.deleteItems(105);
		//dao.findAll(items);
		//dao.fetchAll(items);
		dao.findInvoice(1);
		//dao.updateInvoice(invoice);
		
	}
	
}
