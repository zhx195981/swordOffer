package netEase;

import java.util.Scanner;

public class test1 {
    public static int judge(int a){
        return  a/2;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum += judge(sc.nextInt());
        }
        System.out.println(sum);
    }

}
