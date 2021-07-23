package com.coronaVirusTracker.Beans;

import java.util.List;

public class DataBean {
	
	private String id;
	private String message;
	private Global global;
	private List<Country> countries;
	private String date;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Global getGlobal() {
		return global;
	}
	public void setGlobal(Global global) {
		this.global = global;
	}
	public List<Country> getCountries() {
		return countries;
	}
	public void setCountries(List<Country> countries) {
		this.countries = countries;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "DataBean [id=" + id + ", message=" + message + ", global=" + global + ", countries=" + countries
				+ ", date=" + date + "]";
	}
	
	
}
