import java.util.HashSet;

public class duplicates {

    public static boolean containsDuplicate(int[] nums) {
        // TODO: Write your code here
        HashSet<Integer> hs = new HashSet();
        for(int i=0;i<nums.length;i++){
            if(!hs.add(nums[i])){
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(containsDuplicate(new int[]{1,2,3,1}));
    }
}
