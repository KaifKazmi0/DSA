package Practice.Collection;

import java.util.LinkedList;
import java.util.List;

public class ShallowCopy {

    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }

    }

    public static class LL{

        void display(Node head){
            while (head!=null){
                System.out.print(head.val+" ");
                head = head.next;
            }
        }

        public Node deepCopyLL(Node head) {
            Node x = new Node(0);
            Node y = x;
            while (head!=null){
                Node z = new Node(head.val);
                y.next = z;
                y = y.next;
                head = head.next;
            }
            return x.next;
        }
    }


    public static void main(String[] args) {
         Node a = new  Node(10);
         Node b = new  Node(11);
         Node c = new  Node(1);
         Node d = new  Node(4);
         Node e = new  Node(6);
         Node f = new  Node(5);


        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;


        LL obj = new LL();
        Node x = obj.deepCopyLL(a);
        obj.display(a);
        System.out.println();
        obj.display(x);

    }
}
