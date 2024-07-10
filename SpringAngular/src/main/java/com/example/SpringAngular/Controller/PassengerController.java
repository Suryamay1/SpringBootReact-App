package com.example.SpringAngular.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.SpringAngular.DTO.PassengerSaveDTO;
import com.example.SpringAngular.DTO.PassengerUpdateDTO;
import com.example.SpringAngular.Entity.Passengers;
import com.example.SpringAngular.Service.Services;

@RestController
@CrossOrigin
@RequestMapping("/passengers")
public class PassengerController {

	@Autowired
	Services service;
	
	@PostMapping(path="/save")
	public String savePass(@RequestBody PassengerSaveDTO saveDTO)
	{
		String id = service.addPassenger(saveDTO);
		return id;
	}
	
	@GetMapping(path="/getAll")
	public List<Passengers> getAll() {
		List<Passengers> list = service.getAllPass();
		return list;
	}
	
	@PutMapping(path = "/update")
	public void update(@RequestBody PassengerUpdateDTO update) {
		int id = update.getId();
		String name = update.getName();
		String city = update.getCity();
		int phone = update.getPhone();
		service.update(id,name,city,phone);
	}
	
	@PutMapping(path="/updatename")
	public String updateName(@RequestBody PassengerUpdateDTO updateDTO) {
		int id = updateDTO.getId();
		String name = updateDTO.getName();
		service.updateName(id,name);
		return name;
	}
	
	@PutMapping(path="/updatephone")
	public int updatePhone(@RequestBody PassengerUpdateDTO updateDTO) {
		int id = updateDTO.getId();
		int phone = updateDTO.getPhone();
		service.updatePhone(id,phone);
		return phone;
	}
	
	@PutMapping(path="/updatecity")
	public String updateCity(@RequestBody PassengerUpdateDTO updateDTO) {
		int id = updateDTO.getId();
		String city = updateDTO.getCity();
		service.updateCity(id,city);
		return city;
	}
	
	@DeleteMapping(path="/delete/{id}")
	public int deleteRec(@PathVariable int id) {
		service.deleteRec(id);
		return id; 
	}
	
}
