package autopilot_dsl


class RoadSample{
    public var lengthBefore = 50
    public var lengthAfter = 50
    public var directions = ArrayList<Directions>()
    public var signs = ArrayList<Signs>()


}

enum class Directions{
    STRAIGT, LEFT, RIGHT, LEFT45, RIGHT45
}

enum class Signs {
    GIVE_WAY, PRIORITY_ROAD

}