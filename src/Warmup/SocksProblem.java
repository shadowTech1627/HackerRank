package Warmup;

import java.util.HashMap;

public class SocksProblem {
    public static void main(String[] args) {
        int pairs = sockMerchant(7, new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20});
        System.out.println("Pairs: " + pairs);
    }

    static int sockMerchant(int n, int[] ar) {
        HashMap<Integer, Integer> socksPairMap = new HashMap<>();
        int pairs = 0;
        for (int i = 0; i < ar.length; i++) {
            if (socksPairMap.containsKey(ar[i])) {
                int previousCount = socksPairMap.get(ar[i]);
                socksPairMap.put(ar[i], (previousCount + 1));
            } else {
                socksPairMap.put(ar[i], 1);
            }

            int currentCount = socksPairMap.get(ar[i]);
            if (currentCount % 2 == 0) {
                pairs++;
            }
        }

        return pairs;

    }
}
