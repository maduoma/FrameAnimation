package com.alc.android.frameanimation

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private lateinit var batteryAnimation: AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onStart() {
        super.onStart()

        targetImage.setBackgroundResource(R.drawable.battery_animation_list)
        batteryAnimation = targetImage.background as AnimationDrawable
        batteryAnimation.start()
    }

    // Button click event handler 
    fun startStopAnimation(view: View) {

        if (batteryAnimation.isRunning)
            batteryAnimation.stop()
        else
            batteryAnimation.start()
    }
}
