class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        int n = q.size();
        if(k>n||k<=0) return q;
        reverseQ(q,k);
        for(int i=0;i<n-k;i++){
            q.add(q.poll());
        }
        return q;
    }
    private void reverseQ(Queue<Integer> q, int k){
        if(k==0) return;  //base case
        //recursive case
        int f=q.poll();  // f=1
        reverseQ(q,k-1);
        q.add(f);
        
    }
}