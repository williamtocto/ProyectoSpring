package com.example.demo.services;

import java.util.List;


import com.example.demo.models.entity.Empleado;

public interface EmpleadoService {

	public List<Empleado> findAll();

	public Empleado findById(Long id);

	public Empleado save(Empleado empleado);

	public void deleteById(Long id);

}
