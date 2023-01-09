package org.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.dto.Invoice;
import org.jsp.dto.Items;

public class Items_Invoice_Dao {

	private EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	private EntityManager entityManager=entityManagerFactory.createEntityManager();
	private EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public void saveItems(Items items) {
		entityTransaction.begin();
		entityManager.persist(items);
		entityTransaction.commit();		
	}
	
	public void saveInvoice(Invoice invoice) {
		entityTransaction.begin();
		Items items=invoice.getItems();
		items.setInvoice(invoice);
		
		entityManager.persist(invoice);
		entityTransaction.commit();
	}
	
	public void findItems(int id) {
		Items items=entityManager.find(Items.class, id);
		entityTransaction.begin();
 	   if(items !=null)
 			{
 				System.out.println(items);
 			}
 			else {
 				System.out.println("Id not found");
 			}
	}
	
	public void updateItems(Items items) {
		entityTransaction.begin();
		entityManager.merge(items);
		entityTransaction.commit();
	}
	
	public void deleteItems(int id) {
		Items items=entityManager.find(Items.class,id);
		entityTransaction.begin();
		if(items != null) {
			entityManager.remove(items);
			entityTransaction.commit();
		}else {
			System.out.println("Id not found");
		}
	}
	
	public List<Items> findAll(Items items) {
		Query query=entityManager.createQuery("select a From Items a");
		System.out.println(items);
 		return query.getResultList();
 		
	}
	
	public void fetchAll(Items items) {
		Query query=entityManager.createQuery("select b from Items b");
		List<Items> list=query.getResultList();
		System.out.println(list);
	}
	
	
	//Invoice 
	public void findInvoice(int id) {
		Invoice invoice=entityManager.find(Invoice.class, id);
		entityTransaction.begin();
 	   if(invoice !=null)
 			{
 				System.out.println(invoice);
 			}
 			else {
 				System.out.println("Id not found");
 			}
	}
	
	public void updateInvoice(Invoice invoice) {
		entityTransaction.begin();
		entityManager.merge(invoice);
		entityTransaction.commit();
	}
	
	public void deleteInvoice(int id) {
		Invoice invoice=entityManager.find(Invoice.class,id);
		entityTransaction.begin();
		if(invoice != null) {
			entityManager.remove(invoice);
			entityTransaction.commit();
		}else {
			System.out.println("Id not found");
		}
	}
}
