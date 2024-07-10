package com.example.SpringAngular.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.SpringAngular.DAO.Repo;
import com.example.SpringAngular.DTO.PassengerSaveDTO;
import com.example.SpringAngular.DTO.PassengerUpdateDTO;
import com.example.SpringAngular.Entity.Passengers;

@Service
public class Services {
	
	@Autowired
	Repo repo;
	
	public String addPassenger(PassengerSaveDTO saveDTO) {
		
		Passengers passenger = new Passengers(
				saveDTO.getId(),
				saveDTO.getName(),
				saveDTO.getCity(),
				saveDTO.getPhone()
				);
		
		repo.save(passenger);
		return passenger.getName();
	}

	public List<Passengers> getAllPass()
	{
		List<Passengers> list = repo.getAll();
		return list;
	}
	@Transactional
	public void updateName(int id, String name) {
		repo.updateName(id, name);
	}
	@Transactional
	public void updatePhone(int id, int phone) {
		repo.updatePhone(id, phone);
	}
	@Transactional
	public void updateCity(int id, String city) {
		repo.updateCity(id, city);
	}
	@Transactional
	@Modifying
	public void deleteRec(int id) {
		repo.deleteById(id);
	}
	@Transactional
	public void update(int id, String name, String city, int phone) {
		repo.update(id, name, city, phone);
	}
	
}
