package CollectionFramework.LinkedList.LeetCodeProblems;

public class TwinSumOfEvenLen {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }

    public static class LL{

        void display(Node head){
            while(head!=null){
                System.out.print(head.val+" ");
                head = head.next;
            }
        }


        Node midNode(Node head){
            Node slow = head;
            Node fast = head;
            while(fast.next!=null && fast.next.next!=null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }

        Node halfReverse(Node head){
            Node curr = head;
            Node prev = null;
            Node after = null;
            while(curr!=null){
                after = curr.next;
                curr.next = prev;
                prev = curr;
                curr = after;
            }
            return prev;

        }


        public int twinCheck(Node a, Node mid) {
            int max = Integer.MIN_VALUE;
            while (mid!=null){
                if (max < a.val+mid.val) {
                    max = a.val + mid.val;
                }
                    a = a.next;
                    mid = mid.next;




            }
            return max;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(10);
        Node c = new Node(13);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(2);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;

        LL obj = new LL();
        Node x = obj.midNode(a);
        Node mid = obj.halfReverse(x.next);
        x.next  = mid;
        obj.display(a);
        System.out.println();
        System.out.println(obj.twinCheck(a,mid)+" is the max twin of the linked list");




    }

}
