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
    public Node insertAtEnd(Node head, int x) {
        Node a = new Node(x);
        if(head==null){
            return a;
        }
        Node point=head;
        while(point.next!=null){
            point=point.next;
        }
        point.next=a;
        return head;
    }
}