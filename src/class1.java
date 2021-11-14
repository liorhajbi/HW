
import java.util.Scanner;
public class class1 {

    public static void main(String[] args) {
      int[] arr={1,2,3,4,5,6,7};
    System.out.println(sumArr(arr));
    }
        public static int sumArr( int arr[]){
            int sum = 0;
            for (int k = 0; k < arr.length; k++) {
                sum = sum + arr[k];
            }
            return sum;
        }

}