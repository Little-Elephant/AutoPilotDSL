package autopilot_dsl

import org.testng.annotations.Test
import javax.print.attribute.standard.Finishings

class Demo1 {

    @Test(testName = "Stop on traffic light")
    fun `test1`() = test {
        case {
            car {
                model = "Polo1.4"
            }
            weather {
                temp(25)
                precipitation( RAIN )
            }
            road {
                crossroad {
                    lengthBefore = 100
                    lengthAfter = 200
                    trafficLight = RED
                }

            }
            routes {
                route{
                    distance = 100
                    action = STRAIGHT
                }
                route{
                    distance 100
                    action = PARK
                }

            }
            control {
                speed = 60
                brakes = 0
                throtle = 20
                gear = "D"
                steering = 0
            }

        }
        drive(1000) {
            until {
                speed = 0
                endOfRoute = true
                timeout = 30
            }
        }
        assertions {
            speed shouldEqual 0
            throtle shouldEqual 0
            brakes shouldBeMore 20
            gear shouldEqual "D"
            distance shouldBeLess 100.0
            distance shouldBeMore 99.0


        }

    }
}