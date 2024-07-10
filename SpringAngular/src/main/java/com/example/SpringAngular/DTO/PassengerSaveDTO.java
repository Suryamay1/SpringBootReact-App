package com.example.SpringAngular.DTO;

public class PassengerSaveDTO {
	
	private int id;
	private String name;
	private String city;
	private int phone;
	public PassengerSaveDTO(int id,String name, String city, int phone) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.phone = phone;
	}
	public PassengerSaveDTO() {
		
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
		return "PassengerDTO [id = "+ id +", name=" + name + ", city=" + city + ", phone=" + phone + "]";
	}
}
