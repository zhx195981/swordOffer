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
