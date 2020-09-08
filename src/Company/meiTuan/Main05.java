package Company.meiTuan;

import java.util.ArrayList;
import java.util.Scanner;

public class Main05 {
    static int length = 0;

    public static void Get(int start, int[][] arr, ArrayList<String> result, ArrayList<Integer> in) {
        if(in.size() > length)
            return;
        for (int i = 0; i < arr.length; i++) {
            if (arr[start][i] == 1) {
                if (in.contains(i)) {
                    for (Integer integer : in) {
                        result.add(integer + "");
                    }
                    return;
                }
                in.add(i);
                Get(i, arr, result, in);
            }


        }


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        length = sc.nextInt();
        int[][] arr = new int[length][length];

        for (int j = 0; j < length; j++) {
            for (int i = 0; i < length; i++) {
                arr[j][i] = sc.nextInt();
            }

        }
        ArrayList<String> result = new ArrayList<>();
        ArrayList<Integer> in = new ArrayList<>();
        int start = sc.nextInt();
        Get(start, arr, result, in);
        for (String s : result) {
            System.out.println(s);
        }


    }
}
