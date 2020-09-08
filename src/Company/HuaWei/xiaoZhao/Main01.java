package Company.HuaWei.xiaoZhao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main01 {

    public static String calFeature(String choseFeature, int threshold) {
        StringBuilder sb = new StringBuilder();
        char[] ch = String.valueOf(choseFeature).toCharArray();
        for (char c : ch) {
            int a = c - '0';
            if(a < threshold){
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> numIn = new ArrayList<>();
        List<String> numFeature = new ArrayList<>();
        while (sc.hasNext()) {
            String s = sc.nextLine();
            if (s.isEmpty())
                break;
            numIn.add(s);
        }
        int threshold = Integer.parseInt(numIn.get(numIn.size() - 2));
        String choseFeature = numIn.get(numIn.size() - 1);
        numIn.remove(numIn.size() - 2);
        numIn.remove(numIn.size() - 1);

        for (int i = 0; i <numIn.size() ; i++) {
            numFeature.add(calFeature(numIn.get(i),threshold));

        }
        choseFeature = calFeature(choseFeature, threshold);
        for (int i = 0; i < numFeature.size(); i++) {
            if (String.valueOf(numFeature.get(i)).contains(choseFeature)) {
                System.out.println(numIn.get(i));
            }

        }
    }
}
