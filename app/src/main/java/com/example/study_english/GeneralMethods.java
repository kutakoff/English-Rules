package com.example.study_english;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;

public final class GeneralMethods {

    /**
     * Устанавливает высоту указанному View, который равнен высоте экрана / value
     *
     * @param view     сам view
     * @param activity активити класса
     * @param value    значение, которое будет делить высоту экрана
     */
    public static void setViewSizeFromHeight(Activity activity, View view, double value) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = (int) (displayMetrics.heightPixels / value);
    }

    /**
     * Устанавливает ширину указанному View, который равнен ширине экрана / value
     *
     * @param view     сам view
     * @param activity активити класса
     * @param value    значение, которое будет делить ширину экрана
     */
    public static void setViewSizeFromWidth(Activity activity, View view, double value) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = (int) (displayMetrics.heightPixels / value);
    }

    private static void SwipeLeft(ViewFlipper flipper, Context context) {
        flipper.setInAnimation(AnimationUtils.loadAnimation(context, R.anim.flipin_reverse));
        flipper.setOutAnimation(AnimationUtils.loadAnimation(context, R.anim.flipout_reverse));
        flipper.showPrevious();
    }

    private static void SwipeRight(ViewFlipper flipper, Context context) {
        flipper.setInAnimation(AnimationUtils.loadAnimation(context, R.anim.flipin));
        flipper.setOutAnimation(AnimationUtils.loadAnimation(context, R.anim.flipout));
        flipper.showNext();
    }

    public static boolean swipePage(MotionEvent e1, MotionEvent e2, ViewFlipper flipper, Context context) {
        float sensitivity = 50;
        if ((e1.getX() - e2.getX()) > sensitivity) {
            SwipeLeft(flipper, context);
        } else if ((e2.getX() - e1.getX()) < sensitivity) {
            SwipeRight(flipper, context);
        }
        return true;
    }
}