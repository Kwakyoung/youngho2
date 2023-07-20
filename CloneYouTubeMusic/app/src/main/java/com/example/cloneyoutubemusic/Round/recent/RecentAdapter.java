package com.example.cloneyoutubemusic.Round.recent;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cloneyoutubemusic.Home.HomeAdapter;
import com.example.cloneyoutubemusic.databinding.ItemAlbumAndSingleBinding;
import com.example.cloneyoutubemusic.databinding.ItemHomeBinding;

public class RecentAdapter extends RecyclerView.Adapter<RecentAdapter.ViewHolder > {

    ItemAlbumAndSingleBinding binding;



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding = ItemAlbumAndSingleBinding.inflate(inflater,parent,false);

        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        ItemAlbumAndSingleBinding binding;

        public ViewHolder(@NonNull ItemAlbumAndSingleBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
