package autopilot_dsl

object test {

    operator fun  invoke(init: TestContext.() ->Unit) = TestContext().init()
}

@AutoPilotDSL
class TestContext {
    public var control = Control()
    public var weather = Weather()


    fun case(init: CaseContext.() -> Unit): Case {
        val context = CaseContext().apply(init)

        return Case() //#TODO replace to actual case
    }

    fun drive(timeMsec : Int) : Case {

        return Case() //#TODO replace to actual case


    }

    infix fun assertions(init: AssertionsContext.() ->Unit){
        val assertion = AssertionsContext().apply(init)

    }



}

class AssertionsContext{

}

class CaseContext {
    fun weather(init: WeatherContext.() -> Unit){
        val context = WeatherContext().apply(init)
        context
    }

    fun road(init: RoadContext.() -> Unit) {

    }

}

class RoadContext {
    private var road = ArrayList<RoadSample>()

    fun crossroad(){

    }
}

class WeatherContext {
    public  val RAIN = "rain"
    public  val SNOW = "snow"
    private var temp = 20;
    private var precipitation = "no"

    fun temp(temp: Int){ this.temp = temp}
    fun precipitation(prec: String){ this.precipitation = precipitation}

}

class Case {
     fun drive(timeMsec : Int) : Case {

        return Case() //#TODO replace to actual case
    }


}

class DriveContext {

}