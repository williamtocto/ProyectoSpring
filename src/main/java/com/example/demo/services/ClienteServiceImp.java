package com.example.demo.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.dao.IClienteDao;
import com.example.demo.models.entity.Cliente;

@Service
public class ClienteServiceImp implements IClienteService {
	
	@Autowired
	private IClienteDao clienteDao;

	@Override
	@Transactional (readOnly = true)
	public List<Cliente> findAll() {
		return (List<Cliente>) clienteDao.findAll();
	}

	@Override
	public Cliente findById(Long id) {
		return clienteDao.findById(id).orElse(null);
	}
	
	@Override
	public Cliente save(Cliente cliente) {
		return clienteDao.save(cliente);
	}
	
	@Override
	public void deleteById(Long id) {
	 clienteDao.deleteById(id);
	}
	
	
}











