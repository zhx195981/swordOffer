package Company.HuaWei;

import java.math.BigInteger;
import java.util.Objects;

/**
 * 写出一个程序，接受一个十六进制的数，输出该数值的十进制表示
 */
public class Main01 {
    public static void main(String[] args) {
        String hex= Integer.toHexString(11);
        System.out.println(hex);
        System.out.println("0xA".split("x")[1]);

        BigInteger bigint=new BigInteger("A", 16);
        int numb1=bigint.intValue();
        System.out.println(numb1);

    }
}
