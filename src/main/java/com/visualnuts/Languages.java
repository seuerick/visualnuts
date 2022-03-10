package com.visualnuts;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Languages {
	
	public static int countCountriesWorld(List<CountryLanguage> countryLanguages) {
		return countryLanguages.size();
	}
	
	public static CountryLanguage countryHighestOfficialLanguages(List<CountryLanguage> countryLanguages) {
		Map<String, List<CountryLanguage>> cl = countryLanguages.stream().collect(Collectors.groupingBy(CountryLanguage::getCountry));
		System.out.println(cl);
//		return countryLanguages.stream()
//				.max(Comparator.comparing(String::valueOf))
//				.get();
		return null;
	}
}
