package com.example.demo.controllers;

import java.util.List;

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
import com.example.demo.services.VendedorService;

@CrossOrigin(origins= {"http://localhost:4200"})


@RestController
@RequestMapping("/api")

public class VendedorRestController {

	
	@Autowired
	private VendedorService vendeService;
	
	@GetMapping("/vendedor")
	public List<Vendedor> index() {
		return vendeService.findAll();	
	}
	
	
	@GetMapping("/vendedor/{id}")
    public Vendedor show(@PathVariable Long id) {	
		return vendeService.findById(id);	
	}
	
	@PostMapping("/vendedor")
	@ResponseStatus (HttpStatus.CREATED)
	
	public Vendedor save(@RequestBody Vendedor vende) {	
	return vendeService.save(vende);
		
	}
	
	
   @DeleteMapping("/vendedor/{id}")
   public void delete(@PathVariable Long id) {	
	   vendeService.deleteById(id);	
 	}
   
   // editarempleado
   @PutMapping("/vendedor/{id}")
   public Vendedor update(@RequestBody Vendedor vendedor , @PathVariable Long id) {
	   
	   Vendedor Vendedor = vendeService.findById(id);
	   Vendedor.setApellidos(vendedor.getApellidos());
	   Vendedor.setTelefono(vendedor.getTelefono());
	   Vendedor.setNombre(vendedor.getNombre());
	   Vendedor.setEmail(vendedor.getEmail());	   
	   Vendedor.setDireccion(vendedor.getDireccion());
	   return vendeService.save(Vendedor);
	  
   }
}
