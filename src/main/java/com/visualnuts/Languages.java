package com.visualnuts;

import java.util.Comparator;
import java.util.List;

public class Languages {
	
	public static int countCountriesWorld(List<CountryLanguage> countryLanguages) {
		return countryLanguages.size();
	}
	
	public static CountryLanguage countryHighestOfficialLanguages(List<CountryLanguage> countryLanguages) {
		return countryLanguages.stream()
		.max(Comparator.comparing(String::valueOf))
		.get();
	}
}
