package Warmup

fun main() {
    countStrings("abcac", 10);
}

fun countStrings(subString: String, listSize: Long): Int {
    var myMap: HashMap<Int, Int> = HashMap();
    var count = 0;
    for (i in 0..subString.length - 1) {
        println("chars: " + subString[i])
        if ('a' == subString[i]) {
            count++;
        }
        myMap.put(i + 1, count);
    }
    println("count sub: " + myMap.toString());
    val equallyDivide: Long = listSize / subString.length;
    val leftIndices: Int = (listSize % subString.length).toInt();
    println("left indices: " + leftIndices + " so count at postion: " + myMap.get(leftIndices))
    var moreLeftOcc: Int = 0;
    myMap.get(leftIndices)?.let {
        moreLeftOcc = myMap.get(leftIndices)!!;
    } ?: run {
        moreLeftOcc = 0;
    }
    val occurence = (equallyDivide * count) + moreLeftOcc;
    println("In: " + equallyDivide + " so a are: " + occurence);
    return 1;
}