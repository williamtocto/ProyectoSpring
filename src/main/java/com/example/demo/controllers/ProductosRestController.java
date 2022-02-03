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

import com.example.demo.models.entity.Producto;
import com.example.demo.services.ProductoService;

@CrossOrigin(origins= {"http://localhost:4200"})

@RestController
@RequestMapping("/api")

public class ProductosRestController {

	
	@Autowired
	private ProductoService productoservice;
	
	
	@GetMapping("/producto")
	public List<Producto> index() {
		return productoservice.findAll();	
	}
	
	
	@GetMapping("/producto/{id}")
    public Producto show(@PathVariable Long id) {	
		return productoservice.findById(id);	
	}
	
	@PostMapping("/producto")
	@ResponseStatus (HttpStatus.CREATED)
	
	public Producto save(@RequestBody Producto producto) {	
	return productoservice.save(producto);
		
	}
	
	
   @DeleteMapping("/producto/{id}")
   public void delete(@PathVariable Long id) {	
	   productoservice.deleteById(id);	
 	}
   
   // editarempleado
   @PutMapping("/producto/{id}")
   public Producto update(@RequestBody Producto producto , @PathVariable Long id) {
	   
	   Producto productoActual = productoservice.findById(id);
	   productoActual.setNombre(producto.getNombre());
	   productoActual.setDescripcion(producto.getDescripcion());
	   productoActual.setCosto(producto.getCosto());
	   productoActual.setStock(producto.getStock());
	
	   return productoservice.save(productoActual);
	   
   }
 	
}
