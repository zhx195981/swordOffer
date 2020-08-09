package logic;

import java.util.HashMap;

public class lengthOfLongestSubstring {
    public static int lengthOfLongestSubstring1(String s) {
        int result = 0;
        int i = 0;
        int j = 1;
        while(i < s.length() && j <= s.length()){
            if(isTrue(s.substring(i,j))){
                result = Math.max(j-i, result);
                j++;
                continue;
            }
            i++;
            j++;
        }
        return result;
    }

    public static boolean isTrue(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();
        for(char c : arr){
            if(map.containsKey(c))
                return false;
            map.put(c,0);
        }

        return true;

    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring1("abcabcbb"));
    }
}
