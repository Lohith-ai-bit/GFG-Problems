/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val)
    {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public int height(Node root) {
        if(root==null) return -1;
        
        int right=height(root.right);
        int left= height(root.left);
        
        return 1+Math.max(left,right);
    }
}