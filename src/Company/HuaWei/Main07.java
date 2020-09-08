package Company.HuaWei;

import java.util.Arrays;
import java.util.Comparator;

public class Main07 {
    public static void main(String[] args) {
        Integer[] arr = {1,5,8,0,4,6};
        Arrays.sort(arr,new IntComparator());
        for (Integer integer : arr) {
            System.out.println(integer);
        }


    }

}
class IntComparator implements Comparator<Integer> {


    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }
}
