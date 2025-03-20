import java.util.HashSet;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> myHashSet = new HashSet<>();
        boolean check = false;
        for(int i = 0 ; i < nums.length ; i++){
            int temp  = nums[i];
            if(myHashSet.contains(temp)){
                check = true;
                break;
            }
            myHashSet.add(temp);
        }
        return check;
    }
    
}