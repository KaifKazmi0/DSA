package CollectionFramework.LinkedList.LeetCodeProblems;

public class DeleteMidElement1 {
    public static class Node{
        int val;
          Node next;
        Node(int val){
            this.val = val;
        }
    }

    public static class LL{

        void display(  Node Head){
              Node temp = Head;
            while (temp!=null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }


          Node rmv(  Node head){
            if (head == null || head.next == null) return null;
              Node slow = head;
              Node fast = head;
            while (fast.next.next!=null && fast.next.next.next!=null){
                    slow = slow.next;
                fast = fast.next.next;
            }
            slow.next = slow.next.next;
            return head;





        }

    }

    public static void main(String[] args) {
          Node a = new   Node(1);
          Node b = new   Node(2);
          Node c = new   Node(3);
          Node d = new   Node(4);
          Node e = new   Node(5);
          Node f = new   Node(6);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

          LL obj = new   LL();

        a = obj.rmv(a);
        obj.display(a);

    }
}
