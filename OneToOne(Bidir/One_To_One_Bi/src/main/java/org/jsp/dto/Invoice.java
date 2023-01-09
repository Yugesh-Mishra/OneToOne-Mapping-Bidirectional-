package org.jsp.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Invoice {

	@Override
	public String toString() {
		return "Invoice [id=" + id + ", cname=" + cname + ", address=" + address + "]";
	}
	@Id
	private int id;
	private String cname;
	private String address;
	
	@OneToOne(mappedBy = "invoice",cascade=CascadeType.ALL)
	private Items items;
	
	public int getId() {
		return id;
	}
	public Items getItems() {
		return items;
	}
	public void setItems(Items items) {
		this.items = items;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
