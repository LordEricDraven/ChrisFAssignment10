package com.coderscampus.Assignment10.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.Assignment10.dto.DayResponse;
import com.coderscampus.Assignment10.dto.WeekResponse;
import com.coderscampus.Assignment10.spoonacular.SpoonacularApplication;

@RestController
public class MealPlanController {

	
	@GetMapping("/mealplanner/week")
	public ResponseEntity<WeekResponse> getWeekMeals(@RequestParam(required = false)String numCalories, @RequestParam(required = false)String diet, @RequestParam(required = false)String exclusions){
		
		SpoonacularApplication spoonacularApplication = new SpoonacularApplication();
		
		return spoonacularApplication.callSpoonacularWeekly(numCalories, diet, exclusions);
		
	}

	@GetMapping("/mealplanner/day")
	public ResponseEntity<DayResponse> getDayMeals(@RequestParam(required = false)String numCalories, @RequestParam(required = false)String diet, @RequestParam(required = false)String exclusions){
		
		SpoonacularApplication spoonacularApplication = new SpoonacularApplication();
		
		return spoonacularApplication.callSpoonacularDaily(numCalories, diet, exclusions);
		
	}
}
