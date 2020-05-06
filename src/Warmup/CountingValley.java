package Warmup;

public class CountingValley {

    public static void main(String[] args) {
        String steps = "DDUUDDUDUUUD";
        int n = 8;
        count(steps);
    }

    private static int countValleys(String steps) {
        int initialValue = 0;
        int valleyCount = 0;
        boolean isClimbingHill = false;
        char[] stepsArray = steps.toCharArray();
        Character up = 'U';
        Character down = 'D';
        for (int i = 0; i < stepsArray.length; i++) {
            if (up.equals(stepsArray[i])) {
                if (i == 0 || initialValue == 0) {
                    isClimbingHill = true;
                }
                initialValue++;
                System.out.println("UP");
            } else if (down.equals(stepsArray[i])) {
                initialValue--;
                if (i == 0) {
                    isClimbingHill = false;
                }
                System.out.println("Down");

            }

            if (isClimbingHill && initialValue == 0) {
                isClimbingHill = false;
            } else if (initialValue == 0) {
                valleyCount++;
                System.out.println(valleyCount);
            }
        }
        return valleyCount;
    }

    private static int count(String s) {
        int level = 0;
        int valleys = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'U') {
                level++;
                if (level == 0) {
                    valleys++;
                }
            } else if (s.charAt(i) == 'D') {
                level--;
            }
        }
        System.out.println(valleys);
        return valleys;
    }
}
