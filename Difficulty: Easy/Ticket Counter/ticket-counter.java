class Solution {
    public static int distributeTicket(int n, int k) {
        int f =1,r=n;
        boolean fromFront = true;
        
        while(f<=r){
            if(fromFront){
                if(f+k-1>=r) return r;
                f+=k;
            }
            else{
                if(r-k+1<=f) return f;
                r-=k;
            }
            fromFront = ! fromFront;
        }
        return -1;
    }
}