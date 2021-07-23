package com.coronaVirusTracker.Beans;

public class Global {
	
	private String newconfirmed;
	private String totalconfirmed;
	private String newdeaths;
	private String totaldeaths;
	private String newrecovered;
	private String totalrecovered;
	private String date;
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
	@Override
	public String toString() {
		return "Global [newconfirmed=" + newconfirmed + ", totalconfirmed=" + totalconfirmed + ", newdeaths="
				+ newdeaths + ", totaldeaths=" + totaldeaths + ", newrecovered=" + newrecovered + ", totalrecovered="
				+ totalrecovered + ", date=" + date + "]";
	}
	
	
	
	
	
	
}
