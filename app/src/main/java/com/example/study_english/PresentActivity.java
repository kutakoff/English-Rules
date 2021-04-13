package com.example.study_english;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PresentActivity extends AppCompatActivity {
CardView present_simple;
CardView present_continuous;
CardView present_perfect;
CardView present_perfect_continuous;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_present);
        Button button_back = findViewById(R.id.button_back);
        present_continuous = findViewById(R.id.present_continuous);
        present_perfect = findViewById(R.id.present_perfect);
        present_simple = findViewById(R.id.present_simple);
        present_perfect_continuous = findViewById(R.id.present_perfect_continuous);
        present_simple.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View v) {
                startActivity(new Intent(PresentActivity.this,Present_SimpleActivity .class));
            }
        });
           present_continuous.setOnClickListener(new View.OnClickListener() {
              @Override
             public void onClick(View v) {
                startActivity(new Intent(PresentActivity.this, Present_ContinuousActivity.class));
             }
          });
          present_perfect.setOnClickListener(new View.OnClickListener() {
             @Override
              public void onClick(View v) {
                 startActivity(new Intent(PresentActivity.this, Present_PerfectActivity.class));
             }
           });
          // present_perfect_continuous.setOnClickListener(new View.OnClickListener() {
        //        @Override
        //    public void onClick(View v) {
        //        startActivity(new Intent(PresentActivity.this, название класса.class));
        //     }
        //  });
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}