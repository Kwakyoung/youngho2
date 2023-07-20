package com.example.cloneyoutubemusic.search;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cloneyoutubemusic.Home.HomeFragment;
import com.example.cloneyoutubemusic.MainActivity;
import com.example.cloneyoutubemusic.R;
import com.example.cloneyoutubemusic.databinding.FragmentSearchBinding;

import java.util.ArrayList;


public class SearchFragment extends Fragment {

    FragmentSearchBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSearchBinding.inflate(inflater,container,false);

        binding.imgvBack.setOnClickListener(v -> {
            MainActivity activity = (MainActivity) getActivity();
            activity.changeFragment(2 ,new HomeFragment());
        });

        binding.recvHistory.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        binding.recvHistory.setAdapter(new SearchAdapter(getContext(),getlist()));



        binding.edt.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (keyCode == KeyEvent.KEYCODE_ENTER && event.getAction() == KeyEvent.ACTION_UP) {
                    // 엔터 키가 눌렸을 때 클릭 이벤트를 처리
                    v.performClick();
                    binding.recvHistoryText.setLayoutManager(new LinearLayoutManager(getContext()));
                    binding.recvHistoryText.setAdapter(new SearchHistroyAdapter(gettxt(),getContext()));
                    return true;
                }
                return false;
            }
        });



        return binding.getRoot();
    }

    ArrayList<SearchVO> getlist(){
        ArrayList<SearchVO> list = new ArrayList<>();
        list.add(new SearchVO(R.drawable.newjeans_supershy,"Super Shy","New Jeans"));
        list.add(new SearchVO(R.drawable.lucy,"히어로","루시"));
        list.add(new SearchVO(R.drawable.quick_stray,"이름엄청긴거입니다아아아아아아아","ㅋㅋ"));

        return list;
    }

    ArrayList<SearchHistoryVO> gettxt(){
        ArrayList<SearchHistoryVO> list = new ArrayList<>();
        list.add(new SearchHistoryVO(binding.edt.getText().toString()));

        return list;
    }
}