package inputO;

import java.util.Scanner;

public class AB3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            if(n == 0)
                return;
            int i = 0;
            int sum = 0;
            while(i < n){
                sum = sum + sc.nextInt();
                i++;
            }

            System.out.println(sum);
        }

    }
}
