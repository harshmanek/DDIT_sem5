package com.example.a2ndsess;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Bitmap bitmap;
    private Paint paint;
    private Canvas canvas;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int widthInPixels=800,height=600;

        bitmap = Bitmap.createBitmap(widthInPixels,height,Bitmap.Config.ARGB_8888);
        canvas =new Canvas(bitmap);
        imageView=new ImageView(this);
        paint = new Paint();

        //draw a green color background
        canvas.drawColor(Color.argb(255,0,255,0));

        //draw a text CanvasDemo
        paint.setTextSize(100);
        paint.setColor(Color.argb(255,255,255,255));
        canvas.drawText("Canvas Demo",100,100,paint);

        paint.setColor(Color.WHITE);
//        //draw blue color circle
//        canvas.drawCircle(150,250,100,paint);

        //draw rectangle
        canvas.drawRect(920,700,40,40,paint);

        //set imageView using Bitmap
        imageView.setImageBitmap(bitmap);

        setContentView(imageView);
    }
}