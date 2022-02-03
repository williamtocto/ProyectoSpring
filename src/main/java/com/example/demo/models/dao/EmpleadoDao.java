package com.example.demo.models.dao;

import org.springframework.data.repository.CrudRepository;


import com.example.demo.models.entity.Empleado;

public interface EmpleadoDao extends CrudRepository<Empleado,Long> {

}
