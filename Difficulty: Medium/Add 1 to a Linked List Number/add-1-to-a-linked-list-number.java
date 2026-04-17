/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node addOne(Node head) {
        head=reverse(head);
        int c=1;
        Node curr =head;
        while(curr!=null){
            int sum = curr.data+c;
            curr.data=sum%10;
            c=sum/10;
           
           if(c==0) break;
           
           if(curr.next==null& c!=0){
               curr.next = new Node(c);
               c=0;
               break;
           }
           curr=curr.next;
        }
        return reverse(head);
        
    }
    public Node reverse(Node head){
         Node curr = head;
        Node prev=null;
        Node next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}