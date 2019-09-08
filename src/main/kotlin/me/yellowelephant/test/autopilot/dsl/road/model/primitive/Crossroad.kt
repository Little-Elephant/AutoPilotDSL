package me.yellowelephant.test.autopilot.dsl.road.model.primitive;

data class Crossroad(var distance : Double = 100.0, var trafficLight:String = "None")

fun crossroad(block: Crossroad.() -> Unit): Crossroad = Crossroad().apply(block)