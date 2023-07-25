package com.example.cloneyoutubemusic.Round.moodGenre;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.cloneyoutubemusic.databinding.ItemCustomBinding;
import com.example.cloneyoutubemusic.databinding.ItemMoodSituationBinding;
import com.example.cloneyoutubemusic.databinding.ItemMoodsBinding;

public class Mood_situationGridvAdapter extends BaseAdapter {

    LayoutInflater inflater;

    Context context;

    @Override
    public int getCount() {
        return 10;
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
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        ItemMoodSituationBinding binding = ItemMoodSituationBinding.inflate(inflater, parent, false);


    //화이팅!

        return binding.getRoot();
    }

    public class GridViewHolder {
        ItemMoodSituationBinding binding;

        public GridViewHolder(ItemMoodSituationBinding binding) {
            this.binding = binding;
        }

        public void bind() {

        }
    }
}
