package com.example.SpringAngular.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Passengers_Detail")
public class Passengers {

	@Id
	@Column(name="id", length=10)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="name",length=50)
	private String name;
	
	@Column(name="city",length=50)
	private String city;
	
	@Column(name="phone",length=15)
	private int phone;
	
	public Passengers(int id, String name, String city, int phone) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.phone = phone;
	}

	public Passengers() {
	
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Passengers [id=" + id + ", name=" + name + ", city=" + city + ", phone=" + phone + "]";
	}
	
}
