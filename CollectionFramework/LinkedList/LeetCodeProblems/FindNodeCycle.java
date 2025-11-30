package CollectionFramework.LinkedList.LeetCodeProblems;

public class DetectCycle {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }


    public static class LL{
        boolean detectCycle(Node head){
            Node slow = head;
            Node fast = head;
            while (fast!=null){
                slow = slow.next;
                if (fast.next == null) return false;
                fast = fast.next.next;

                if(slow == fast) return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;

// Creating cycle: h points back to d
        h.next = d;


        LL obj = new LL();
        System.out.println(obj.detectCycle(a));

    }

}
