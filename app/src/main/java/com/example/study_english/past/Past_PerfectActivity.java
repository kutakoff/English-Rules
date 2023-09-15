package com.example.study_english.past;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.ViewFlipper;

import com.example.study_english.GeneralMethods;
import com.example.study_english.R;

public class Past_PerfectActivity extends AppCompatActivity {

    ViewFlipper flipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_past__perfect);
        flipper = findViewById(R.id.viewflipper);
        Button button_back = findViewById(R.id.button_back1);
        button_back.setOnClickListener(v -> onBackPressed());
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return gestureDetector.onTouchEvent(event);
    }

    GestureDetector.SimpleOnGestureListener simpleOnGestureListener = new GestureDetector.SimpleOnGestureListener() {
        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
            return GeneralMethods.swipePage(e1, e2, flipper, getApplicationContext());
        }
    };
    GestureDetector gestureDetector = new GestureDetector(getBaseContext(), simpleOnGestureListener);
}