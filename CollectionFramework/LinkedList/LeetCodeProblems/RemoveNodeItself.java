package CollectionFramework.LinkedList.LeetCodeProblems;

public class RemoveNodeItself {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }

    public static class LL{
        public void rmv(Node node){
            node.val = node.next.val;
            node.next = node.next.next;
        }

        public void display(Node head){
            while(head!=null){
                System.out.print(head.val+" ");
                head = head.next;
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        LL nv = new LL();
        Node a = new Node(100);
        Node b = new Node(101);
        Node c = new Node(102);
        Node d = new Node(103);
        Node e = new Node(104);
        Node f = new Node(105);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;


        //Remove node d from ll
        nv.display(a);
        nv.rmv(d);
        nv.display(a);
    }
}
