package me.lucky.databye

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class TriggerReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        me.lucky.databye.trigger.broadcast.BroadcastReceiver().onReceive(context, intent)
    }
}