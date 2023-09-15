package com.example.study_english.future;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.Button;
import android.widget.GridLayout;

import com.example.study_english.GeneralMethods;
import com.example.study_english.R;

public class FutureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_future);

        GridLayout futureMainGrid = findViewById(R.id.futureMainGrid);
        CardView future_simple = findViewById(R.id.future_simple);
        CardView future_continuous = findViewById(R.id.future_continuous);
        CardView future_perfect = findViewById(R.id.future_perfect);
        CardView future_perfect_continuous = findViewById(R.id.future_perfect_continuous);
        Button button_back = findViewById(R.id.button_back);

        future_simple.setOnClickListener(v -> startActivity(new Intent(FutureActivity.this, Future_SimpleActivity.class)));
        future_continuous.setOnClickListener(v -> startActivity(new Intent(FutureActivity.this, Future_ContinuousActivity.class)));
        future_perfect.setOnClickListener(v -> startActivity(new Intent(FutureActivity.this, Future_PerfectActivity.class)));
        future_perfect_continuous.setOnClickListener(v -> startActivity(new Intent(FutureActivity.this, Future_Perf_ContActivity.class)));
        button_back.setOnClickListener(v -> onBackPressed());

        GeneralMethods.setViewSizeFromHeight(this, futureMainGrid, 1.5);
    }
}