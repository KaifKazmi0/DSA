package CollectionFramework.LinkedList.LeetCodeProblems;

public class IntersectionOf2LL {

    public static class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
        }
    }

    public static class LL {
        int calLength(Node head) {
            int count = 0;
            while (head != null) {
                head = head.next;
                count++;
            }
            return count;
        }


        Node intersPoint(Node slow, Node fast, int n) {
            for (int i = 0; i < n; i++) {
                fast = fast.next;
            }
            while (fast != slow) {
                fast = fast.next;
                slow = slow.next;
            }
            return fast;
        }

    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);

        Node x = new Node(9);
        Node y = new Node(8);

// List A
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

// List B
        x.next = y;
        y.next = d;  // <-- intersection starts here (Node 4)


        LL obj = new LL();
        int al = obj.calLength(a);
        int xl = obj.calLength(x);
        Node temp;
        if (al > xl) {
//            fast -> al;
            temp = obj.intersPoint(x,a,al-xl);
        } else {
            // slow -> xl;
           temp =  obj.intersPoint(a,x,xl-al);
        }

        System.out.println(temp.val+"is the intersected node");
    }
}