package Company.HuaWei;

import java.util.Scanner;

/**
 * 功能:输入一个正整数，按照从小到大的顺序输出它的所有质因子（重复的也要列举）（如180的质因子为2 2 3 3 5 ）
 */
public class Main02 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long num = Long.parseLong(scan.next());
        getPrimer(num);
    }

    public static void getPrimer(long num){
        for (int i= 2;i <= num; i++){
            if (num % i==0){
                System.out.print(i + " ");
                getPrimer(num/i);
                break;
            }

        }
    }
}