package inputO;

import java.util.Scanner;

public class AB6 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            while(sc.hasNext()){
                String[] arr = sc.nextLine().split(" ");
                int sum = 0;
                for (int i =0;i < arr.length; i++) {
                    sum += Integer.parseInt(arr[i]);
                }
                System.out.println(sum);
            }
        }
}
