package Company.HuaWei.xiaoZhao;

import java.util.ArrayList;
import java.util.Scanner;

public class Main02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = s.split(";")[0];
        String s2 = s.split(";")[1];
        char[] chPre = s1.toCharArray();
        char[] chAns = s2.toCharArray();

        int totalLen = 1;
        int step = 0;
        boolean flag = true;
        for (char ch : chAns) {
            if (ch == ' ' || ch == ',' || ch == '.' || ch == '!' || ch == '?') {
                totalLen++;
            }
        }

        if (s1.equalsIgnoreCase(s2)) {
            flag = false;
        }

        ArrayList<String> ls = new ArrayList<>();
        for (String c : s1.split(" ")) {
            ls.add(c);
        }

        if (flag) {
            for (String c : s2.split(" ")) {
                if (!ls.contains(c)) {
                    step++;
                }
            }
        }

        System.out.println("(" + step + "," + totalLen + ")");
    }
}
