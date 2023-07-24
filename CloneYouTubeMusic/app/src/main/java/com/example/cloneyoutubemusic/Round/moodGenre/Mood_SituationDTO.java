package com.example.cloneyoutubemusic.Round.moodGenre;

import android.view.View;

import java.io.Serializable;

public class Mood_SituationDTO implements Serializable {

    public Mood_SituationDTO( String ms_text) {

        this.ms_text = ms_text;
    }

    public String getMs_view() {
        return ms_view;
    }

    public void setMs_view(String ms_view) {
        this.ms_view = ms_view;
    }

    public String getMs_text() {
        return ms_text;
    }

    public void setMs_text(String ms_text) {
        this.ms_text = ms_text;
    }

    private String ms_view, ms_text;
}
