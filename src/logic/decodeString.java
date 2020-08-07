package logic;
import java.util.Stack;
public class decodeString {

    /**
     * 输入：s = "3[a2[c]]"
     * 输出："accaccacc"
     * @param s
     * @return
     */
    public String decodeString1(String s) {
        StringBuilder res = new StringBuilder();
        int multi = 0;
        Stack<Integer> s1 = new  Stack();
        Stack<String> s2 = new  Stack();
        for(Character c:s.toCharArray()){
            if(c == '['){
                s1.push(multi);
                s2.push(res.toString());
                multi = 0;
                res = new StringBuilder();
            }else if(c == ']'){
                StringBuilder tmp = new StringBuilder();
                int cur_multi = s1.pop();
                for(int i = 0;i < cur_multi; i++) tmp.append(res);
                res = new StringBuilder(s2.pop() + tmp);

            }else if (c >= '0' && c <= '9'){
                multi = multi * 10 + Integer.parseInt(c + "");
            }

            else res.append(c);

        }

        return res.toString();

    }

}
