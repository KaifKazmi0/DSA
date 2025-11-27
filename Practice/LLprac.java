package Practice;

public class LLprac {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }



    }

    static void display(Node temp){
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }


    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(3);
        Node c = new Node(2);
        Node d = new Node(1);
        Node e = new Node(0);


        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        display(a);




    }

}
