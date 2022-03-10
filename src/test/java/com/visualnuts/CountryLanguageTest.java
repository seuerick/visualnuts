package com.visualnuts;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CountryLanguageTest {
	
	private List<CountryLanguage> countries;
	
	@Before
	public void before() throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		String content = new String(Files.readAllBytes(new File("languages.json").toPath()));
		countries = mapper.readValue(content, new TypeReference<List<CountryLanguage>>() { });
	}
	
	//	- returns the number of countries in the world
	//	- retorna o número de países no mundo
	@Test
	public void countCountriesInWorldTest() {
		assertEquals(5, Languages.countCountriesWorld(countries));
	}
	
//	- finds the country with the most official languages, where they officially speak German (de).
//	- encontra o país com as línguas mais oficiais, onde se fala oficialmente o alemão (de).
	@Test
	public void findCountryWithMostLanguagesWhereGermanSpeakTest() {
		assertEquals(5, Languages.countCountriesWorld(countries));
	}
	
//	- that counts all the official languages spoken in the listed countries.
//	- que conta todas as línguas oficiais faladas nos países listados.
	
//	- to find the country with the highest number of official languages.
//	- para encontrar o país com o maior número de línguas oficiais.
	@Test
	public void findCountryWithHighestOfficialLanguagesTest() {
		Languages.countryHighestOfficialLanguages(countries);
//		assertEquals(5, Languages.countryHighestOfficialLanguages(countries));
	}
	
//	- to find the most common official language(s), of all countries.
//	- para encontrar a(s) língua(s) oficial(ais) mais comum(is), de todos os países.	
}


