package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.dao.VendedorDao;
import com.example.demo.models.entity.Vendedor;


@Service
public class VendedorServiceImp implements VendedorService{
	
	@Autowired
	private  VendedorDao vendedorDao;

	@Override
	@Transactional (readOnly = true)
	
	public List<Vendedor> findAll() {
		return (List<Vendedor>) vendedorDao.findAll();
	}

	@Override
	public Vendedor findById(Long id) {
		return vendedorDao.findById(id).orElse(null);
	}
	
	@Override
	public Vendedor save(Vendedor vendedor) {
		return vendedorDao.save(vendedor);
	}
	
	@Override
	public void deleteById(Long id) {
	 vendedorDao.deleteById(id);
	}

}
