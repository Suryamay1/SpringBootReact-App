package com.example.SpringAngular.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.SpringAngular.Entity.Passengers;


@Repository
public interface Repo extends JpaRepository<Passengers,Integer>{

	@Query (value="select * from passengers.passengers_detail",nativeQuery=true)
	public List<Passengers> getAll(); 
	
	/*
	 * @Modifying
	 * 
	 * @Query(value="UPDATE customer SET name =?2 WHERE id=?1",nativeQuery=true)
	 * public void updateNamebyId(int id, String name);
	 */
	
	@Modifying
	@Query (value="UPDATE passengers_detail SET name =:n WHERE id =:id",nativeQuery=true)
	public void updateName(@Param("id") int id, @Param("n") String name);
	
	@Modifying
	@Query (value="UPDATE passengers_detail SET phone =?2 WHERE id =?1",nativeQuery=true)
	public void updatePhone(int id, int phone);

	@Modifying
	@Query (value="UPDATE passengers_detail SET city =?2 WHERE id =?1",nativeQuery=true)
	public void updateCity(int id, String city); 
	
	@Modifying
	@Query (value="UPDATE passengers_detail SET name =?2,city =?3,phone =?4 WHERE id =?1",nativeQuery=true)
	public void update(int id, String name,String city,int phone); 
	
}
