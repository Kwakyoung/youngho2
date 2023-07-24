package com.example.cloneyoutubemusic.Round.chart;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cloneyoutubemusic.databinding.ItemChartPopularSongBinding;

public class Chart_popular_songAdapter extends RecyclerView.Adapter<Chart_popular_songAdapter.ViewHolder> {

    ItemChartPopularSongBinding binding;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding = ItemChartPopularSongBinding.inflate(inflater,parent,false);

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

        ItemChartPopularSongBinding binding;

        public ViewHolder(@NonNull ItemChartPopularSongBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
