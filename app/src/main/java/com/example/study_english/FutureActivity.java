
        package com.example.study_english;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FutureActivity extends AppCompatActivity {
    CardView future_simple;
    CardView future_continuous;
    CardView future_perfect;
    CardView future_perfect_continuous;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_future);
        future_simple = findViewById(R.id.future_simple);
        future_continuous = findViewById(R.id.future_continuous);
        future_perfect = findViewById(R.id.future_perfect);
        future_perfect_continuous = findViewById(R.id.future_perfect_continuous);
        Button button_back = findViewById(R.id.button_back);
             future_simple.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                   startActivity(new Intent(FutureActivity.this, Future_SimpleActivity .class));
                }
            });
             future_continuous.setOnClickListener(new View.OnClickListener() {
                 @Override
                public void onClick(View v) {
                   startActivity(new Intent(FutureActivity.this, Future_ContinuousActivity .class));
               }
             });
           future_perfect.setOnClickListener(new View.OnClickListener() {
             @Override
            public void onClick(View v) {
                startActivity(new Intent(FutureActivity.this,  Future_PerfectActivity.class));
              }
          });
          future_perfect_continuous.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                  startActivity(new Intent(FutureActivity.this, Future_Perf_ContActivity .class));
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