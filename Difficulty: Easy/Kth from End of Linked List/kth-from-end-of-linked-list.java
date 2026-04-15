/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {

    int getKthFromLast(Node head, int k) {
        Node fast=head;
        Node slow=head;
        for(int i=0;i<k;i++){
            if(fast==null) return -1;
            fast=fast.next;
        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow.data;
        
    }
}