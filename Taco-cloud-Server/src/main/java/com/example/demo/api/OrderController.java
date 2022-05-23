package com.example.demo.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/order", produces = "application/json")
@CrossOrigin(origins = "*")
public class OrderController {
	@PutMapping("/{ingredientId}") 
	public Order putIngredient(@RequestBody Ingredient ingredient) { 
		return ingredientRepo.save(ingredient); 
	} 
}
