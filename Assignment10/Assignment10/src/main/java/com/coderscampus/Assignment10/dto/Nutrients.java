package com.coderscampus.Assignment10.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Nutrients {

	@JsonProperty("calories")
	private String calories;
	@JsonProperty("protein")
	private String protein;
	@JsonProperty("fat")
	private String fat;
	@JsonProperty("carbohydrates")
	private String carbohydrates;
	
	public String getCalories() {
		return calories;
	}
	public void setCalories(String calories) {
		this.calories = calories;
	}
	public String getProtein() {
		return protein;
	}
	public void setProtein(String protein) {
		this.protein = protein;
	}
	public String getFat() {
		return fat;
	}
	public void setFat(String fat) {
		this.fat = fat;
	}
	public String getCarbohydrates() {
		return carbohydrates;
	}
	public void setCarbohydrates(String carbohydrates) {
		this.carbohydrates = carbohydrates;
	}
	
}
