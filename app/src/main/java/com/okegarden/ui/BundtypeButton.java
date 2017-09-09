package com.okegarden.ui;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

/**
 * Created by LENOVO on 09/08/2017.
 */

public class BundtypeButton extends android.support.v7.widget.AppCompatButton {
    Typeface normalTypeface = FontCache.getTypeface("font/Bunday.otf", getContext());
    Typeface boldTypeface = FontCache.getTypeface("font/Bunday.otf", getContext());

    public BundtypeButton(Context context) {
        super(context);
    }
    public BundtypeButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    public BundtypeButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
