package model.dao;


import java.util.List;

import model.entities.Seller;


public interface SellerDao {

	void insert (Seller obj);  // vai inserir este objeto no banco de dados
	void update (Seller obj);
	void DeleteById (Integer id);
	Seller findById(Integer id); 
	List<Seller> findall();

	
	
	
}