package com.shawn.springrestjson.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Organizations {

    private String organization;
    private int release_count;
    private Long total_labor_hours;
    private boolean all_in_production;
    private String licenses;
    private Integer[] most_active_months;

    public Organizations() {
		// TODO Auto-generated constructor stub
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public int getRelease_count() {
		return release_count;
	}

	public void setRelease_count(int release_count) {
		this.release_count = release_count;
	}

	public Long getTotal_labor_hours() {
		return total_labor_hours;
	}

	public void setTotal_labor_hours(Long total_labor_hours) {
		this.total_labor_hours = total_labor_hours;
	}

	public boolean isAll_in_production() {
		return all_in_production;
	}

	public void setAll_in_production(boolean all_in_production) {
		this.all_in_production = all_in_production;
	}

	public String getLicenses() {
		return licenses;
	}

	public void setLicenses(String licenses) {
		this.licenses = licenses;
	}

	public Integer[] getMost_active_months() {
		return most_active_months;
	}

	public void setMost_active_months(Integer[] most_active_months) {
		this.most_active_months = most_active_months;
	}
    
   
}
