package com.example.trafficlight;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.NonNull;

public class trafficlightview extends View {

    private final Paint paint;
    private int currentLight;

    public trafficlightview(Context context, AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint();
        currentLight = 0; // Start with the red light
    }

    @Override
    protected void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);

        // Get the width and height of the view
        int width = getWidth();
        int height = getHeight();

        // Set the radius and center position for the circles
        float radius = width / 6f;
        float cx = width / 2f;
        float cyRed = height / 4f;
        float cyYellow = height / 2f;
        float cyGreen = 3 * height / 4f;

        // Draw the red light
        paint.setColor(currentLight == 0 ? Color.RED : Color.DKGRAY);
        canvas.drawCircle(cx, cyRed, radius, paint);

        // Draw the yellow light
        paint.setColor(currentLight == 1 ? Color.YELLOW : Color.DKGRAY);
        canvas.drawCircle(cx, cyYellow, radius, paint);

        // Draw the green light
        paint.setColor(currentLight == 2 ? Color.GREEN : Color.DKGRAY);
        canvas.drawCircle(cx, cyGreen, radius, paint);
    }

    public void redLight() {
        currentLight = 0;
        invalidate();
    }
    public void yellowLight() {
        currentLight = 1;
        invalidate();
    }
    public void greenLight() {
        currentLight = 2;
        invalidate();
    }
}
