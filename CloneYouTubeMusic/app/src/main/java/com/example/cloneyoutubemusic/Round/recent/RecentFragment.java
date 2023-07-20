package com.example.cloneyoutubemusic.Round.recent;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cloneyoutubemusic.R;
import com.example.cloneyoutubemusic.databinding.FragmentRecentBinding;


public class RecentFragment extends Fragment {

    FragmentRecentBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentRecentBinding.inflate(inflater, container, false);

        binding.albumAndSingle.setAdapter(new RecentAdapter());
        binding.albumAndSingle.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        binding.musicVideo.setAdapter(new MusicVideoAdapter());
        binding.musicVideo.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        return binding.getRoot();
    }
}