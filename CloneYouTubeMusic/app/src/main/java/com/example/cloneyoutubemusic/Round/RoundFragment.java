package com.example.cloneyoutubemusic.Round;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cloneyoutubemusic.MainActivity;
import com.example.cloneyoutubemusic.R;
import com.example.cloneyoutubemusic.Round.chart.ChartFragment;
import com.example.cloneyoutubemusic.Round.moodGenre.MoodGenreFragment;
import com.example.cloneyoutubemusic.Round.recent.RecentFragment;
import com.example.cloneyoutubemusic.databinding.FragmentRoundBinding;
import com.example.cloneyoutubemusic.search.SearchFragment;

import java.util.ArrayList;


public class RoundFragment extends Fragment {

    FragmentRoundBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentRoundBinding.inflate(inflater, container, false);

        binding.search.setOnClickListener(v -> {
            MainActivity activity = (MainActivity) getActivity();
            activity.changeFragment(1 ,new SearchFragment());
        });

        binding.recvAlbum.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        binding.recvAlbum.setAdapter(new AdapterRoundAlbum(getlist(),getContext()));

        binding.recvTopsong.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        binding.recvTopsong.setAdapter(new AdapterTopSong(getContext()));

        binding.recvMoods.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        binding.recvMoods.setAdapter(new AdapterMoods());

        binding.recentMusic.setOnClickListener(v->{
            MainActivity activity = (MainActivity) getActivity();
            activity.changeFragment(1 ,new RecentFragment());
            //ntent intent = new Intent(requireContext(), RecentActivity.class);
            //startActivity(intent);
        });

        binding.chart.setOnClickListener(v->{
            MainActivity activity = (MainActivity) getActivity();
            activity.changeFragment(1 ,new ChartFragment());
        });

        binding.moodjang.setOnClickListener(v->{
            MainActivity activity = (MainActivity) getActivity();
            activity.changeFragment(1 ,new MoodGenreFragment());
        });


        return binding.getRoot();
    }

    ArrayList<AlbumDTO> getlist(){
        ArrayList<AlbumDTO> list = new ArrayList<>();
        list.add(new AlbumDTO(R.drawable.quick_stray, "제목", "가수"));
        list.add(new AlbumDTO(R.drawable.quick_paulkim, "제목1", "가수1"));
        list.add(new AlbumDTO(R.drawable.lucy, "제목2", "가수2"));
        list.add(new AlbumDTO(R.drawable.melomance, "제목3", "가수3"));



        return list;
    }





}