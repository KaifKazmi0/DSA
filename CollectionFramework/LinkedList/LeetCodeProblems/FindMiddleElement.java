package CollectionFramework.LinkedList.LeetCodeProblems;
// calculate lenght and divide it by two method is not excepted
//solve problem in one iteration
// HINT use slow fast pointer
public class FindMiddleElement {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }

    public static class LL{
        Node midEle(Node head){
            Node slow = head;
            Node fast = head;
            //false AND something = false
               while(fast!=null && fast.next!=null){
                   slow =slow.next;
                   fast = fast.next.next;
           }
            return slow;
        }

    }


    public static void main(String[] args) {
        Node a = new  Node(1);
        Node b = new  Node(2);
         Node c = new  Node(3);
         Node d = new  Node(4);
         Node e = new  Node(5);
         Node f = new  Node(6);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        LL obj = new LL();


        System.out.println( obj.midEle(a).val+" is the middle element of the LL");
    }
}
