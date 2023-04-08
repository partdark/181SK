package com.example.qwertyuiop


import android.annotation.SuppressLint
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.ImageButton
import android.widget.SeekBar


class MainActivity2 : AppCompatActivity() {

    lateinit var runnable: Runnable
    private var handler = Handler()
    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val mediaPlayer: MediaPlayer = MediaPlayer.create(this, R.raw.bleeding)
        val play:ImageButton = findViewById(R.id.play_btn)
        val seekBar:SeekBar = findViewById(R.id.seekbar)
        seekBar.progress = 0
        seekBar.max = mediaPlayer.duration
        play.setOnClickListener{
            if(!mediaPlayer.isPlaying){
                mediaPlayer.start()
                play.setImageResource(R.drawable.baseline_pause_24)
            }else{
                mediaPlayer.pause()
                play.setImageResource(R.drawable.baseline_play_arrow_24)
            }
        }

        seekBar.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, pos: Int, chahged: Boolean) {
                if (chahged){
                    mediaPlayer.seekTo(pos)
                }
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }
        })

        runnable = Runnable {
            seekBar.progress = mediaPlayer.currentPosition
            handler.postDelayed(runnable, 1000)
        }
        handler.postDelayed(runnable, 1000)
        mediaPlayer.setOnCompletionListener {
            play.setImageResource(R.drawable.baseline_play_arrow_24)
            seekBar.progress = 0
        }
    }

}