package com.example.recyclerview.ui.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.example.recyclerview.R;
import com.example.recyclerview.databinding.FragmentCityBinding;

import java.util.HashMap;
import java.util.Map;

public class CityFragment extends Fragment {

    private FragmentCityBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentCityBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        String country = getArguments() != null ? getArguments().getString("Country") : "Country not specified";
        String capital = getArguments() != null ? getArguments().getString("Capital") : "Capital not available";
        String flagUrl = getArguments() != null ? getArguments().getString("FlagUrl") : "";

        binding.tvCity.setText("Capital of " + country + " is " + capital);

        assert flagUrl != null;
        if (!flagUrl.isEmpty()) {
            Glide.with(this)
                    .load(flagUrl)
                    .into(binding.imgCountry);
        }
    }
}