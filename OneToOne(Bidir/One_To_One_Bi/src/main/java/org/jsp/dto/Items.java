package org.jsp.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Items {

	@Override
	public String toString() {
		return "Items [id=" + id + ", name=" + name + ", price=" + price + ", brand=" + brand + ", invoice=" + invoice
				+ "]";
	}
	@Id
	private int id;
	private String name;
	private double price;
	private String brand;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn
	private Invoice invoice;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Invoice getInvoice() {
		return invoice;
	}
	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
}
