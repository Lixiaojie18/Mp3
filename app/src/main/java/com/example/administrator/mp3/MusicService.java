package com.example.administrator.mp3;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by Administrator on 2016/10/27 0027.
 */

public class MusicService extends Service{

    private MediaPlayer mPlayer;

    @Override
    public void onCreate() {
        mPlayer = MediaPlayer.create(getApplicationContext(), R.raw.anni);
        super.onCreate();
    }

    @Override
    public void onStart(Intent intent, int startId) {
        mPlayer.start();
        super.onStart(intent, startId);
    }
    @Override
    public void onDestroy() {
        mPlayer.stop();
        super.onDestroy();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
