package CollectionFramework.LinkedList.LeetCodeProblems;

public class LastNthNode {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }

    }

    public static class LL{

        //x -> n from last of linked list
        public Node getNode(Node head,int x){
            Node fast = head;
            Node slow = head;
            for (int i=0;i<x;i++){
                fast = fast.next;
            }
            while(fast!=null){
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }



        public Node getNode1(Node head,int n){
            Node temp = head;
            int size = 0;
            while (temp!=null){
                temp = temp.next;
                size++;
            }
            int m = size - n + 1;
            temp = head;
            for (int i=0;i<m-1;i++){
                temp = temp.next;
            }
            return temp;
        }


    }


    public static void main(String[] args) {
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

        LL mth = new LL();
        Node temp = mth.getNode(a,3);
        Node temp1 = mth.getNode1(a,3);
        System.out.println(temp.val+" "+temp1.val);

    }
}
