package com.example.recyclerview.ui.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.recyclerview.R;
import com.example.recyclerview.databinding.FragmentCountryBinding;
import com.example.recyclerview.ui.adapter.CountryAdapter;
import com.example.recyclerview.ui.data.CountryCapitalData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountryFragment extends Fragment {

    private FragmentCountryBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentCountryBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        List<String> countries = getArguments() != null ? getArguments().getStringArrayList("Countries") : new ArrayList<>();

        CountryAdapter countryAdapter = new CountryAdapter(country -> {
            CityFragment cityFragment = new CityFragment();
            Bundle bundle = new Bundle();
            bundle.putString("Country", country);
            bundle.putString("Capital", getCapitalForCountry(country));
            cityFragment.setArguments(bundle);

            requireActivity().getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, cityFragment)
                    .addToBackStack(null)
                    .commit();
        });

        binding.rvCountry.setAdapter(countryAdapter);
        countryAdapter.submitList(countries);
    }

    private String getCapitalForCountry(String country) {
        return CountryCapitalData.getCapitalForCountry(country);
    }
}