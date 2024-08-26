package com.example.study_english.future;

import static com.example.study_english.GeneralMethods.getScreenType;
import static com.example.study_english.GeneralMethods.getTextSize;
import static com.example.study_english.GeneralMethods.setViewSizeFromHeight;
import static com.example.study_english.GeneralMethods.setViewSizeFromWidth;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Display;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import com.example.study_english.GeneralMethods;
import com.example.study_english.R;

import org.w3c.dom.Text;

public class Future_ContinuousActivity extends AppCompatActivity {

    private ViewFlipper flipper;
    private TextView counter_1;
    private TextView counter_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_future__continuous);
        flipper = findViewById(R.id.viewflipper);
        Button button_back = findViewById(R.id.button_back);
        button_back.setOnClickListener(v -> onBackPressed());


        Activity thisActivity = this;
        counter_1 = findViewById(R.id.counter_1);
        counter_1 = findViewById(R.id.counter_1);
        counter_2 = findViewById(R.id.counter_2);
        /*counter_1.setTextSize(getTextSize(thisActivity));
        counter_2.setTextSize(getTextSize(thisActivity));*/
        //counter_1.setTextColor(Color.BLACK);

        setViewSizeFromHeight(thisActivity, button_back, 12);
        setViewSizeFromWidth(thisActivity, button_back, 8);

        ImageView future_cont_1 = findViewById(R.id.future_continuous_1);
        ImageView future_cont_2 = findViewById(R.id.future_continuous_2);
        setViewSizeFromHeight(thisActivity, future_cont_1, 1.5);
        setViewSizeFromHeight(thisActivity, future_cont_2, 1.5);

        ImageView swipe = findViewById(R.id.swipe);
        setViewSizeFromHeight(thisActivity, swipe, 6);
        setViewSizeFromWidth(thisActivity, swipe, 3);
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
    GestureDetector gestureDetector = new GestureDetector(getBaseContext(),
            simpleOnGestureListener);
}