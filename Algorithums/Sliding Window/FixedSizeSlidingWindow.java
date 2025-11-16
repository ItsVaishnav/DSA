import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FixedSizeSlidingWindow {
    public static void main(String[] args) {
        int[] arr = {2,3,5,7,8,9,8,5,3,2};
        List<Integer> ans = new ArrayList<>();
        int target = 3;
        for (int i = 0; i <= arr.length-target; i++) {
            int temp = 0;
            for (int j = i; j < i+target; j++) {
                if (temp < arr[j]) {
                    temp = arr[j];
                }
            }
            ans.add(temp);
        }
        System.out.println("Question : "+Arrays.toString(arr));
        System.out.println("Ans : "+ans);
    }
}