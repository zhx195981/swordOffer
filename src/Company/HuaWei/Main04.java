package Company.HuaWei;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 * decription:识别有效的IP地址和掩码并进行分类统计
 */
public class Main04 {
    static int[] res = {0, 0, 0, 0, 0, 0, 0};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {

            String s = sc.nextLine();
            String ip = s.split("~")[0];
            String code = s.split("~")[1];

            String[] ipArr = ip.split("\\.");
            String[] codeArr = code.split("\\.");
            boolean isTrue = true;

            //判断IP是否错误
            int number = Integer.parseInt(ipArr[0]);
            if (number == 0 || number == 127) {
                continue;
            }
            for (String s1 : ipArr) {
                if (s1 == null || s1 == "" || s1.length() == 0)
                    isTrue = false;
            }

            //判断掩码是否错误
            ArrayList<String> ls = new ArrayList();
            ls.add("0");
            ls.add("128");
            ls.add("192");
            ls.add("224");
            ls.add("240");
            ls.add("248");
            ls.add("252");
            ls.add("254");
            if (isTrue) {
                if (Objects.equals(codeArr[0], "255")) {
                    if (Objects.equals(codeArr[1], "255")) {
                        if (Objects.equals(codeArr[2], "255")) {
                            if (Objects.equals(codeArr[3], "255") || !ls.contains(codeArr[3])) {
                                isTrue = false;
                            }
                            else
                                isTrue = true;
                        }
                        else if(ls.contains(codeArr[2])){
                                if(!Objects.equals(codeArr[3], "0"))
                                    isTrue = false;
                                else
                                    isTrue = true;
                        }else
                            isTrue = false;

                    } else if(ls.contains(codeArr[1])){
                        if(!Objects.equals(codeArr[2], "0") || !Objects.equals(codeArr[3], "0"))
                            isTrue = false;
                        else
                            isTrue = true;
                    }else
                        isTrue = false;


                }else if(ls.contains(codeArr[0])){
                    if(!Objects.equals(codeArr[1], "0") || !Objects.equals(codeArr[2], "0")|| !Objects.equals(codeArr[3], "0"))
                        isTrue = false;
                    else
                        isTrue = true;
                }else
                    isTrue = false;
            }

            if(isTrue){
                int first = Integer.parseInt(ipArr[0]);
                int second = Integer.parseInt(ipArr[1]);
                judgeIP(first,second);
            }else {
                res[5]++;
            }

        }


            System.out.print(res[0] + " " + res[1] + " " + res[2] +" " +  res[3] + " " + res[4] + " " + res[5] + " " + res[6]);

    }

    public static void judgeIP(int first,int second){
        if(first >= 1 && first <= 126)
            res[0]++;
        else if(first >= 128 && first <= 191)
            res[1]++;
        else if(first >= 192 && first <= 223)
            res[2]++;
        else if(first >= 224 && first <= 239)
            res[3]++;
        else if(first >= 240 && first <= 255)
            res[4]++;

        if(first == 10)
            res[6]++;
        else if(first == 172 && second <= 31 && second >= 16)
            res[6]++;
        else if(first == 192 && second == 168)
            res[6]++;

    }
}