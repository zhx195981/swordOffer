package inputO;

import java.util.Scanner;

public class AB1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i = 0;
        while (i < t) {
            System.out.println(sc.nextInt() + sc.nextInt());
            i++;
        }

    }
}
