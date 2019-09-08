package me.yellowelephant.test.autopilot.dsl.test

import me.yellowelephant.test.autopilot.dsl.vehicles.Car
import me.yellowelephant.test.autopilot.dsl.vehicles.Control

data class SimpleTest(val car : Car, var weather : Weather, var control: Control, var route: Route, var road: Road)
{
    fun checkPilot()
    : Control {
        //#TODO Call for SUT and return new Control
        return this.control;
    }
    operator fun invoke(init: )
}

fun simpleTest(block: SimpleTest.() -> Unit): SimpleTest = SimpleTest().apply(block)
