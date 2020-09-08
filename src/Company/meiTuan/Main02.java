package Company.meiTuan;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            int[] arr = new int[num];
            for (int i = 0; i < num; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] == 2) {
                    System.out.println("NO");
                }
            }
            System.out.println("YES");
        }

    }
}
