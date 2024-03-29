package com.visualnuts;

import java.util.List;

public class CountryLanguage {
	
	private String country;
	
	private List<String> languages;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public List<String> getLanguages() {
		return languages;
	}

	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}
	
	public Integer getCountLanguages() {
		return languages.size();
	}
}
