package me.lucky.databye.trigger.application

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import me.lucky.databye.Trigger
import me.lucky.databye.Utils

class ApplicationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Utils(this).fire(Trigger.APPLICATION)
        finishAndRemoveTask()
    }
}