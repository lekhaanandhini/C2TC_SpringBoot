package com.tns.project;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProductService {
	
	@Autowired
	private ProductRepository repository;

	public List<Product> listAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	public Product get(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	public void save(Product product) {
		repository.save(product);
		
	}

	public void delete(Integer id) {
		repository.deleteById(id);
		
	}


}
