package com.coderscampus.Assignment10.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.Assignment10.dto.DayResponse;
import com.coderscampus.Assignment10.dto.WeekResponse;
import com.coderscampus.Assignment10.spoonacular.SpoonacularApplication;

@RestController
public class MealPlanController {

	
	@GetMapping("/mealplanner/week")
	public ResponseEntity<WeekResponse> getWeekMeals(String numCalories, String diet, String exclusions){
		
		SpoonacularApplication spoonacularApplication = new SpoonacularApplication();
		
		return spoonacularApplication.callSpoonacularWeekly(numCalories, diet, exclusions);
		
	}

	@GetMapping("/mealplanner/day")
	public ResponseEntity<DayResponse> getDayMeals(String numCalories, String diet, String exclusions){
		
		SpoonacularApplication spoonacularApplication = new SpoonacularApplication();
		
		return spoonacularApplication.callSpoonacularDaily(numCalories, diet, exclusions);
		
	}
}
