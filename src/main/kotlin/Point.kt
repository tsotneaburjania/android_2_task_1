import kotlin.math.pow
import kotlin.math.sqrt

class Point(var x: Double, var y: Double) {
    override fun toString(): String {
        return "Point(x=$x, y=$y)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Point

        if (x != other.x) return false
        if (y != other.y) return false

        return true
    }

    override fun hashCode(): Int {
        var result = x.hashCode()
        result = 31 * result + y.hashCode()
        return result
    }

    fun makeParallelFromPoint(point: Point) : Point {
        point.x *= -1
        point.y *= -1

        return point
    }

    fun transitionToParallel(){
        this.x *= -1
        this.y *= -1
    }

    fun distanceBetween(other: Point) : Double {
//      FORMULA: d=√((x2-x1)²+(y2-y1)²)
        return sqrt((other.x - this.x).pow(2.0) + (other.y - this.y).pow(2.0))
    }
}