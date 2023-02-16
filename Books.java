package com.strorege;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Book_detail")
public class Books implements Serializable{

	@Id
	@Column(name="book_id" )
	private int  id;
	
	@Column(name="book_name" , length=22)
	private String name;
	
	@Column (name="book_price" )	
	private double price;
	
	@Column (name="Others_name" , length=33)
	private String otther;
	
	public Books() {
		// TODO Auto-generated constructor stub
	}

	public Books(int id, String name, double price, String otther) {
		 
		this.id = id;
		this.name = name;
		this.price = price;
		this.otther = otther;
	}

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

	public String getOtther() {
		return otther;
	}

	public void setOtther(String otther) {
		this.otther = otther;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, otther, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Books other = (Books) obj;
		return id == other.id && Objects.equals(name, other.name) && Objects.equals(otther, other.otther)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}

	@Override
	public String toString() {
		return "Books [id=" + id + ", name=" + name + ", price=" + price + ", otther=" + otther + "]";
	}
	
	
}
