package com.coderscampus.Assignment10.web;

import org.springframework.http.HttpStatus;
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
	public ResponseEntity<WeekResponse> getWeekMeals(@RequestParam String numCalories, @RequestParam String diet, @RequestParam String exclusions){
		
		SpoonacularApplication spoonacularApplication = new SpoonacularApplication();
		
		WeekResponse weekResponse = spoonacularApplication.callSpoonacularWeekly(numCalories, diet, exclusions);
		
		return new ResponseEntity<>(weekResponse, HttpStatus.OK);
		
	}

	@GetMapping("/mealplanner/day")
	public ResponseEntity<DayResponse> getDayMeals(@RequestParam String numCalories, @RequestParam String diet, @RequestParam String exclusions){
		
		SpoonacularApplication spoonacularApplication = new SpoonacularApplication();
		
		DayResponse dayResponse = spoonacularApplication.callSpoonacularDaily(numCalories, diet, exclusions);
		
		return new ResponseEntity<>(dayResponse, HttpStatus.OK);
		
	}
	
	
}
