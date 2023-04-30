package com.example.lab7

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder

class MusicPlayerService : Service(),
    MediaPlayer.OnPreparedListener {


    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }

    override fun onPrepared(p0: MediaPlayer?) {
        TODO("Not yet implemented")


    }
}