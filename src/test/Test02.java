package test;

import java.util.HashSet;
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        HashSet<Integer> set = new HashSet<>();
        int numTotal = sc.nextInt();
        int numA = sc.nextInt();
        int numB = sc.nextInt();
        while (numA-- > 0) {
            set1.add(sc.nextInt());
        }
        while (numB-- > 0) {
            int temp = sc.nextInt();
            if (set1.contains(temp)) {
                set.add(temp);
                set2.add(temp);
            } else {
                set2.add(temp);
            }
        }

        int onlyA = set1.size() - set.size();
        int onlyB = set2.size() - set.size();
        int all = set.size();
        System.out.println(onlyA + " " + onlyB + " " + all);
    }
}