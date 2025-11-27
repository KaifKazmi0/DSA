package CollectionFramework.LinkedList;

public class DemoLL {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }

    }

    static int length(Node Head){
        int count = 0;
        while (Head!=null){
            count++;
            Head = Head.next;
        }
        return count;
    }

    static int lengthr(Node Head,int count){
        if (Head==null) return count;
        count++;
        return lengthr(Head.next,count);

    }



    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

        Node abc = new Node(6); //wants to add it on 2nd pos
        a.next = abc;
        abc.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        //Traversing through ll basic method for known length
        Node temp = a;
//        for(int i=1;i<=6;i++){
//            System.out.print(temp.data+" ");
//            temp = temp.next;
//        }


        //unknown length
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

        //displaying ll via func and recursion



        //Length method

        //Using iterative method
        System.out.println();
        System.out.println(length(a));

        //
        System.out.println(lengthr(a,0));


    }
}
