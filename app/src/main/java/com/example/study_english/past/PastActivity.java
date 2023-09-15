package com.example.study_english.past;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.Button;
import android.widget.GridLayout;

import com.example.study_english.GeneralMethods;
import com.example.study_english.R;

public class PastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_past);

        GridLayout pastMainGrid = findViewById(R.id.pastMainGrid);
        Button button_back = findViewById(R.id.button_back);
        CardView past_simple = findViewById(R.id.past_simple);
        CardView past_continuous = findViewById(R.id.past_continuous);
        CardView past_perfect = findViewById(R.id.past_perfect);
        CardView past_perfect_continuous = findViewById(R.id.past_perfect_continuous);

        past_simple.setOnClickListener(v -> startActivity(new Intent(PastActivity.this, Past_SimpleActivity.class)));
        past_continuous.setOnClickListener(v -> startActivity(new Intent(PastActivity.this, Past_ContinuousActivity.class)));
        past_perfect.setOnClickListener(v -> startActivity(new Intent(PastActivity.this, Past_PerfectActivity.class)));
        past_perfect_continuous.setOnClickListener(v -> startActivity(new Intent(PastActivity.this, Past_Perf_ContActivity.class)));
        button_back.setOnClickListener(v -> onBackPressed());

        GeneralMethods.setViewSizeFromHeight(this, pastMainGrid, 1.5);
    }
}