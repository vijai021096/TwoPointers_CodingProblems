import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String ab[]) {

        System.out.println(Arrays.toString(twoSum(new int[]{3, 7, 1, 2, 8, 4, 5}, 11)));
    }

        public static int[] twoSum(int[] nums, int target) {

            HashMap<Integer,Integer> hm = new HashMap<>();
            for(int i=0;i<nums.length;i++){
                int ans=target-nums[i];
                if(hm.containsKey(ans)){
                    return new int[]{hm.get(ans),i};
                }
                hm.put(nums[i],i);
            }
            return new int[]{-1,-1};
        }
    }

