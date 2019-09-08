package autopilot_dsl

import org.testng.annotations.Test

class Demo {

    @Test(testName = "Stop on traffic light")
    fun `test1`() = test {
        case {
            weather {
                temp(25)
                precipitation( RAIN )
            }
            road {
                crossroad {
                }
            }

        }
        drive(1000)
        assertions {


        }

    }
}