package me.yellowelephant.test.autopilot.test;

import me.yellowelephant.test.autopilot.dsl.*
import me.yellowelephant.test.autopilot.dsl.road.model.primitive.Crossroad
import me.yellowelephant.test.autopilot.dsl.road.model.primitive.crossroad
import me.yellowelephant.test.autopilot.dsl.test.simpleTest
import me.yellowelephant.test.autopilot.dsl.vehicles.control
import me.yellowelephant.test.autopilot.dsl.vehicles.car

var test = simpleTest {
    car {model = "Polo1.4"}
    weather {
        temp = 20
        measuredTemp = 20
        fall = "no"
        road = "dry"
    }
    control {
        speed = 60
        acceleration =0.0
        steering =0.0
        throttle = 30
        brakes = 0
        gear = "D"
    }
    route {
        waypoint {
            action = "park"
            distance = 150.0
        }
    }
    road {
        crossroad {
            lenght = 100.0
            distance = 50.0
            trafficLight = "Red"
        }
        straightRoad {
            lenght = 100.0
            sideparking = "along"
            parkingDensity = 0.3
        }
     }

}

var result = test.checkPilot()



