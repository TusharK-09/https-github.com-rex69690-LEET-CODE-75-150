class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>(candies.length);
        int max = candies[0];

        for(int i = 1; i < candies.length ; i++)
        {
            if(candies[i] > max){
                max = candies[i];
            }
        }

        for(int i = 0; i < candies.length; i++)
        {
            int added  = candies[i] + extraCandies;
            if(added >= max)
            {
                result.add(true);
            }
            else
            {
                result.add(false);
            }
        }

        return result;
    }
}