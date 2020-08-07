package inputO;
import java.util.*;
public class stringSort2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String[] arr = sc.nextLine().split(",");
            Arrays.sort(arr);
            for(int i = 0; i < arr.length - 1; i++) {
                System.out.print(arr[i] + ",");
            }
            System.out.println(arr[arr.length - 1]);

        }
    }
}
