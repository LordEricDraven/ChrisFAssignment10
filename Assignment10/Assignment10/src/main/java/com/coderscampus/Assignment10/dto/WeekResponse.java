package com.coderscampus.Assignment10.dto;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeekResponse {
	
	@JsonProperty("week")
	private Map<String, Day> week;
	
	public Map<String, Day> getWeek(){
		return week;
	}
	
	public void setWeek(Map<String, Day>week) {
		this.week = week;
	}
	
	
//
//	@JsonProperty("monday")
//	private DayResponse monday;
//	@JsonProperty("tuesday")
//	private DayResponse tuesday;
//	@JsonProperty("wednesday")
//	private DayResponse wednesday;
//	@JsonProperty("thursday")
//	private DayResponse thursday;
//	@JsonProperty("friday")
//	private DayResponse friday;
//	@JsonProperty("saturday")
//	private DayResponse saturday;
//	@JsonProperty("sunday")
//	private DayResponse sunday;
//	
//	
//	public DayResponse getMonday() {
//		return monday;
//	}
//	public void setMonday(DayResponse monday) {
//		this.monday = monday;
//	}
//	public DayResponse getTuesday() {
//		return tuesday;
//	}
//	public void setTuestday(DayResponse tuesday) {
//		this.tuesday = tuesday;
//	}
//	public DayResponse getWednesday() {
//		return wednesday;
//	}
//	public void setWednesday(DayResponse wednesday) {
//		this.wednesday = wednesday;
//	}
//	public DayResponse getThursday() {
//		return thursday;
//	}
//	public void setThursday(DayResponse thursday) {
//		this.thursday = thursday;
//	}
//	public DayResponse getFriday() {
//		return friday;
//	}
//	public void setFriday(DayResponse friday) {
//		this.friday = friday;
//	}
//	public DayResponse getSaturday() {
//		return saturday;
//	}
//	public void setSaturday(DayResponse saturday) {
//		this.saturday = saturday;
//	}
//	public DayResponse getSunday() {
//		return sunday;
//	}
//	public void setSunday(DayResponse sunday) {
//		this.sunday = sunday;
//	}
//	@Override
//	public String toString() {
//		return "WeekResponse [monday=" + monday + ", tuesday=" + tuesday + ", wednesday=" + wednesday + ", thursday="
//				+ thursday + ", friday=" + friday + ", saturday=" + saturday + ", sunday=" + sunday + "]";
//	}
}
