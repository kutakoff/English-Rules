package com.example.study_english;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
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
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_alfavit);
        if (getIntent().getBooleanExtra("EXIT", false)) { finish(); }
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

    public void onBackPressed_1() {
        new AlertDialog.Builder(this)
                .setMessage("Вы действительно хотите покинуть программу?")
                .setCancelable(false)
                .setPositiveButton("Да", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        finish();
                    }
                }).setNegativeButton("Нет", null).show();
    };


    public void onBackPressed() {
        alfavitSound.stop();
        super.onBackPressed();
    }

    public void quitApp(){ this.finishAffinity(); }

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
