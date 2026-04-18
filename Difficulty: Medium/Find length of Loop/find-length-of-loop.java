/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public int lengthOfLoop(Node head) {
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                int count=1;
                fast=fast.next;
                
                 while(fast!=slow){
                    count++;
                    fast=fast.next;
                
            }
             return count;
        
        }
    }
           
       
    return 0;   
    
    }
}