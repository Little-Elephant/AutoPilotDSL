package me.yellowelephant.test.autopilot.dsl.vehicles

data class Car(var model: String = "Polo1.4" ){

    fun drive(control: Control, duration: Int) : Control{
        //#TODO recalculate speed, course according to given throttle, brakes, steering, duration
        return control
    }
}

fun car(block:Car.() -> Unit): Car = Car().apply(block)