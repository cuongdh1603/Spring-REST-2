package com.example.demo.repository;

import com.example.demo.model.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String>  {
	Iterable<Ingredient> findAll(); 
	Ingredient findById(String id); 
	Ingredient save(Ingredient ingredient); 
}
