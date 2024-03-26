package com.coderscampus.Assignment10.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.coderscampus.Assignment10.dto.DayResponse;
import com.coderscampus.Assignment10.dto.WeekResponse;
import com.coderscampus.Assignment10.spoonacular.SpoonacularApplication;

@Repository
public class SpoonacularRepository {

	@Autowired
	private SpoonacularApplication spoonacularApp;
	
	private ResponseEntity<WeekResponse> weekResponse;
	private ResponseEntity<DayResponse> dayResponse;
	
	public ResponseEntity<ResponseEntity<WeekResponse>> getWeekResponse(String targetCalories, String diet, String exclude){
		weekResponse = spoonacularApp.callSpoonacularWeekly(targetCalories, diet, exclude);
		return ResponseEntity.ok(weekResponse);
	}
	
	public ResponseEntity<ResponseEntity<DayResponse>> getDayResponse(String targetCalories, String diet, String exclude){
		dayResponse = spoonacularApp.callSpoonacularDaily(targetCalories, diet, exclude);
		return ResponseEntity.ok(dayResponse);
	}
}
