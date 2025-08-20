class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                st.push(s.charAt(i));
            }else{
                if(st.isEmpty()) return false;
                char ch = st.peek();
                st.pop();
                if ((ch == '(' && c != ')') ||
                    (ch == '[' && c != ']') ||
                    (ch == '{' && c != '}')) {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}