package com.example.study_english;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.GridLayout;

import com.example.study_english.future.FutureActivity;
import com.example.study_english.past.PastActivity;
import com.example.study_english.present.PresentActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_main);

        GridLayout mainGrid = findViewById(R.id.mainGrid);
        CardView past = findViewById(R.id.past);
        CardView alphabet = findViewById(R.id.alphabet);
        CardView present = findViewById(R.id.present);
        CardView future = findViewById(R.id.future);

        present.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, PresentActivity.class)));
        past.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, PastActivity.class)));
        future.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, FutureActivity.class)));
        alphabet.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, AlphabetActivity.class)));

        GeneralMethods.setViewSizeFromHeight(this, mainGrid, 1.5);
    }

    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setMessage("Вы действительно хотите выйти из приложения?")
                .setCancelable(false)
                .setPositiveButton("Да", (dialog, id) -> finish()).setNegativeButton("Нет", null).show();
    }
}