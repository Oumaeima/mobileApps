package me.lucky.databye.trigger.broadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

import me.lucky.databye.Preferences
import me.lucky.databye.Trigger
import me.lucky.databye.Utils

class BroadcastReceiver : BroadcastReceiver() {
    companion object {
        const val KEY = "code"
        const val ACTION = "me.lucky.databye.action.TRIGGER"

        fun panic(context: Context, intent: Intent?, trigger: Trigger) {
            if (intent?.action != ACTION) return
            val secret = Preferences.new(context).secret
            assert(secret.isNotEmpty())
            if (intent.getStringExtra(KEY)?.trim() != secret) return
            Utils(context).fire(trigger)
        }
    }

    override fun onReceive(context: Context?, intent: Intent?) {
        panic(context ?: return, intent, Trigger.BROADCAST)
    }
}