import java.util.Arrays;

class TwoSum {
    /* Given an array of integers, return indices of the two numbers 
       such that they add up to a specific target.
       Example: Given nums = [2, 7, 11, 15], target = 9
                Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
     */
    public static void main(String[] args){
        int[] nums = {1,3,5,7,9};
        int[] result = twoSum(nums, 14);
        System.out.println(Arrays.toString(result));
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for (int i=0; i<nums.length; i++){
            for (int j=i+1; j<nums.length; j++){
                if (nums[i]+nums[j]==target){
                    arr[0]=i;
                    arr[1]=j;
                }
            }
        }
        return arr;
    }
} 