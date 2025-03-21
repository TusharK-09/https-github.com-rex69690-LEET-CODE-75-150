class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int i = 0 , j = 0;
        String ans = "";
        StringBuilder sb = new StringBuilder();
        while(i<n && j<m ){
            sb.append(word1.charAt(i));
            i++;
            sb.append(word2.charAt(j));
            j++;
        }

        //agr meri word2 string bdi hai word1 se
        //toh uske bache hue element add krne hai

        while(j<m){
            sb.append(word2.charAt(j));
            j++;
        }

           //agr meri word1 string bdi hai word2 se
        //toh uske bache hue element add krne hai

        while(i<n){
            sb.append(word1.charAt(i));
            i++;
        }


        return sb.toString();
    }
}