package com.coronaVirusTracker.Beans;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Country {
	
	private String id;
	private String country;
	private String countrycode;
	private String slug;
	private String newconfirmed;
	private String totalconfirmed;
	private String newdeaths;
	private String totaldeaths;
	private String newrecovered;
	private String totalrecovered;
	private String date;
	@JsonIgnore
	private List<Object> premium;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCountrycode() {
		return countrycode;
	}
	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}
	public String getSlug() {
		return slug;
	}
	public void setSlug(String slug) {
		this.slug = slug;
	}
	public String getNewconfirmed() {
		return newconfirmed;
	}
	public void setNewconfirmed(String newconfirmed) {
		this.newconfirmed = newconfirmed;
	}
	public String getTotalconfirmed() {
		return totalconfirmed;
	}
	public void setTotalconfirmed(String totalconfirmed) {
		this.totalconfirmed = totalconfirmed;
	}
	public String getNewdeaths() {
		return newdeaths;
	}
	public void setNewdeaths(String newdeaths) {
		this.newdeaths = newdeaths;
	}
	public String getTotaldeaths() {
		return totaldeaths;
	}
	public void setTotaldeaths(String totaldeaths) {
		this.totaldeaths = totaldeaths;
	}
	public String getNewrecovered() {
		return newrecovered;
	}
	public void setNewrecovered(String newrecovered) {
		this.newrecovered = newrecovered;
	}
	public String getTotalrecovered() {
		return totalrecovered;
	}
	public void setTotalrecovered(String totalrecovered) {
		this.totalrecovered = totalrecovered;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public List<Object> getPremium() {
		return premium;
	}
	public void setPremium(List<Object> premium) {
		this.premium = premium;
	}
	@Override
	public String toString() {
		return "Country [id=" + id + ", country=" + country + ", countrycode=" + countrycode + ", slug=" + slug
				+ ", newconfirmed=" + newconfirmed + ", totalconfirmed=" + totalconfirmed + ", newdeaths=" + newdeaths
				+ ", totaldeaths=" + totaldeaths + ", newrecovered=" + newrecovered + ", totalrecovered="
				+ totalrecovered + ", date=" + date + ", premium=" + premium + "]";
	}
	
	
	
	
	
}
