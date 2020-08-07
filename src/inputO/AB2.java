package inputO;

import java.util.Scanner;

public class AB2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if( a== 0 && b== 0)
                return;
            System.out.println( a+b);
        }
    }
}
