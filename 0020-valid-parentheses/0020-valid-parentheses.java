import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        if (s.length() < 2) return false; 

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch); 
            } else {
                if (st.isEmpty()) return false;

                char top = st.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false; 
                }
            }
        }

        return st.isEmpty(); 
    }

}
