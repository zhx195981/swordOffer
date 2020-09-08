package logic.pack;

import java.util.Scanner;

/**
 *免费馅饼
 * http://acm.hdu.edu.cn/showproblem.php?pid=1176
 */
public class FreeDinner {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] dp = new int[num + 1][11];
        int[][] arr = new int[num + 1][11];
        int maxTime = 0;
        while (num-- > 0) {
            int position = sc.nextInt();
            int time = sc.nextInt();
            if (time == 1 && position <= 6 && position >= 4) {
                dp[time][position] = 1;
            }
            maxTime = Math.max(maxTime, time);

            arr[time][position] += 1;
        }

        for (int i = 2; i <= maxTime; i++) {
            for (int j = 0; j < 11; j++) {
                int left = 0;
                int right = 0;
                int middle;
                if (j - 1 >= 0) left = dp[i - 1][j - 1];
                if (j + 1 <= 10) right = dp[i - 1][j + 1];
                middle = dp[i - 1][j];

                dp[i][j] = Math.max(middle + arr[i][j], Math.max(left + arr[i][j], right + arr[i][j]));
            }

        }
        if (sc.nextInt() == 0)
            sc.close();

        int res = Integer.MIN_VALUE;
        for (int i = 0; i <= 10; i++) {
            res = Math.max(res, dp[maxTime][i]);
        }

        System.out.println(res);
    }
}
