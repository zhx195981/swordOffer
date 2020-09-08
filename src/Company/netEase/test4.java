package Company.netEase;

import java.util.HashMap;

class Exmoney {
    //数字与中文数字的对应
    private static final String one = "一";
    private static final String zero = "零";
    private static final String two = "二";
    private static final String three = "三";
    private static final String four = "四";
    private static final String five = "五";
    private static final String six = "六";
    private static final String seven = "七";
    private static final String eight = "入";
    private static final String nine = "九";

    //小数点前数字的单位
    private static final String ten = "十";
    private static final String hundred = "百";
    private static final String thousand = "千";
    private static final String tenThousand = "万";
    private static final String single = "元整";

    //小数点后数字的单位
    private static final String jiao = "角";
    private static final String fen = "分";

    //阿拉伯数字到中文数字的转换表
    private static HashMap<Integer, String> num = new HashMap();
    //单位表
    private static HashMap num1 = new HashMap();
    //单位表2
    private static HashMap num2 = new HashMap();


    //初始化数字表与单位表
    public static void init() {
        num.put(0, zero);
        num.put(1, one);
        num.put(2, two);
        num.put(3, three);
        num.put(4, four);
        num.put(5, five);
        num.put(6, six);
        num.put(7, seven);
        num.put(8, eight);
        num.put(9, nine);
        num1.put(1, ten);
        num1.put(2, hundred);
        num1.put(3, thousand);
        num1.put(4, tenThousand);
        num1.put(0, single);
        num2.put(0, jiao);
        num2.put(1, fen);
    }

    private static void ex(String a) {
        int length = a.length() - 1;
        if(length > 4)
            return;
        int i = 0;
        while (length >= 0) {
            System.out.print(num.get(a.charAt(i) - '0') + num1.get(length) + "");
            i++;
            length--;
        }
    }

    private static void ex1(String a) {
        int length = a.length() - 1;
        if(length > 1)
            return;
        int i = 0;
        while (length >= 0) {
            System.out.print(num.get(a.charAt(i) - '0') + num2.get(length) + "");
            i++;
            length--;
        }
    }

    public static void main(String[] args) {
        init();
        String s = "190.00";
        String s1 = s.split("\\.")[0];
        String s2 = s.split("\\.")[1];
        ex(s1);
        ex1(s2);

    }
}