package com.example.demo.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.models.entity.*;
import com.example.demo.services.EmpleadoService;


import java.util.List;


@CrossOrigin(origins= {"http://localhost:4200"})


@RestController
@RequestMapping("/api")

public class EmpleadoRestController {

	
	@Autowired
	private EmpleadoService empleadoService;
	
	
	@GetMapping("/empleado")
	public List<Empleado> index() {
		return empleadoService.findAll();	
	}
	
	
	@GetMapping("/empleado/{id}")
    public Empleado show(@PathVariable Long id) {	
		return empleadoService.findById(id);	
	}
	
	@PostMapping("/empleado")
	@ResponseStatus (HttpStatus.CREATED)
	
	public Empleado save(@RequestBody Empleado cliente) {	
	return empleadoService.save(cliente);
		
	}
	
	
   @DeleteMapping("/empleado/{id}")
   public void delete(@PathVariable Long id) {	
	   empleadoService.deleteById(id);	
 	}
   
   // editarempleado
   @PutMapping("/empleado/{id}")
   public Empleado update(@RequestBody Empleado empleado , @PathVariable Long id) {
	   
	   Empleado EmpleadoActual = empleadoService.findById(id);
	   EmpleadoActual.setApellido(empleado.getApellido());
	   EmpleadoActual.setNombre(empleado.getNombre());
	   EmpleadoActual.setEmail(empleado.getEmail());
	   EmpleadoActual.setCi(empleado.getCi());
	   EmpleadoActual.setFecha_n(empleado.getFecha_n());
	   EmpleadoActual.setDireccion(empleado.getDireccion());
	   EmpleadoActual.setSexo(empleado.getSexo());
	   EmpleadoActual.setSalario(empleado.getSalario());
	   EmpleadoActual.setSuperci(empleado.getSuperci());
	   EmpleadoActual.setDno(empleado.getDno());
	   
	   return empleadoService.save(EmpleadoActual);
	   
   }
 	
}
