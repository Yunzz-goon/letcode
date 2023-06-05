import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class q14 {
    public static void main(String[] args) {
        int [] nums = new int[]{1,0,-1,0,-2,2};
        int target = 0;
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        // marginal:
        if (nums.length < 4){
            System.out.println(results);
        }

        int left;
        int right;

        System.out.println(nums.length);
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-3; i++){
            System.out.println(i);
            if (i>0 && nums[i] == nums[i-1]){
                continue;
            } // because if it is the same as previous, either it got the same array before or will never eqaul to target(cuz has sorted)
            for (int j = i+1; j < nums.length-2; j++){
                if (j>i+1 && nums[j] == nums[j-1]){
                    continue;
                }
                left = j+1;
                right = nums.length-1;
                while (left < right){
                    if (nums[i] + nums[j] + nums[left] + nums[right] == target){
                        results.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        } // try to detour repetition like i and j
                        left++;
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        } // try to detour repetition like i and j
                        right--;
                    } else{
                        if (nums[i] + nums[j] + nums[left] + nums[right] > target){
                            right -= 1;
                        }else{
                            left += 1;
                        }
                    }

                }

            }
        }
        System.out.println(results);
    }

}
