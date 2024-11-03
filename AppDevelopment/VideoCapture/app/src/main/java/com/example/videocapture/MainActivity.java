package com.example.videocapture;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Button btnCaptureVideo;
    private VideoView videoView;
    private static final int VIDEO_CAPTURE_CODE = 1001;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == VIDEO_CAPTURE_CODE && resultCode == RESULT_OK){
            Uri videoUri = data.getData();
            videoView.setVideoURI(videoUri);
            videoView.start();
            MediaStore.Video.Media.getContentUri("demo");
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        btnCaptureVideo = findViewById(R.id.button_take_video);
        videoView = findViewById(R.id.video_view);

        btnCaptureVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVideo = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
                startActivityForResult(intentVideo,VIDEO_CAPTURE_CODE);
               }
        });

    }
}