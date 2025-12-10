package CollectionFramework.LinkedList.LeetCodeProblems;

public class OddEvenLLFlag {
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

        Node oddEven(Node head){
            Node temp = head;
            Node O = new Node(0);
            Node tempo = O;
            Node E = new Node(0);
            Node tempe = E;
            boolean isOdd = true;
//            this is the optimal method
//            while (even != null && even.next != null) {
//                odd.next = even.next;
//                odd = odd.next;
//                even.next = odd.next;
//                even = even.next;
//            }
//            ye method optimal nhi h use pointer manipulation method
//            while (temp!=null){
//                if (isOdd){
//                    tempo.next = temp;
//                    tempo = tempo.next;
//                    isOdd = false;
//                }
//                else {
//                    tempe.next = temp;
//                    tempe = tempe.next;
//                    isOdd = true;
//                }
//                temp = temp.next;
//            }
//            tempo.next = E.next;
//            tempe.next = null;
//            head = O.next;
            return head;
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
        a = obj.oddEven(a);
        obj.display(a);


    }
}
