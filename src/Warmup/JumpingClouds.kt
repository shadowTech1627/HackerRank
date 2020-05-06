package Warmup

import java.util.*


    fun main(args: Array<String>) {
       val array = arrayOf<Int>(0, 0, 0, 0, 1, 0);
        //val array = arrayOf<Int>(0, 0, 1, 0, 0, 1, 0);

        val result = jumpingOnClouds(array)
        println(result)
    }

    fun jumpingOnClouds(clouds: Array<Int>): Int {
        var jumps = 0;
        var i = 0;
       while (i < clouds.size) {
           print("cloud: " + clouds[i] + " at " + i)
            if (clouds[i] == 0)  {
                if (i>0) {
                    jumps++;
                }
                if (i > 0
                        && i+1 < clouds.size
                        && clouds[i+1] == 0
                        && clouds[i-1] != 1) {
                    i = i+1;
                }
            }
           i++;
           println(" jumps: " + jumps + " ")
        }

        return jumps;
    }


