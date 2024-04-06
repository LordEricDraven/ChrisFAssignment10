package com.coderscampus.Assignment10.spoonacular;

import java.net.URI;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.coderscampus.Assignment10.dto.DayResponse;
import com.coderscampus.Assignment10.dto.WeekResponse;

@Service
public class SpoonacularApplication {

	
	public ResponseEntity<DayResponse> callSpoonacularDaily(@RequestParam(required = false)String numCalories, @RequestParam(required = false)String diet, @RequestParam(required = false)String exclusions) {
		
		Optional<?> targetCalories;
		
		if (numCalories != null) {
			targetCalories = Optional.of(Double.parseDouble(numCalories));
		}else {
			targetCalories = null;
		}
		
		
		RestTemplate rt = new RestTemplate();
		
		URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
									  .queryParam("timeFrame", "day")
									  .queryParamIfPresent("targetCalories", Optional.ofNullable(targetCalories))
									  .queryParamIfPresent("diet", Optional.ofNullable(diet))
									  .queryParamIfPresent("exclude", Optional.ofNullable(exclusions))
									  .queryParam("apiKey", "c937ef08a4f74ded9d92144d29ff740c")
									  .build()
									  .toUri();
		
		ResponseEntity<DayResponse> response = rt.getForEntity(uri, DayResponse.class);
		System.out.println(response.getBody());
		return response;
	}
	
	public ResponseEntity<WeekResponse> callSpoonacularWeekly(@RequestParam(required = false)String numCalories, @RequestParam(required = false)String diet, @RequestParam(required = false)String exclusions) {
		
		Double targetCalories;
		
		if(numCalories != null) {
			targetCalories = Double.parseDouble(numCalories);
		}else {
			targetCalories = null;
		}
		
		RestTemplate rt = new RestTemplate();
		
		URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
									  .queryParam("timeFrame", "week")
									  .queryParamIfPresent("targetCalories", Optional.ofNullable(targetCalories))
									  .queryParamIfPresent("diet", Optional.ofNullable(diet))
									  .queryParamIfPresent("exclude", Optional.ofNullable(exclusions))
									  .queryParam("apiKey", "c937ef08a4f74ded9d92144d29ff740c")
									  .build()
									  .toUri();
		
		ResponseEntity<WeekResponse> response = rt.getForEntity(uri, WeekResponse.class);
		System.out.println(response.getBody());
		return response;
	}
}
