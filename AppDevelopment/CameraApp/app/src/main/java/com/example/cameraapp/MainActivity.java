package com.example.cameraapp;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private ImageView imV;
    private Button takePicture;
    private static final int IMAGE_CAPTURE_CODE = 1;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==IMAGE_CAPTURE_CODE){
            if(resultCode==RESULT_OK){
                assert data != null;
                Bitmap btmapPicture = (Bitmap) data.getExtras().get("data");
                imV.setImageBitmap(btmapPicture);
                MediaStore.Images.Media.insertImage(getContentResolver(),btmapPicture,"image786","Image Info");
            }
            else if(resultCode==RESULT_CANCELED){
                Toast.makeText(this,"Cancelled", Toast.LENGTH_LONG).show();
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        takePicture = findViewById(R.id.take_picture);
        imV = findViewById(R.id.image_view);
        takePicture.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent,IMAGE_CAPTURE_CODE);
            }
        });


    }
}