package me.yellowelephant.test.autopilot.dsl.vehicles

data class Control(var speed: Int = 0, var acceleration: Double, var throttle: Int)

fun control(block:Control.() -> Unit): Control = Control().apply(block)