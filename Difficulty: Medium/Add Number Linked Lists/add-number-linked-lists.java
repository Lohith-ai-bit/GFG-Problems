/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    public Node addTwoLists(Node head1, Node head2) {
        head1= reverse(head1);
        head2= reverse(head2);
        Node dummy = new Node(0);
        Node curr = dummy;
        int c=0;
        while(head1!=null||head2!=null || c!=0){
            int sum=c;
            if(head1!=null){
                sum+=head1.data;
                head1=head1.next;
            }
            if(head2!=null){
                sum+=head2.data;
                head2=head2.next;
            }
            c=sum/10;
            curr.next= new Node(sum%10);
            curr = curr.next;
        }
        Node res = reverse(dummy.next);
        while(res!=null && res.data==0 && res.next!=null){
            res=res.next;
        }
        return res;
        
    }
    public Node reverse(Node head){
         Node curr = head;
        Node prev= null;
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