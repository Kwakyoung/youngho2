package com.example.cloneyoutubemusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.widget.Toast;

import com.example.cloneyoutubemusic.Home.HomeFragment;
import com.example.cloneyoutubemusic.Library.LibraryFragment;
import com.example.cloneyoutubemusic.Round.RoundFragment;
import com.example.cloneyoutubemusic.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    HomeFragment homeFragment = new HomeFragment() ;
    RoundFragment roundFragment = new RoundFragment() ;
    LibraryFragment libraryFragment =  new LibraryFragment() ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        FragmentManager manager = getSupportFragmentManager();

        manager.beginTransaction().replace(R.id.container, new HomeFragment()).commit();

        binding.bottomNavigation.setOnItemSelectedListener(item -> {
            Fragment fragment = null;
            if (item.getItemId()==R.id.tab1){
                fragment = homeFragment;

            } else if (item.getItemId()==R.id.tab2) {
                fragment = roundFragment;

            } else if (item.getItemId()==R.id.tab3) {
                fragment = libraryFragment;
            }else{
                return false;
            }

            if (fragment == null) {
                Toast.makeText(this, "아직 준비되지 않았습니다.", Toast.LENGTH_SHORT).show();
            }else {
                manager.beginTransaction().replace(R.id.container,fragment).commit();
            }
            return true;
        });

    }

    //1.RoundFragment =>  메인 액티비티에서 프래그먼트를 바꿈 => container
    //2.ChildFragment를 이용 . ( RoundFragment 내부에 있는 내용을 지우고 -> 자식 프래그먼트를 붙임 ) (귀찮음)
    int backPressed = 0;
    public void changeFragment(int backPressed, Fragment fragment){
        this.backPressed = backPressed;
        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
    }

    @Override
    public void onBackPressed() {
        if(backPressed==1){
            changeFragment(0 , roundFragment );
        }else if (backPressed==2){
            changeFragment(1 , homeFragment );
        }else if (backPressed==3) {
            changeFragment(2 , libraryFragment );
        }else {
            finish();
        }
    }


}