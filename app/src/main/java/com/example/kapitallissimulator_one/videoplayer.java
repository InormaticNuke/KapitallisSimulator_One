package com.example.kapitallissimulator_one;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class videoplayer extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video);

        VideoView myvideo = findViewById(R.id.videoOne);

        String video = "android.resource://" + getPackageName() + "/" + R.raw.duck;
        Uri uri = Uri.parse(video);

        myvideo.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        myvideo.setMediaController(mediaController);
        mediaController.setAnchorView(myvideo);

        Animation animation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);
        animation.setDuration(1000);
        myvideo.startAnimation(animation);

        myvideo.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                myvideo.start();
            }
        });

    }

    public void onClickBackTwo(View view){
        Intent intent = new Intent (this, selector.class);
        startActivity(intent);
    }
}
