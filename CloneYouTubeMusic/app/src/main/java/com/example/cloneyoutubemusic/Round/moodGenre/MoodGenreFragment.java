package com.example.cloneyoutubemusic.Round.moodGenre;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import com.example.cloneyoutubemusic.R;
import com.example.cloneyoutubemusic.Round.chart.Chart_popular_songAdapter;
import com.example.cloneyoutubemusic.databinding.FragmentMoodGenreBinding;

import java.util.ArrayList;


public class MoodGenreFragment extends Fragment {

    FragmentMoodGenreBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMoodGenreBinding.inflate(inflater, container, false);
        binding.custom.setAdapter(new CustomAdapter());
//        Adapter adapter = new Mood_situationGridvAdapter();
        ArrayList<Mood_SituationDTO> list = getlist();
        binding.moodSituation.setAdapter(new Mood_situationGridvAdapter());


        return binding.getRoot();
    }

    ArrayList<Mood_SituationDTO> getlist(){
        ArrayList<Mood_SituationDTO> list = new ArrayList<>();
        list.add(new Mood_SituationDTO("시대별 음악"));
        list.add(new Mood_SituationDTO("슬픔"));
        list.add(new Mood_SituationDTO("사랑 노래"));
        list.add(new Mood_SituationDTO("연말연시"));
        list.add(new Mood_SituationDTO("출퇴근 & 등하교"));
        list.add(new Mood_SituationDTO("행복한 기분"));
        list.add(new Mood_SituationDTO("힘이 필요할때"));
        list.add(new Mood_SituationDTO("편안한 분위기"));



        return list;
    }

}