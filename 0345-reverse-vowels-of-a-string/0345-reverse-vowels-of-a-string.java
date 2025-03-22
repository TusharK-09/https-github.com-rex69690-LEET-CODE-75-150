class Solution {
    public String reverseVowels(String s) {
        char[] str = s.toCharArray();
        String vowels = "AEIOUaeiou";

        int i = 0 ; //from start
        int j = str.length - 1;  //from end

        while(i < j){

            while(i < j && vowels.indexOf(str[i]) == -1){
                i++;
            }

            while(i < j && vowels.indexOf(str[j]) == -1){
                j--;
            }


            char ch = str[i];
            str[i] = str[j];
           str[j] = ch;
           i++;
           j--;
        }
        return new String(str);
    }
}