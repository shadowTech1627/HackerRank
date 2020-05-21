package arrays

fun main() {
    val arr:Array<Array<Int>> = arrayOf(arrayOf(1,1,1,0,0,0), arrayOf(0,1,0,0,0,0),
    arrayOf(1,1,1,0,0,0), arrayOf(0,0,2,4,4,0), arrayOf(0,0,0,2,0,0), arrayOf(0,0,1,2,4,0))
    print(hourglassSum(arr))
}

fun hourglassSum(arr: Array<Array<Int>>): Int {
    var sum = Int.MIN_VALUE;
    for (row in 0 until 4 ) {
        for (col in 0 until 4 ) {
            val hourGlassSum = arr[row][col] + arr[row][col + 1] + arr[row][col + 2] + arr[row + 1][col + 1] + arr[row + 2][col] + arr[row + 2][col + 1] + arr[row + 2][col + 2]
            if (hourGlassSum > sum) {
                sum = hourGlassSum;
            }
//            print("" + arr[i][j] + " , " + arr[i][j+1] + " , " + arr[i][j+2])
//            print("\n    " + arr[i+1][j+1] +"    ")
//            print("\n" + arr[i+2][j] + " , " + arr[i+2][j+1] + " , " + arr[i+2][j+2])
//            print("\n")
        }
     //   print("\n\n")
    }
    return sum
}