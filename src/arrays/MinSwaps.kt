package arrays

fun main() {
    val arr = arrayOf(1, 3, 5, 2, 4, 6, 7)
    print("Min swap: "+minimumSwaps(arr))
}

// Complete the minimumSwaps function below.
fun minimumSwaps(arr: Array<Int>): Int {
    var swaps = 0
    var pos = 0;
    while (pos < arr.size) {
      if (arr[pos] != pos+1) {
          swaps++;
          val temp = arr[pos];
          print("Swapping pos: ("+ pos + ","+ (temp-1)+")  ")
          arr[pos] = arr[temp-1];
          arr[temp-1] = temp;
          print("Array now is: ")
          arr.forEach { print(it)
          print(" , ")}
          println()
      } else {
          pos++;
      }
    }
    return swaps;
}