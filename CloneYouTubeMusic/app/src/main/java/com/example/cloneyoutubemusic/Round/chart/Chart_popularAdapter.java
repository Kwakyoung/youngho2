package com.example.cloneyoutubemusic.Round.chart;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cloneyoutubemusic.databinding.ItemChartPopularBinding;
import com.example.cloneyoutubemusic.databinding.ItemChartPopularSongBinding;

public class Chart_popularAdapter extends RecyclerView.Adapter<Chart_popularAdapter.ViewHolder>{

    ItemChartPopularBinding binding;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding = ItemChartPopularBinding.inflate(inflater,parent,false);

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

        ItemChartPopularBinding binding;

        public ViewHolder(@NonNull ItemChartPopularBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
