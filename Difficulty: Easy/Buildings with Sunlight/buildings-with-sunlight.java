class Solution {
    public int visibleBuildings(int arr[]) {
        int count=0;
        int maxheight=0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>=maxheight){
                count++;
                maxheight=arr[i];
            }
        }
        return count;
    }
}