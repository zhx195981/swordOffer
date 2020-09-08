package Company.HuaWei.xiaoZhao;

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        double[][] pD = new double[n][m];
        double[][] pR = new double[n][m];
        double[][] pS = new double[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                pD[i][j] = sc.nextDouble();
                pR[i][j] = sc.nextDouble();
                pS[i][j] = sc.nextDouble();
            }

        }

        double[][] dp = new double[n][m];
        for (int i = 1; i < m; i++) {
            if(pR[0][i-1] < 0.0001d){
                dp[0][i] = 0d;
            }else{
                dp[0][i] = dp[0][i-1] + 1/pR[0][i-1];
            }
        }

        for (int i = 1; i < n; i++) {
            if(pD[i-1][0] < 0.0001d){
                dp[i][0] = 0d;
            }else{
                dp[i][0]  = dp[i-1][0]  + 1/pD[i-1][0] ;
            }
        }

//        for (int i = 1; i < n; i++) {
//            for (int j = 1; j < m; j++) {
//                if(pD[i-1][j] > 0.0001d && dp[i-1][j] > 0.0001d){
//                    dp[i][j] += dp[i-1][j] + 1/pD[i-1][j];
//                }
//
//                if(pR[i][j-1] > 0.0001d && dp[i][j-1]> 0.0001d){
//                    dp[i][j] += dp[i][j-1] + 1/pR[i][j-1];
//                }
//            }
//        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                double stepR = 0d;
                double stepD = 0d;
                double stepS = 0d;

                if(pD[i-1][j] > 0.0001d && dp[i-1][j] > 0.0001d){
                    stepD = 1 /pD[i-1][j];
                }

                if(pR[i][j-1] > 0.0001d && dp[i][j-1]> 0.0001d){
                    stepR = 1 /pR[i-1][j];
                }
                if(pS[i][j] > 0.0001d && dp[i][j]> 0.0001d){
                    stepS = 1 /pS[i][j];
                }

                double total = pD[i-1][j] + pR[i][j-1] + pS[i][j];
                if(total > 0.0001d)
                    dp[i][j] += stepD * pD[i - 1][j] /total + 1/pR[i][j-1];
            }
        }

        System.out.println(dp[n-1][m-1]);
    }
}
