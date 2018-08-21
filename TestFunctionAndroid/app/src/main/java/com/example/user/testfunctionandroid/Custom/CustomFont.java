package com.example.user.testfunctionandroid.Custom;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;

public class CustomFont {

    private static final CustomFont ourInstance = new CustomFont();

    public static CustomFont getInstance() {
        return ourInstance;
    }

    private CustomFont() {
    }


    private Typeface fontHead;
    private Typeface fontData;

    public Typeface getFontHead(Context context) {

        if(fontHead==null){
            fontHead = Typeface.createFromAsset(context.getAssets(), "fonts/kanit_medium.ttf");
            Log.i("test",""+fontHead);
            System.out.println("TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST   ." + fontHead);
        }


        return fontHead;
    }

    public void setFontHead(Typeface fontHead) {
        this.fontHead = fontHead;
    }

    public Typeface getFontData(Context context) {

        if(fontData==null){
            fontData = Typeface.createFromAsset(context.getAssets(), "fonts/kanit_light.ttf");
        }


        return fontData;
    }

    public void setFontData(Typeface fontData) {
        this.fontData = fontData;
    }


}
