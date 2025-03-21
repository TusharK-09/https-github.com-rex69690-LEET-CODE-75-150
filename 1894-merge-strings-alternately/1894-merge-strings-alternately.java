class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();

        String res = "";
        String longerString ="";
        
        int min = Math.min(word1.length() , word2.length());

        if(min == word1.length()){
            longerString = word2;
        }
        else{
            longerString = word1;
        }

        for(int i = 0; i < min; i++){
            
                sb.append(word1.charAt(i));
                sb.append(word2.charAt(i));
            
        }
        sb.append(longerString.substring(min));

        res = sb.toString();
        return res;
    }
}