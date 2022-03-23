fun main(args: Array<String>) {

//  1
    val point = Point(0.0, 13.0)
    println(point.toString())

//  2
    val point02 = Point(12.3, 13.0)
    val point03 = Point(56.1, 23.7)
    println(point02 == point03)

//  3
    val point04 = Point(11.1, -42.0)
    println("Before parallel transition: $point04")
    point04.transitionToParallel()
    println("After parallel transition: $point04")

//  4
    val point05 = Point(2.0, 4.0)
    val point06 = Point(3.0, 5.0)

    println("Distance between ${point05.toString()} and ${point06.toString()} is ${point05.distanceBetween(point06)}")
}