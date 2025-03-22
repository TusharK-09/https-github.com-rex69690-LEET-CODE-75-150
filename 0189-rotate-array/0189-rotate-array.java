class Solution {
    public void rotate(int[] nums, int k) {
     int length = nums.length;
     int[] result = new int[length];
     int m = 0;
     for(int i = 0; i < length ; i++){
        result[(i+k)%length] = nums[i];
     }

     for(int j = 0;  j < length ; j++)
     {
        nums[j] = result[j];
     }
    }
}