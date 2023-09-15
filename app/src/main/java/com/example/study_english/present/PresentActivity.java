package com.example.study_english.present;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.Button;
import android.widget.GridLayout;

import com.example.study_english.GeneralMethods;
import com.example.study_english.R;

public class PresentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_present);

        Button button_back = findViewById(R.id.button_back);
        CardView present_continuous = findViewById(R.id.present_continuous);
        CardView present_perfect = findViewById(R.id.present_perfect);
        CardView present_simple = findViewById(R.id.present_simple);
        CardView present_perfect_continuous = findViewById(R.id.present_perfect_continuous);
        GridLayout presentMainGrid = findViewById(R.id.presentMainGrid);

        present_simple.setOnClickListener(v -> startActivity(new Intent(PresentActivity.this, Present_SimpleActivity.class)));
        present_continuous.setOnClickListener(v -> startActivity(new Intent(PresentActivity.this, Present_ContinuousActivity.class)));
        present_perfect.setOnClickListener(v -> startActivity(new Intent(PresentActivity.this, Present_PerfectActivity.class)));
        present_perfect_continuous.setOnClickListener(v -> startActivity(new Intent(PresentActivity.this, Present_Perf_ContActivity.class)));
        button_back.setOnClickListener(v -> onBackPressed());

        GeneralMethods.setViewSizeFromHeight(this, presentMainGrid, 1.5);
    }
}