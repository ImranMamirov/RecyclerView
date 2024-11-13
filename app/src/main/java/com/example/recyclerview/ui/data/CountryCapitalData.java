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

    public static String getFlagUrlForCountry(String country) {
        switch (country) {
            case "Nigeria": return "https://www.worldometers.info/img/flags/small/tn_ni-flag.gif";
            case "Egypt": return "https://www.worldometers.info/img/flags/small/tn_eg-flag.gif";
            case "South Africa": return "https://www.worldometers.info/img/flags/small/tn_sf-flag.gif";
            case "Kenya": return "https://www.worldometers.info/img/flags/small/tn_ke-flag.gif";
            case "Ethiopia": return "https://www.worldometers.info/img/flags/small/tn_et-flag.gif";
            case "China": return "https://www.worldometers.info/img/flags/small/tn_ch-flag.gif";
            case "India": return "https://www.worldometers.info/img/flags/small/tn_in-flag.gif";
            case "Japan": return "https://www.worldometers.info/img/flags/small/tn_ja-flag.gif";
            case "South Korea": return "https://www.worldometers.info/img/flags/small/tn_ks-flag.gif";
            case "Indonesia": return "https://www.worldometers.info/img/flags/small/tn_id-flag.gif";
            case "Germany": return "https://www.worldometers.info/img/flags/gm-flag.gif";
            case "France": return "https://www.worldometers.info/img/flags/small/tn_fr-flag.gif";
            case "United Kingdom": return "https://www.worldometers.info/img/flags/small/tn_uk-flag.gif";
            case "Italy": return "https://www.worldometers.info/img/flags/small/tn_it-flag.gif";
            case "Spain": return "https://www.worldometers.info/img/flags/small/tn_sp-flag.gif";
            case "United States": return "https://www.worldometers.info/img/flags/small/tn_us-flag.gif";
            case "Canada": return "https://www.worldometers.info/img/flags/small/tn_ca-flag.gif";
            case "Mexico": return "https://www.worldometers.info/img/flags/small/tn_mx-flag.gif";
            case "Cuba": return "https://www.worldometers.info/img/flags/small/tn_cu-flag.gif";
            case "Guatemala": return "https://www.worldometers.info/img/flags/small/tn_gt-flag.gif";
            case "Brazil": return "https://www.worldometers.info/img/flags/small/tn_br-flag.gif";
            case "Argentina": return "https://www.worldometers.info/img/flags/small/tn_ar-flag.gif";
            case "Colombia": return "https://www.worldometers.info/img/flags/small/tn_co-flag.gif";
            case "Peru": return "https://www.worldometers.info/img/flags/small/tn_pe-flag.gif";
            case "Chile": return "https://www.worldometers.info/img/flags/small/tn_ci-flag.gif";
            case "Australia": return "https://www.worldometers.info/img/flags/small/tn_as-flag.gif";
            case "New Zealand": return "https://www.worldometers.info/img/flags/small/tn_nz-flag.gif";
            case "Fiji": return "https://www.worldometers.info/img/flags/small/tn_fj-flag.gif";
            case "Papua New Guinea": return "https://www.worldometers.info/img/flags/small/tn_pp-flag.gif";
            case "Samoa": return "https://www.worldometers.info/img/flags/small/tn_ws-flag.gif";
            case "Antarctica": return "https://example.com/flags/antarctica.png";
            default: return "https://example.com/flags/default.png";
        }
    }
}