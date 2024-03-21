package com.coderscampus.Assignment10.spoonacular;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.coderscampus.Assignment10.dto.DayResponse;
import com.coderscampus.Assignment10.dto.WeekResponse;

public class SpoonacularApplication {

	
	public void callSpoonacularDaily(String numCalories, String diet, String exclusions) {
		
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
		System.out.println(response.getBody());
	}
	
	public void callSpoonacularWeekly(String numCalories, String diet, String exclusions) {
		
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
		
		WeekResponse response = rt.getForObject(uri, WeekResponse.class);
		System.out.println(response.getBody());
	}
	
}
