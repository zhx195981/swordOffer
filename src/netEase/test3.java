package netEase;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n+1];
            int[] b = new int[n+1];
            for (int i = 1; i <= n ; i++) {
                a[i] = sc.nextInt();

            }
            for (int i = 2; i <= n ; i++) {
                b[i] = sc.nextInt();

            }
            int[] dp = new int[n+1];
            dp[1] = a[1];
            for (int i = 2; i <= n; i++) {
                dp[i] = Math.min(dp[i-1] + a[i],dp[i-2] + b[i]);
            }
            int h = 8 + dp[n]/3600;
            int m = dp[n]%3600/60;
            int s = dp[n]%3600%60;

            char noon = 'a';

            if(h > 12){
                noon = 'p';
                h -= 4;

            }
            int d1 = h/10;
            int d2 = h%10;
            int d3 = m/10;
            int d4 = m%10;
            int d5 = s/10;
            int d6 = s%10;
            System.out.printf("%d%d:%d%d:%d%d %cm\n",d1,d2,d3,d4,d5,d6,noon);



        }
    }
}
