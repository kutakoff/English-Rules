package com.example.study_english;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class alfavitActivity extends AppCompatActivity {

    private ImageView alfavit;
    private MediaPlayer alfavitSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alfavit);
        Button button_back = findViewById(R.id.button_back);
        alfavit = findViewById(R.id.alfavit);
        alfavitSound = MediaPlayer.create(this, R.raw.alfavit_audio);
        imageClick();
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    @Override
    public void onBackPressed() {
        alfavitSound.stop();
        super.onBackPressed();
    }



    public void imageClick() {
        alfavit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPlay(alfavitSound);
            }
        });
    }
    public void soundPlay(MediaPlayer sound) {
        sound.start();
    }
}
