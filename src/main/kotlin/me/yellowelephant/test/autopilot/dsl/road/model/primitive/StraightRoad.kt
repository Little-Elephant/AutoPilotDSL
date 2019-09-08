package me.yellowelephant.test.autopilot.dsl.road.model.primitive;

data class StraightRoad(var distance : Double = 100.0, var trafficLight:String = "None")

fun straightroad(block: StraightRoad.() -> Unit): StraightRoad = StraightRoad().apply(block)