package com.example.recyclerview.ui.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.recyclerview.databinding.ItemCountryBinding;
import com.example.recyclerview.ui.data.CountryCapitalData;

public class CountryAdapter extends ListAdapter<String, CountryAdapter.CountryViewHolder> {

    private final OnClickListener onClickListener;

    public CountryAdapter(OnClickListener onClickListener) {
        super(DIFF_CALLBACK);
        this.onClickListener = onClickListener;
    }

    private static final DiffUtil.ItemCallback<String> DIFF_CALLBACK = new DiffUtil.ItemCallback<String>() {
        @Override
        public boolean areItemsTheSame(@NonNull String oldItem, @NonNull String newItem) {
            return oldItem.equals(newItem);
        }

        @Override
        public boolean areContentsTheSame(@NonNull String oldItem, @NonNull String newItem) {
            return oldItem.equals(newItem);
        }
    };

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemCountryBinding binding = ItemCountryBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new CountryViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {
        holder.bind(getItem(position));
    }

    class CountryViewHolder extends RecyclerView.ViewHolder {
        private final ItemCountryBinding binding;

        CountryViewHolder(ItemCountryBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        void bind(String country) {
            binding.tvCountry.setText(country);
            String flagUrl = CountryCapitalData.getFlagUrlForCountry(country);
            Glide.with(binding.imgCountry.getContext())
                    .load(flagUrl)
                    .into(binding.imgCountry);
            binding.getRoot().setOnClickListener(v -> onClickListener.onClick(country));
        }
    }

    public interface OnClickListener {
        void onClick(String country);
    }
}
