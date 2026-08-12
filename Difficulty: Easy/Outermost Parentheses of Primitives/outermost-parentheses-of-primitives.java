class Solution {
    public String removeOuter(String s) {
        Stack<Character> st = new Stack<>();
        int depth=0;
        
        for(char ch:s.toCharArray()){
            if(ch=='('){
                if(depth>0){
                    st.push(ch);
                }
                depth++;
            }
            else{
                depth--;
                if(depth>0){
                    st.push(ch);
                }
            }

        }
        String ans="";
        for(char sh:st){
            ans+=sh;
        }
        return ans;
        
    }
}