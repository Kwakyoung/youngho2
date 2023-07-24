package com.example.cloneyoutubemusic.Round.moodGenre;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.cloneyoutubemusic.databinding.ItemCustomBinding;

public class CustomAdapter extends BaseAdapter {

    LayoutInflater inflater;

    @Override
    public int getCount() {
        return 6;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View v, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        ItemCustomBinding binding = ItemCustomBinding.inflate(inflater, parent, false);



        return binding.getRoot();
    }

    public class GridViewHolder {
        ItemCustomBinding binding;

        public GridViewHolder(ItemCustomBinding binding) {
            this.binding = binding;
        }

        public void bind() {

        }
    }
}
