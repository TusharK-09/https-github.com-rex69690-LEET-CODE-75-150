class Solution {
    public String gcdOfStrings(String str1, String str2) {

       if(!(str1+str2).equals(str2+str1)){
        return "";
       }
        int n = str1.length() ;
        int m = str2.length();

        int len = gcd(n,m);

        return str1.substring(0,len);
        
        
    }

      public int gcd (int num1 , int num2){
        if(num2 == 0){
            return num1;
        }
          return gcd(num2,num1 % num2);
        
     }

}

      