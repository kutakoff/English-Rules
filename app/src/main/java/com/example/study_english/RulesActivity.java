package com.example.study_english;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.study_english.future.Future_ContinuousActivity;
import com.example.study_english.future.Future_Perf_ContActivity;
import com.example.study_english.future.Future_PerfectActivity;
import com.example.study_english.future.Future_SimpleActivity;
import com.example.study_english.past.Past_ContinuousActivity;
import com.example.study_english.past.Past_Perf_ContActivity;
import com.example.study_english.past.Past_PerfectActivity;
import com.example.study_english.past.Past_SimpleActivity;
import com.example.study_english.present.Present_ContinuousActivity;
import com.example.study_english.present.Present_Perf_ContActivity;
import com.example.study_english.present.Present_PerfectActivity;
import com.example.study_english.present.Present_SimpleActivity;

public class RulesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);

        ImageButton present = findViewById(R.id.present);
        ImageButton presentSimple = findViewById(R.id.present_simple);
        ImageButton presentContinuous = findViewById(R.id.present_continuous);
        ImageButton presentPerfect = findViewById(R.id.present_perfect);
        ImageButton presentPerfectContinuous = findViewById(R.id.present_perfect_continuous);

        ImageButton past = findViewById(R.id.past);
        ImageButton pastSimple = findViewById(R.id.past_simple);
        ImageButton pastContinuous = findViewById(R.id.past_continuous);
        ImageButton pastPerfect = findViewById(R.id.past_perfect);
        ImageButton pastPerfectContinuous = findViewById(R.id.past_perfect_continuous);

        ImageButton future = findViewById(R.id.future);
        ImageButton futureSimple = findViewById(R.id.future_simple);
        ImageButton futureContinuous = findViewById(R.id.future_continuous);
        ImageButton futurePerfect = findViewById(R.id.future_perfect);
        ImageButton futurePerfectContinuous = findViewById(R.id.future_perfect_continuous);

        presentSimple.setOnClickListener(v -> startActivity(new Intent(RulesActivity.this, Present_SimpleActivity.class)));
        presentContinuous.setOnClickListener(v -> startActivity(new Intent(RulesActivity.this, Present_ContinuousActivity.class)));
        presentPerfect.setOnClickListener(v -> startActivity(new Intent(RulesActivity.this, Present_PerfectActivity.class)));
        presentPerfectContinuous.setOnClickListener(v -> startActivity(new Intent(RulesActivity.this, Present_Perf_ContActivity.class)));

        pastSimple.setOnClickListener(v -> startActivity(new Intent(RulesActivity.this, Past_SimpleActivity.class)));
        pastContinuous.setOnClickListener(v -> startActivity(new Intent(RulesActivity.this, Past_ContinuousActivity.class)));
        pastPerfect.setOnClickListener(v -> startActivity(new Intent(RulesActivity.this, Past_PerfectActivity.class)));
        pastPerfectContinuous.setOnClickListener(v -> startActivity(new Intent(RulesActivity.this, Past_Perf_ContActivity.class)));

        futureSimple.setOnClickListener(v -> startActivity(new Intent(RulesActivity.this, Future_SimpleActivity.class)));
        futureContinuous.setOnClickListener(v -> startActivity(new Intent(RulesActivity.this, Future_ContinuousActivity.class)));
        futurePerfect.setOnClickListener(v -> startActivity(new Intent(RulesActivity.this, Future_PerfectActivity.class)));
        futurePerfectContinuous.setOnClickListener(v -> startActivity(new Intent(RulesActivity.this, Future_Perf_ContActivity.class)));

        ImageButton[] buttons = {present, past, future, presentSimple, presentContinuous,
                presentPerfect, presentPerfectContinuous, pastSimple, pastContinuous,
                pastPerfect, pastPerfectContinuous, futureSimple, futureContinuous,
                futurePerfect, futurePerfectContinuous};
        for (ImageButton button : buttons) {
            GeneralMethods.setViewSizeFromWidth(RulesActivity.this, button, 3);
            GeneralMethods.setViewSizeFromHeight(RulesActivity.this, button, 15);
        }
    }

    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setMessage("Вы действительно хотите выйти из приложения?")
                .setCancelable(false)
                .setPositiveButton("Да", (dialog, id) -> finish()).setNegativeButton("Нет", null).show();
    }
}