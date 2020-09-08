package logic.pack;

/**
 * 问题描述：给你一个有N（N是奇数 && 1<=N<=999999）个数的序列，而且保证这N个数中有一个数M的数量  >=  （N + 1)/2 ，让你找出这个数M
 * 举个栗子：
 * intput: 9
 *            3 6 9 3 3 3 8 6 3
 * loc ：  1 2 3 4 5 6 7 8 9
 * 1、2位置删去 3、4位置删去 6、7位置删去 8、9位置删去，，还剩一个5位置，那么5位置的 3 就是要找的M .
 */
public class MinMajority {
    public static int findValue(int[] arr) {
        int length = arr.length;
        int[] dp = new int[length];
        int i = 1;
        while (i < length - 1) {
            if (arr[i] != arr[i - 1]) {
                dp[i] = 1;
                dp[i - 1] = 1;
            }
            i++;
        }

        for (int i1 : dp) {
            if(i1 == 0){
                return arr[i1];
            }
        }

        return arr[length-1];

    }
    public static void main(String[] args) {
        int[] arr = {1,0,1,0,1};
        System.out.println(findValue(arr));
    }
}
