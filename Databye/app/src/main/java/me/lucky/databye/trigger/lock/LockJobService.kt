package me.lucky.databye.trigger.lock

import android.app.job.JobParameters
import android.app.job.JobService

import me.lucky.databye.Trigger
import me.lucky.databye.Utils

class LockJobService : JobService() {
    override fun onStartJob(params: JobParameters?): Boolean {
        Utils(this).fire(Trigger.LOCK)
        return false
    }

    override fun onStopJob(params: JobParameters?): Boolean { return true }
}