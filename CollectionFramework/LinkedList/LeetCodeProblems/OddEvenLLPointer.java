package CollectionFramework.LinkedList.LeetCodeProblems;

public class OddEvenLLPointer {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }

    }

    public static class LL {

        void display(Node head) {
            while (head != null) {
                System.out.print(head.val + " ");
                head = head.next;
            }
        }

        Node oddEven(Node head){
            Node temp = head;
            Node Even = new Node(0);
            Node Odd = new Node(0);
            Node tempo = Odd;
            Node tempe = Even;
            while (temp!=null ){
                tempo.next = temp;
                temp = temp.next;
                tempo = tempo.next;
                if (temp==null) break;
                tempe.next = temp;
                temp = temp.next;
                tempe = tempe.next;
            }
            tempe.next = null;
            tempo.next = Even.next;
            return Odd.next;
        }


    }


    public static void main(String[] args) {
         Node a = new  Node(10);
         Node b = new  Node(11);
         Node c = new  Node(1);
         Node d = new  Node(4);
         Node e = new  Node(6);
         Node f = new  Node(5);
         Node g = new Node(20);


        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;


        LL obj = new LL();
        a = obj.oddEven(a);
        obj.display(a);

    }
}
