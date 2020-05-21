package arrays


fun maxPairs(skillLevel: Array<Int>, minDiff: Int): Int {
    // Write your code here
    var count = 0

    skillLevel.sort();
    for (i in 0 until skillLevel.size) {
        for (j in i+1 until skillLevel.size) {
            if (skillLevel[j] - skillLevel[i] == 4 ) {
                println("Diff: " + (skillLevel[j] - skillLevel[i]) + " arr: " + skillLevel[j] + "," +skillLevel[i] )
                count++
            }
        }
    }
    return count
}

fun main(args: Array<String>) {
    val skillLevelCount = readLine()!!.trim().toInt()

    val skillLevel = Array<Int>(skillLevelCount, { 0 })
    for (i in 0 until skillLevelCount) {
        val skillLevelItem = readLine()!!.trim().toInt()
        skillLevel[i] = skillLevelItem
    }

    val minDiff = readLine()!!.trim().toInt()

    val result = maxPairs(skillLevel, minDiff)

    println(result)
}