/* Structure of a Binary Tree Node
class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int val) {
        data = val;
        left = right = null;
    }
};*/

class Solution {
    public int kthLargest(Node root, int k) {
        List<Integer> inorderlist = new ArrayList<>();
        Inorder(root,inorderlist);
        return inorderlist.get(inorderlist.size()-k);
        
    }
    public void Inorder(Node root,List<Integer> list){
        
        if (root==null) return;
        
        Inorder(root.left,list);
        list.add(root.data);
        Inorder(root.right,list);
    }
}