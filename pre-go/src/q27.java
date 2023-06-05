import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class q27 {
    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3};
        int val = 2;
        for (int i=0; i<nums.length; i++){
            if (nums[i] == val){
                nums[i] = -1;
            }
        }

        Arrays.sort(nums, Collections.reverseOrder());
        System.out.println(nums[0]+""+nums[1]+""+nums[2]);
    }
}
