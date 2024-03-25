package com.coderscampus.Assignment10.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DayResponse {

	@JsonProperty("meals")
	private Meals meals;
	@JsonProperty("nutrients")
	private Nutrients nutrients;
	
	public Meals getMeals() {
		return meals;
	}
	public void setMeals(Meals meals) {
		this.meals = meals;
	}
	public Nutrients getNutrients() {
		return nutrients;
	}
	public void setNutrients(Nutrients nutrients) {
		this.nutrients = nutrients;
	}
	
	
}
