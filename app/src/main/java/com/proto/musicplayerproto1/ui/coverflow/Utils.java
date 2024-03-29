package com.proto.musicplayerproto1.ui.coverflow;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

/**
 * Created by yuweichen on 16/4/29.
 */
public class Utils {

    public static float getFloat(float value,float minValue,float maxValue){
        return Math.min(maxValue, Math.max(minValue, value));
    }

    public static float convertDpToPixel(float dp, Context context) {
        Resources resources = context.getResources();
        DisplayMetrics metrics = resources.getDisplayMetrics();
        float px = dp * ((float) metrics.densityDpi / DisplayMetrics.DENSITY_DEFAULT);
        return px;
    }

}
