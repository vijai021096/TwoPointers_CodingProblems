import java.sql.Statement;
import java.util.Arrays;

public class ThreeSum {

    public static void main(String[] args) {

        System.out.println(findSumOfThree(new int[]{3,7,1,2,8,4,5}, 20));
    }

    private static boolean findSumOfThree(int[] nums, int target) {

        Arrays.sort(nums);

        for(int i=0;i<nums.length-2;i++){
            int k=i+1;
            int j=nums.length-1;
            while(k<j){
                int ans=nums[i]+nums[j]+nums[k];
                if(ans==target)
                    return true;
                else if(ans>target){
                    j--;
                }
                else if(ans<target){
                    k++;
                }
            }
        }


        return false;
    }
}


