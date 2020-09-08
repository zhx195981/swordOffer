package Company.HuaWei;

import java.util.*;

/**
 * 根据输入，输出查找到的兄弟单词的个数
 */
public class Main06 {
    public static boolean judgeBrother(String s1, String s2) {
        if (Objects.equals(s1, s2) || s2.length() != s1.length()) {
            return false;
        }
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for (int i = 0; i < ch1.length; i++) {
            if (!Objects.equals(ch1[i],ch2[i]) )
                return false;
        }

        return true;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            ArrayList<String> ls = new ArrayList();
            String[] arr = new String[n];
            int i = 0;
            while (n-- > 0) {
                arr[i] = sc.next();
                i++;
            }
            String s = sc.next();
            int num = sc.nextInt();
            for (String s1 : arr) {
                if (judgeBrother(s1, s)) {
                    ls.add(s1);
                }
            }
            System.out.println(ls.size());
            Collections.sort(ls);
            if(ls.size()>= num) {
                System.out.println(ls.get(num - 1));
            }
        }

    }
}
