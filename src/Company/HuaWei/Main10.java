package Company.HuaWei;
import java.util.*;
/*
密码是我们生活中非常重要的东东，我们的那么一点不能说的秘密就全靠它了。哇哈哈. 接下来渊子要在密码之上再加一套密码，虽然简单但也安全。
假设渊子原来一个BBS上的密码为zvbo9441987,为了方便记忆，他通过一种算法把这个密码变换成YUANzhi1987，这个密码是他的名字和出生年份，怎么忘都忘不了，而且可以明目张胆地放在显眼的地方而不被别人知道真正的密码。
他是这么变换的，大家都知道手机上的字母： 1--1， abc--2, def--3, ghi--4, jkl--5, mno--6, pqrs--7, tuv--8 wxyz--9, 0--0,就这么简单，渊子把密码中出现的小写字母都变成对应的数字，数字和其他的符号都不做变换，
声明：密码中没有空格，而密码中出现的大写字母则变成小写之后往后移一位，如：X，先变成小写，再往后移一位，不就是y了嘛，简单吧。记住，z往后移是a哦。
 CJFRR8pYzTjcMy860OS96WRU9C9XjNW178n1FnFmpNcUvrS
 */
public class Main10 {

    static HashMap<Character, Character> mapLow = new HashMap<>();
    static HashMap<Character, Character> mapHigh = new HashMap<>();

    public static void init() {
        mapLow.put('a', '2');
        mapLow.put('b', '2');
        mapLow.put('c', '2');
        mapLow.put('d', '3');
        mapLow.put('e', '3');
        mapLow.put('f', '3');
        mapLow.put('g', '4');
        mapLow.put('h','4');
        mapLow.put('i', '4');
        mapLow.put('j', '5');
        mapLow.put('k', '5');
        mapLow.put('l', '5');
        mapLow.put('m', '6');
        mapLow.put('n', '6');
        mapLow.put('o', '6');
        mapLow.put('p', '7');
        mapLow.put('q', '7');
        mapLow.put('r', '7');
        mapLow.put('s', '7');
        mapLow.put('t', '8');
        mapLow.put('u', '8');
        mapLow.put('v', '8');
        mapLow.put('w', '9');
        mapLow.put('x', '9');
        mapLow.put('y', '9');
        mapLow.put('z', '9');

        mapHigh.put('A', 'b');
        mapHigh.put('B', 'c');
        mapHigh.put('C', 'd');
        mapHigh.put('D', 'e');
        mapHigh.put('E', 'f');
        mapHigh.put('F', 'g');
        mapHigh.put('G', 'h');
        mapHigh.put('H', 'i');
        mapHigh.put('I', 'j');
        mapHigh.put('J', 'k');
        mapHigh.put('K', 'l');
        mapHigh.put('L', 'm');
        mapHigh.put('M', 'n');
        mapHigh.put('N', 'o');
        mapHigh.put('O', 'p');
        mapHigh.put('P', 'q');
        mapHigh.put('Q', 'r');
        mapHigh.put('R', 's');
        mapHigh.put('S', 't');
        mapHigh.put('T', 'u');
        mapHigh.put('U', 'v');
        mapHigh.put('V', 'w');
        mapHigh.put('W', 'x');
        mapHigh.put('X', 'y');
        mapHigh.put('Y', 'z');
        mapHigh.put('Z', 'a');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] ch = sc.nextLine().toCharArray();
        ArrayList<Character> ls = new ArrayList<>();
        init();
        for (char c : ch) {
            if (c <= '9' && c >= '0') {
                ls.add(c);
            } else if (c <= 'z' && c >= 'a'){
                ls.add(mapLow.get(c));
            }else if (c <= 'Z' && c >= 'A') {
                ls.add(mapHigh.get(c));
            }
        }

        for (Character l : ls) {
            System.out.print(l);
        }
    }
}
