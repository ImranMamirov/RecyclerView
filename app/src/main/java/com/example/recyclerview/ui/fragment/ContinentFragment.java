package com.example.recyclerview.ui.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.recyclerview.R;
import com.example.recyclerview.databinding.FragmentContinentBinding;
import com.example.recyclerview.ui.adapter.ContinentAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContinentFragment extends Fragment {

    private FragmentContinentBinding binding;
    private ContinentAdapter continentAdapter;

    private final Map<String, List<String>> countriesByContinent = new HashMap<String, List<String>>() {{
        put("Africa", Arrays.asList("Nigeria", "Egypt", "South Africa", "Kenya", "Ethiopia"));
        put("Asia", Arrays.asList("China", "India", "Japan", "South Korea", "Indonesia"));
        put("Europe", Arrays.asList("Germany", "France", "United Kingdom", "Italy", "Spain"));
        put("North America", Arrays.asList("United States", "Canada", "Mexico", "Cuba", "Guatemala"));
        put("South America", Arrays.asList("Brazil", "Argentina", "Colombia", "Peru", "Chile"));
        put("Australia", Arrays.asList("Australia", "New Zealand", "Fiji", "Papua New Guinea", "Samoa"));
        put("Antarctica", Arrays.asList("Research Station 1", "Research Station 2", "Research Station 3", "Research Station 4", "Research Station 5"));
    }};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentContinentBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        continentAdapter = new ContinentAdapter(continent -> {
            CountryFragment countryFragment = new CountryFragment();
            Bundle bundle = new Bundle();

            bundle.putString("Continent", continent);
            bundle.putStringArrayList("Countries", new ArrayList<>(countriesByContinent.get(continent)));
            countryFragment.setArguments(bundle);

            requireActivity().getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, countryFragment)
                    .addToBackStack(null)
                    .commit();
        });

        binding.rvContinent.setAdapter(continentAdapter);

        List<String> continents = Arrays.asList("Africa", "Asia", "Europe", "North America", "South America", "Australia", "Antarctica");
        continentAdapter.submitList(continents);
    }
}