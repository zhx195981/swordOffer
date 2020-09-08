package Company.HuaWei;

import java.util.*;
/*
        开发一个简单错误记录功能小模块，能够记录出错的代码所在的文件名称和行号。
 */
public class Main05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new LinkedHashMap<>();
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            String[] arr1 = s.split(" ");
            String[] arr = arr1[0].split("\\\\");
            int length = arr.length;
            String res = arr[length - 1];
            if (res.length() > 16) {
                res = res.substring(res.length() - 16);
            }
            res = res + " " + arr1[1];


            if (map.containsKey(res)) {
                map.put(res, map.get(res) + 1);
            } else {
                map.put(res, 1);
            }

        }

        int cnt=0;
        for(Map.Entry<String,Integer> it:map.entrySet()){
            if(map.size()-cnt<=8)
                System.out.println(it.getKey()+" "+it.getValue());
            cnt++;
        }

        }
    }
