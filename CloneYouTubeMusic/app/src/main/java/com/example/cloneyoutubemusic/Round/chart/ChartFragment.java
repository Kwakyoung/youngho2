package com.example.cloneyoutubemusic.Round.chart;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cloneyoutubemusic.databinding.FragmentChartBinding;


public class ChartFragment extends Fragment {

    FragmentChartBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       binding = FragmentChartBinding.inflate(inflater, container, false);

        binding.chartPopularSong.setAdapter(new Chart_popular_songAdapter());
        binding.chartPopularSong.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        binding.chartPopularMv.setAdapter(new Chart_popular_mvAdapter());
        binding.chartPopularMv.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        binding.chartPopularArtist.setAdapter(new Chart_popular_artistAdapter());
        binding.chartPopularArtist.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        binding.chartPopular.setAdapter(new Chart_popularAdapter());
        binding.chartPopular.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));

        return binding.getRoot();
    }
}