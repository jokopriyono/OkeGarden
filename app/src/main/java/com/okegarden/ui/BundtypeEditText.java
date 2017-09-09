package com.okegarden.ui;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

public class BundtypeEditText extends android.support.v7.widget.AppCompatEditText {

    private Context context;
    private AttributeSet attrs;
    private int defStyle;

    public BundtypeEditText(Context context) {
        super(context);
        this.context=context;
        init();
    }

    public BundtypeEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context=context;
        this.attrs=attrs;
        init();
    }

    public BundtypeEditText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.context=context;
        this.attrs=attrs;
        this.defStyle=defStyle;
        init();
    }

    private void init() {
        Typeface font=Typeface.createFromAsset(getContext().getAssets(), "font/Bunday.otf");
        this.setTypeface(font);
    }
    @Override
    public void setTypeface(Typeface tf, int style) {
        tf=Typeface.createFromAsset(getContext().getAssets(), "font/Bunday.otf");
        super.setTypeface(tf, style);
    }

    @Override
    public void setTypeface(Typeface tf) {
        tf=Typeface.createFromAsset(getContext().getAssets(), "font/Bunday.otf");
        super.setTypeface(tf);
    }
}
