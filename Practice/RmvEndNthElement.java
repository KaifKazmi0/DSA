package Practice;


public class RmvEndNthElement {
    public static class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public static class ll{


        void display(Node Head){
            Node temp = Head;
            while (temp!=null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }

        Node rmv(Node Head,int n){
            Node head = new Node(0);
            head.next = Head;
            Node slow = head;
            Node fast = head;

            for (int i=0;i<n+1;i++){
                fast = fast.next;
            }

            while(fast.next!=null){
                slow = slow.next;
                fast = fast.next;
            }
            slow.next = slow.next.next;


            return head.next;
        }




    }


    public static void main(String[] args) {

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        ll obj = new ll();
        obj.display(a);
        a = obj.rmv(a,6);
        obj.display(a);



    }
}
