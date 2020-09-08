package test;

import java.util.*;

class Main02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int length = Integer.parseInt(sc.nextLine());
            String[] s = sc.nextLine().split(" ");

            int[] dpLeft = new int[length];
            dpLeft[0] = 1;
            for (int i = 1; i <= length - 1; i++) {
                for (int j = 0; j < i; j++) {
                    if (Integer.parseInt(s[i]) > Integer.parseInt(s[j])) {
                        dpLeft[i] = Math.max(dpLeft[i], dpLeft[j] + 1);
                    }
                }
                if (dpLeft[i] == 0)
                    dpLeft[i] = 1;
            }

            int[] dpRight = new int[length];
            dpRight[length - 1] = 1;
            for (int i = length - 2; i >= 0; i--) {
                for (int j = length - 1; j > i; j--) {
                    if (Integer.parseInt(s[i]) > Integer.parseInt(s[j])) {
                        dpRight[i] = Math.max(dpRight[i], dpRight[j] + 1);
                    }
                }
                if (dpRight[i] == 0)
                    dpRight[i] = 1;
            }
            int[] dp = new int[length];
            for (int i = 0; i < length; i++) {
                dp[i] = dpLeft[i] + dpRight[i] - 1;
            }
            int count = Integer.MAX_VALUE;
            for (int i : dp) {
                count = Math.min(count, 8 - i);
            }
            System.out.println(count);
        }

    }

}