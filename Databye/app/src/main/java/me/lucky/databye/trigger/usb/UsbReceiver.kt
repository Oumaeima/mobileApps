package me.lucky.databye.trigger.usb

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.hardware.usb.UsbManager

import me.lucky.databye.Trigger
import me.lucky.databye.Utils

class UsbReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if (intent?.action != UsbManager.ACTION_USB_DEVICE_ATTACHED &&
            intent?.action != UsbManager.ACTION_USB_ACCESSORY_ATTACHED) return
        val utils = Utils(context ?: return)
        if (!utils.isDeviceLocked()) return
        utils.fire(Trigger.USB)
    }
}