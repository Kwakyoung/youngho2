package com.example.cloneyoutubemusic.Round.chart;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cloneyoutubemusic.databinding.ItemChartPopularMvBinding;
import com.example.cloneyoutubemusic.databinding.ItemChartPopularSongBinding;

public class Chart_popular_mvAdapter extends RecyclerView.Adapter<Chart_popular_mvAdapter.ViewHolder> {

    ItemChartPopularMvBinding binding;
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding = ItemChartPopularMvBinding.inflate(inflater,parent,false);

        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ItemChartPopularMvBinding binding;

        public ViewHolder(@NonNull ItemChartPopularMvBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
