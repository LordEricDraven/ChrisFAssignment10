package com.coderscampus.Assignment10.spoonacular;

import java.net.URI;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.coderscampus.Assignment10.dto.DayResponse;
import com.coderscampus.Assignment10.dto.Meals;
import com.coderscampus.Assignment10.dto.Nutrients;
import com.coderscampus.Assignment10.dto.WeekResponse;

@Component
public class SpoonacularApplication {
	
	public DayResponse callSpoonacularDaily(String numCalories, String diet, String exclusions) {
		
		Double targetCalories = Double.parseDouble(numCalories);
		
		RestTemplate rt = new RestTemplate();
		
		URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
									  .queryParam("timeFrame", "day")
									  .queryParam("targetCalories", targetCalories)
									  .queryParam("diet", diet)
									  .queryParam("exclude", exclusions)
									  .queryParam("apiKey", "c937ef08a4f74ded9d92144d29ff740c")
									  .build()
									  .toUri();
		
		DayResponse response = rt.getForObject(uri, DayResponse.class);
		System.out.println("Meals: " + response.getMeals());
		System.out.println("Nutrients: " + response.getNutrients());
		return response;
	}
	
	public WeekResponse callSpoonacularWeekly(String numCalories, String diet, String exclusions) {
		
		Double targetCalories = Double.parseDouble(numCalories);
		
RestTemplate rt = new RestTemplate();
		
		URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
									  .queryParam("timeFrame", "week")
									  .queryParam("targetCalories", targetCalories)
									  .queryParam("diet", diet)
									  .queryParam("exclude", exclusions)
									  .queryParam("apiKey", "c937ef08a4f74ded9d92144d29ff740c")
									  .build()
									  .toUri();
		
		WeekResponse weekResponse = rt.getForObject(uri, WeekResponse.class);
		
//		System.out.println("Weekly Meal Plan:");
//		System.out.println("------------------");
//		System.out.println("Monday:");
//		if(response.getMonday() != null) {
//			printDay(response.getMonday());
//			System.out.println();
//		} else {
//			System.out.println("No data available for Monday");
//		}
//
//		System.out.println("Tuesday:");
//		if(response.getTuesday() != null) {
//			printDay(response.getTuesday());
//			System.out.println();
//		} else {
//			System.out.println("No data available for Tuesday");
//		}
//		
//		System.out.println("Wednesday:");
//		if(response.getWednesday() != null) {
//			printDay(response.getWednesday());
//			System.out.println();
//		} else {
//			System.out.println("No data available for Wednesday");
//		}
//		
//		System.out.println("Thursday:");
//		if(response.getThursday() != null) {
//			printDay(response.getThursday());
//			System.out.println();
//		} else {
//			System.out.println("No data available for Thursday");
//		}
//		
//		System.out.println("Friday:");
//		if(response.getFriday() != null) {
//			printDay(response.getFriday());
//			System.out.println();
//		} else {
//			System.out.println("No data available for Friday");
//		}
//		
//		System.out.println("Saturday:");
//		if(response.getSaturday() != null) {
//			printDay(response.getSaturday());
//			System.out.println();
//		} else {
//			System.out.println("No data available for Saturday");
//		}
//		
//		System.out.println("Sunday:");
//		if(response.getSunday() != null) {
//			printDay(response.getSunday());
//			System.out.println();
//		} else {
//			System.out.println("No data available for Sunday");
//		}
//
//		
		return weekResponse;
}

	private void printDay(DayResponse day) {
		System.out.println("Meals:");
		for(Meals meal : day.getMeals()) {
			System.out.println("- " + meal.getTitle());
			System.out.println(" Ready in minutes: " + meal.getReadyInMinutes());
			System.out.println(" Servings: " + meal.getServings());
			System.out.println(" Source URL: " + meal.getSourceUrl());
			System.out.println();
		}
		
		System.out.println("Nutrients:");
		Nutrients nutrients = day.getNutrients();
		System.out.println("- Calories: " + nutrients.getCalories());
		System.out.println("- Protein: " + nutrients.getProtein());
		System.out.println("- Fat: " + nutrients.getFat());
		System.out.println("- Carbohydrates: " + nutrients.getCarbohydrates());
	}
	
}
