package engineer.thomas_werner.euler

fun main() {
    println(Problem29().getResult(100))
}

class Problem29 {

    fun getResult(max: Int): Int {
        var set = mutableSetOf<Double>()
        for(a in 2..max)
            for(b in 2..max)
                set.add(Math.pow(a.toDouble(), b.toDouble()))
        return set.size
    }

}