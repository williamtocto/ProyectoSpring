package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.demo.models.dao.EmpleadoDao;
import com.example.demo.models.entity.Empleado;

@Service
public class EmpleadoServiceImp implements EmpleadoService {
	
	@Autowired
	private  EmpleadoDao empleadoDao;

	@Override
	@Transactional (readOnly = true)
	
	public List<Empleado> findAll() {
		return (List<Empleado>) empleadoDao.findAll();
	}

	@Override
	public Empleado findById(Long id) {
		return empleadoDao.findById(id).orElse(null);
	}
	
	@Override
	public Empleado save(Empleado empleado) {
		return empleadoDao.save(empleado);
	}
	
	@Override
	public void deleteById(Long id) {
	 empleadoDao.deleteById(id);
	}
	
}

