package arrays

import java.util.*

fun main() {
    val q = arrayOf(2, 1, 5, 3, 4)
    print(minimumBribes(q))
}

fun minimumBribes(q: Array<Int>): Unit {
    var bribes = 0;
    for (pos in (q.size - 1) downTo 0) {
        if (q[pos] != (pos + 1)) {
            //bribe
            if (pos - 1 >= 0 && q[pos-1] == pos+1) {
                bribes++
                swapPos(q, pos, pos - 1)
            } else if (pos-2>=0 && q[pos-2] == (pos + 1)) {
                bribes += 2
                swapPos(q, pos-1, pos - 2)
                swapPos(q, pos, pos - 1)
            } else {
                println("Too chaotic.")
                return
            }
        }
    }
    println(bribes)
    return
}

fun swapPos(q: Array<Int>, currentPos: Int, originalPos: Int) {
    println("swapping " + q[currentPos] + " with: " + q[originalPos])
    var temp = q[originalPos]
    q[originalPos] = q[currentPos]
    q[currentPos] = temp
    println(Arrays.toString(q))
}