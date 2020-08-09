package netEase;

import java.util.Scanner;

public class test2 {
    static int a;
    static int b;
    static int c;
    static int[] arr;
    static int n, ret;

    public static void dfs(int u){

        if(u == n){
            if(a == b) {
                ret = Math.min(ret, c);
                return;
            }
        }
        a += arr[u];
        dfs(u+1);
        a -= arr[u];

        b += arr[u];
        dfs(u+1);
        b -= arr[u];

        c += arr[u];
        dfs(u+1);
        c -= arr[u];


    }
    public int tallestBillboard(int[] rods) {
        int sum = 0;
        for (int rod : rods) {
            sum += rod;
        }
        // dp[i][j]
        // 以i结尾  支架两边相差为j的情况下，两边支架之和的最大值
        int[][] dp = new int[rods.length + 1][sum + 1];
        for (int i = 1; i <= rods.length; i++) {
            for (int j = 0; j <= sum; j++) {
                if (dp[i - 1][j] < j) continue;
                // 不选当前的支架
                dp[i][j] = Math.max(dp[i][j], dp[i - 1][j]);
                // 选择当前的支架
                // 支架两边相差为j的时候可以选择两种情况来添加支架。假设3 6 中间差值为3(j)
                // 可以把当前支架放到6上面 这样两边的差值就变成6了 也就是 j + rods[i - 1]
                int k = j + rods[i - 1];
                dp[i][k] = Math.max(dp[i][k], dp[i - 1][j] + rods[i - 1]);
                // 选择当前支架放到低的那边也就是3的那边这样差值就变成了0了 也就是 |j - rods[i - 1]|
                k = Math.abs(j - rods[i - 1]);
                dp[i][k] = Math.max(dp[i][k], dp[i - 1][j] + rods[i - 1]);
            }
        }
        return dp[rods.length][0] / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                ret += arr[i];
            }

            dfs(0);
            System.out.println(ret);




        }

    }

}
