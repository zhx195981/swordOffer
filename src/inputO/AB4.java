package inputO;

import java.util.Scanner;

public class AB4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i = 0;
        while(i < t){
            i++;
            int n = sc.nextInt();
            int j = 0;
            int sum = 0;
            while(j < n){
                sum = sum + sc.nextInt();
                j++;
            }
            System.out.println(sum);
        }

    }
}
