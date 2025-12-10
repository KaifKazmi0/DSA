package Practice.Collection;

public class Nothing {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }

    public static class LL{
        Node display(Node temp){
            while (temp.next!=null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            return temp;
        }

        void rmv(int n,Node head){

            Node temp = head;

            for (int i=0;i<n;i++){
                if (temp.next == null) {
                    System.out.println("Out of bound");
                    break;
                }
                temp = temp.next;
            }
            if (temp==null || temp.next==null) return;
            temp.next = temp.next.next;
        }


    }


    public static void main(String[] args){
        Node a = new Node(0);
        Node b = new Node(1);
        Node c = new Node(2);
        Node d = new Node(3);

        a.next = b;
        b.next = c;
        c.next = d;
        LL obj = new LL();
        Node abc = obj.display(a);
        System.out.println(abc.val);

        obj.rmv(5,a);

        obj.display(a);

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }


}
