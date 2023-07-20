package com.example.cloneyoutubemusic.search;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cloneyoutubemusic.databinding.ItemSearchHistoryBinding;

import java.util.ArrayList;

public class SearchHistroyAdapter extends RecyclerView.Adapter<SearchHistroyAdapter.ViewHolder>{
    ArrayList<SearchHistoryVO> list;
    Context context;
    ItemSearchHistoryBinding binding;

    public SearchHistroyAdapter(ArrayList<SearchHistoryVO> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding = ItemSearchHistoryBinding.inflate(inflater,parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.binding.tvTest.setText(list.get(position).getTxt());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemSearchHistoryBinding binding;
        public ViewHolder(@NonNull ItemSearchHistoryBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
