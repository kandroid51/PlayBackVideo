package com.example.ken26.playbackvideo;

import android.content.Intent;
import android.graphics.PixelFormat;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.VideoView;

public class PlaybackVideo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playback_video);

        Button button;

        button = (Button) findViewById(R.id.button);

        getWindow().setFormat(PixelFormat.UNKNOWN);
        Intent intent = getIntent();
        Uri uri = Uri.parse(intent.getStringExtra("VideoFile"));
        VideoView mVideoPlay = (VideoView) findViewById(R.id.VideoView);

        mVideoPlay.setVideoURI(uri);
        mVideoPlay.requestFocus();
        mVideoPlay.start();
    }
}
