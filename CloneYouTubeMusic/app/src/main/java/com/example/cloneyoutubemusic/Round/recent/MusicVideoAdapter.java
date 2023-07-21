package com.example.cloneyoutubemusic.Round.recent;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cloneyoutubemusic.Home.HomeAdapter;
import com.example.cloneyoutubemusic.databinding.ItemHomeBinding;
import com.example.cloneyoutubemusic.databinding.ItemMusicvideoBinding;

public class MusicVideoAdapter extends RecyclerView.Adapter<MusicVideoAdapter.ViewHolder > {

    ItemMusicvideoBinding binding;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding = ItemMusicvideoBinding.inflate(inflater,parent,false);

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

        ItemMusicvideoBinding binding;

        public ViewHolder(@NonNull ItemMusicvideoBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }
}
