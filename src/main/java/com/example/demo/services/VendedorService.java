package com.example.demo.services;

import java.util.List;

import com.example.demo.models.entity.Vendedor;

public interface VendedorService {
	
	public List<Vendedor> findAll();

	public Vendedor findById(Long id);

	public Vendedor save(Vendedor vendedor);

	public void deleteById(Long id);
}
