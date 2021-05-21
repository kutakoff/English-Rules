package com.example.study_english;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PastActivity extends AppCompatActivity {
    CardView past_simple;
    CardView past_continuous;
    CardView past_perfect;
    CardView past_perfect_continuous;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_past);
        Button button_back = findViewById(R.id.button_back);
        past_simple = findViewById(R.id.past_simple);
        past_continuous = findViewById(R.id.past_continuous);
        past_perfect = findViewById(R.id.past_perfect);
        past_perfect_continuous = findViewById(R.id.past_perfect_continuous);
        past_simple.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                   startActivity(new Intent(PastActivity.this, Past_SimpleActivity.class));
              }
             });
              past_continuous.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                    startActivity(new Intent(PastActivity.this, Past_ContinuousActivity.class));
                 }
            });
              past_perfect.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                  startActivity(new Intent(PastActivity.this,  Past_PerfectActivity.class));
              }
           });
           past_perfect_continuous.setOnClickListener(new View.OnClickListener() {
             @Override
            public void onClick(View v) {
                startActivity(new Intent(PastActivity.this, Past_Perf_ContActivity .class));
             }
          });
         button_back.setOnClickListener(new View.OnClickListener() {
          @Override
            public void onClick(View v) {
               onBackPressed();
            }
        });
    }
}