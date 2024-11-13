package com.example.recyclerview.ui.data;

import java.util.HashMap;
import java.util.Map;

public class CountryCapitalData {
    public static String getCapitalForCountry(String country) {
        switch (country) {
            case "Nigeria": return "Abuja";
            case "Egypt": return "Cairo";
            case "South Africa": return "Pretoria";
            case "Kenya": return "Nairobi";
            case "Ethiopia": return "Addis Ababa";
            case "China": return "Beijing";
            case "India": return "New Delhi";
            case "Japan": return "Tokyo";
            case "South Korea": return "Seoul";
            case "Indonesia": return "Jakarta";
            case "Germany": return "Berlin";
            case "France": return "Paris";
            case "United Kingdom": return "London";
            case "Italy": return "Rome";
            case "Spain": return "Madrid";
            case "United States": return "Washington, D.C.";
            case "Canada": return "Ottawa";
            case "Mexico": return "Mexico City";
            case "Cuba": return "Havana";
            case "Guatemala": return "Guatemala City";
            case "Brazil": return "Brasília";
            case "Argentina": return "Buenos Aires";
            case "Colombia": return "Bogotá";
            case "Peru": return "Lima";
            case "Chile": return "Santiago";
            case "Australia": return "Canberra";
            case "New Zealand": return "Wellington";
            case "Fiji": return "Suva";
            case "Papua New Guinea": return "Port Moresby";
            case "Samoa": return "Apia";
            case "Antarctica": return "No capital";
            default: return "Capital not available";
        }
    }

//    // Статическая карта для хранения стран и их столиц
//    private static final Map<String, String> countryCapitalMap = new HashMap<>();
//
//    static {
//        // Заполнение карты стран и столиц
//        countryCapitalMap.put("Nigeria", "Abuja");
//        countryCapitalMap.put("Egypt", "Cairo");
//        countryCapitalMap.put("South Africa", "Pretoria");
//        countryCapitalMap.put("Kenya", "Nairobi");
//        countryCapitalMap.put("Ethiopia", "Addis Ababa");
//        countryCapitalMap.put("China", "Beijing");
//        countryCapitalMap.put("India", "New Delhi");
//        countryCapitalMap.put("Japan", "Tokyo");
//        countryCapitalMap.put("South Korea", "Seoul");
//        countryCapitalMap.put("Indonesia", "Jakarta");
//        countryCapitalMap.put("Germany", "Berlin");
//        countryCapitalMap.put("France", "Paris");
//        countryCapitalMap.put("United Kingdom", "London");
//        countryCapitalMap.put("Italy", "Rome");
//        countryCapitalMap.put("Spain", "Madrid");
//        countryCapitalMap.put("United States", "Washington, D.C.");
//        countryCapitalMap.put("Canada", "Ottawa");
//        countryCapitalMap.put("Mexico", "Mexico City");
//        countryCapitalMap.put("Cuba", "Havana");
//        countryCapitalMap.put("Guatemala", "Guatemala City");
//        countryCapitalMap.put("Brazil", "Brasília");
//        countryCapitalMap.put("Argentina", "Buenos Aires");
//        countryCapitalMap.put("Colombia", "Bogotá");
//        countryCapitalMap.put("Peru", "Lima");
//        countryCapitalMap.put("Chile", "Santiago");
//        countryCapitalMap.put("Australia", "Canberra");
//        countryCapitalMap.put("New Zealand", "Wellington");
//        countryCapitalMap.put("Fiji", "Suva");
//        countryCapitalMap.put("Papua New Guinea", "Port Moresby");
//        countryCapitalMap.put("Samoa", "Apia");
//        countryCapitalMap.put("Antarctica", "No capital");
//    }
//
//    // Метод для получения столицы по названию страны
//    public static String getCapitalForCountry(String country) {
//        return countryCapitalMap.getOrDefault(country, "Capital not available");
//    }
}