package com.example.study_english;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.Display;
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

    /**
     * Получает тип экрана: "small", "normal", "large", "xlarge"
     *
     * @param activity активити класса
     * @return название экрана
     */
    public static String getScreenType(Activity activity) {
        int screenLayout = activity.getResources().getConfiguration().screenLayout;
        screenLayout &= Configuration.SCREENLAYOUT_SIZE_MASK;
        if (screenLayout == 1) {
            return "small";
        } else if (screenLayout == 2) {
            return "normal";
        } else if (screenLayout == 3) {
            return "large";
        } else {
            return "xlarge";
        }
    }

    public static float getTextSize(Activity activity) {
        String screenName = getScreenType(activity);
        if (screenName.equals("small")) {
            return 10;
        } else if (screenName.equals("normal")) {
            return 30;
        } else if (screenName.equals("large")) {
            return 40;
        } else {
            return 50;
        }
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