class Solution {
    public int celebrity(int mat[][]) {
        Stack<Integer> st= new Stack<>();
        
        //step1: push all people
        for(int i=0;i<mat.length;i++){
            st.push(i);
        }
        //step2: eliminate non-celebrites
        while(st.size()>1){
            int a = st.pop(); //a=2
            int b=st.pop(); //b=1
            if(mat[a][b]==1){
                st.push(b);
                
            }
            else{
                //a does not know b -> b not celebrity
                
                st.push(a);  //st=[1]
            }
        }
        int cand=st.pop();
        for(int i=0;i<mat.length;i++){
            if(i!=cand){
                if(mat[cand][i]==1||mat[i][cand]==0){
                    return -1;
                }
            }
        }
        return cand;
    }
}