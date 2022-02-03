package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.dao.ProductoDao;
import com.example.demo.models.entity.Producto;

@Service
public class ProductoServiceImp implements ProductoService{

	@Autowired
	private  ProductoDao productoDao;

	@Override
	@Transactional (readOnly = true)
	
	public List<Producto> findAll() {
		return (List<Producto>) productoDao.findAll();
	}

	@Override
	public Producto findById(Long id) {
		return productoDao.findById(id).orElse(null);
	}
	
	@Override
	public Producto save(Producto producto) {
		return productoDao.save(producto);
	}
	
	@Override
	public void deleteById(Long id) {
	 productoDao.deleteById(id);
	}

}
