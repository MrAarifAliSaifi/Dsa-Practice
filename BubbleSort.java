import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {1, 4, 1, 4, 6, 4, 3, 2, 4, 56, 67, 5};
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]=temp;
                }
            }
        }
        int k=2;
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length-k]);
    }
}
