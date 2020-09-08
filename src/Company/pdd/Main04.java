package Company.pdd;

import java.util.HashSet;
import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] y = new int[m];
        for (int i = 0; i < m; i++) {
            y[i] = sc.nextInt();
        }
        int res = 0;
        HashSet<Integer> integers = new HashSet<>();

        for (int i = 0; i < m; i++) {
            int k = 1;
            int num = y[i] * k;
            while(num <= n){
                if(!integers.contains(num)){
                    res++;
                    integers.add(num);
                }
                num = y[i] * (++k);
            }

        }
        System.out.println(res);
    }

}
