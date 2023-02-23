package com.visualnuts;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Languages {
	
	public static int countCountriesWorld(List<CountryLanguage> countryLanguages) {
		return countryLanguages.size();
	}
	
	public static CountryLanguage countryMostOfficialLanguages(List<CountryLanguage> countryLanguages, String includedLanguage) {
		Map<String, List<CountryLanguage>> cl = countryLanguages.stream().collect(Collectors.groupingBy(CountryLanguage::getCountry));
//		return countryLanguages.stream()
//				.max(Comparator.comparing(String::valueOf))
//				.get();
		return null;
	}

	public static CountryLanguage countryMostOfficialLanguages(List<CountryLanguage> countryLanguages) {
		Map<String, List<CountryLanguage>> cl = countryLanguages.stream().collect(Collectors.groupingBy(CountryLanguage::getCountry));
		Map<String, Integer> sum = countryLanguages.stream().collect(Collectors.groupingBy(CountryLanguage::getCountry, Collectors.summingInt(CountryLanguage::getCountLanguages)));
		Map.Entry<String, Integer> maxEntry = sum.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).orElse(null);
		return cl.get(maxEntry.getKey()).get(0);
	}
}
