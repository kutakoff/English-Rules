package com.example.study_english;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class AlphabetActivity extends AppCompatActivity {
    private MediaPlayer alphabetSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_alphabet);

        Button button_back = findViewById(R.id.button_back);
        ImageView alfavit = findViewById(R.id.alfavit);

        alphabetSound = MediaPlayer.create(this, R.raw.alfavit_audio);
        alfavit.setOnClickListener(view -> soundPlay(alphabetSound));
        button_back.setOnClickListener(v -> onBackPressed());

        GeneralMethods.setViewSizeFromHeight(this, alfavit, 1.5);
    }

    public void soundPlay(MediaPlayer sound) {
        sound.start();
    }

    public void onBackPressed() {
        alphabetSound.stop();
        super.onBackPressed();
    }
}