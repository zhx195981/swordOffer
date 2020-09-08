package Company.pdd;

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arrValue = new int[n+1];
        int[] arrWeight = new int[n+1];
        for (int i = 1; i <= n; i++) {
            arrValue[i] = sc.nextInt();
            arrWeight[i] = sc.nextInt();
        }

        int[][] dp = new int[n+1][10000];
        int size = m;
        int maxValue = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < size; j++) {
                if(arrWeight[i] > size)
                    dp[i][j] = dp[i-1][j];
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-arrWeight[i]] + arrValue[i]);
                    if(dp[i][j] != dp[i-1][j])
                        size = size - arrWeight[i];
                    maxValue = (maxValue > dp[i][j])?maxValue: dp[i][j];
                }

            }
        }
        System.out.println(maxValue);
    }
}
