package tacos.web.api.repository;

import tacos.web.api.model.Ingredient;

public interface IngredientRepository {
	Iterable<Ingredient> findAll(); 
	Ingredient findById(String id); 
	Ingredient save(Ingredient ingredient);
}