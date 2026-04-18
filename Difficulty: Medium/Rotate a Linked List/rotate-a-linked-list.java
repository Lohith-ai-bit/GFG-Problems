/*
class Node {
    int data;
    Node next;

    Node(int d){
        data=d;
        next=null;
   }
}
*/

class Solution {
    public Node rotate(Node head, int k) {
        if(head==null||head.next==null) return head;
        
        //find the length
        int count =1;
        Node curr = head;
        while(curr.next!=null){
            curr=curr.next;
            count+=1;
        }
        
        // normalize k
        k=k%count;
        if(k==0) return head;
        
        //step3: Make circular list
        curr.next=head;
        
        Node temp= head;
       for(int i=1;i<k;i++){
           
          temp=temp.next; 
       } 
       
        head=temp.next;
        temp.next=null;
    return head;
    }
}