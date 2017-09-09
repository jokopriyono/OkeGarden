package com.okegarden.ui;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

/**
 * Created by Joko Priyono on 23/10/2016.
 */

public class BundtypeTextview extends android.support.v7.widget.AppCompatTextView {

    public BundtypeTextview(Context context) {
        super(context);

        applyCustomFont(context);
    }

    public BundtypeTextview(Context context, AttributeSet attrs) {
        super(context, attrs);

        applyCustomFont(context);
    }

    public BundtypeTextview(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        applyCustomFont(context);
    }

    private void applyCustomFont(Context context) {
        Typeface customFont = FontCache.getTypeface("font/Bunday.otf", context);
        setTypeface(customFont);
    }
}
