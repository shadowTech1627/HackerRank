package arrays

fun main() {
    val a = arrayOf(1, 2, 3, 4, 5)
    rotLeft(a, 4)
}

fun rotLeft(a: Array<Int>, d: Int): Array<Int> {
    var result = Array<Int>(a.size, {i->0});
    for (step in 0 until a.size) {
        var position = step - d;
        if (position < 0) {
            position += a.size
        }
        result[position] = a[step]
    }
    return result;

}
