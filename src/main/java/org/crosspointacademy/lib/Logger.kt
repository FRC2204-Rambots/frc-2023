package org.crosspointacademy.lib

import edu.wpi.first.wpilibj.DriverStation

object Logger {

    fun warn(msg: String, trace: Boolean = false) {
        DriverStation.reportWarning(msg, trace)
    }

    fun err(msg: String, trace: Boolean) {
        DriverStation.reportError(msg, trace)
    }

}