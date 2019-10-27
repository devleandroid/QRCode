package com.example.myapplication;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

public class TicketActivity extends LinearLayout {

    private Bitmap bm;
    private Canvas cv;
    private Paint eraser;
    private int holesBottomMargin = 70;
    private int holeRadius = 40;

    public TicketActivity(Context context) {
        super(context);
        Init();
    }

    private void Init() {
    }

    public TicketActivity(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public TicketActivity(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public TicketActivity(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
}
