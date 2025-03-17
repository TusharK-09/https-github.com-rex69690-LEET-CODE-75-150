class Solution {
    public void sortColors(int[] nums) {
       int temp = 0;
       int minIndex = 0;
       for(int i = 0 ; i < nums.length - 1 ; i++){
        minIndex = i;
        for(int j = i + 1 ; j < nums.length ; j++){
            if(nums[j] < nums[minIndex]){
                minIndex = j;
            }
        }

        //swapping kardo
        temp = nums[i];
        nums[i] = nums[minIndex];
        nums[minIndex] = temp;
       }
    
    }
}