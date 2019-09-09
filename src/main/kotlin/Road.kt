package autopilot_dsl

import autopilot_dsl.Directions.*

open class RoadSample{
    public var lengthBefore = 50
    public var lengthAfter = 50
    public var directions = ArrayList<Directions>()
    public var signs = ArrayList<Signs>()


}

class Crossroad: RoadSample()
{
    init {
        this.directions = listOf<Directions>(STRAIGT, LEFT, RIGHT, BACK) as ArrayList<Directions>
    }

}


enum class Directions{
    STRAIGT, LEFT, RIGHT, BACK, LEFT45, RIGHT45
}

enum class Signs {
    GIVE_WAY, PRIORITY_ROAD

}