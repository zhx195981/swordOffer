package Company.HuaWei;

import java.util.Scanner;

/**
 * 计算最少出列多少位同学，使得剩下的同学排成合唱队形
 *
 * 说明：
 * N位同学站成一排，音乐老师要请其中的(N-K)位同学出列，使得剩下的K位同学排成合唱队形。
 * 合唱队形是指这样的一种队形：设K位同学从左到右依次编号为1，2…，K，他们的身高分别为T1，T2，…，TK，  、
 * 则他们的身高满足存在i（1<=i<=K）使得T1<T2<......<Ti-1<Ti>Ti+1>......>TK。
 * 你的任务是，已知所有N位同学的身高，计算最少需要几位同学出列，可以使得剩下的同学排成合唱队形。
 *
 * 最长子序列变种
 */
public class Main12 {
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
                count = Math.min(count, length - i);
            }
            System.out.println(count);
        }

    }

}
