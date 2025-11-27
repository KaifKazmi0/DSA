package CollectionFramework.LinkedList;

public class ImplementingSInglyLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static class LinkedList{
        Node Head = null;
        Node tail = null;

        void insertAtEnd(int val){
            Node temp = new Node(val);
            if (Head == null){
                Head = temp;
                tail = temp;
            }else {
                tail.next = temp;
                tail = temp;
            }
        }

        void insertAtStart(int val){
            Node temp = new Node(val);
            if(Head==null){
                Head = temp;
                tail = temp;
            }else{
                temp.next = Head;
                Head = temp;
            }

        }


        void insertAt(int idx, int val){
            if (idx == 0){
                insertAtStart(val);
                return;
            }
            if (idx == size()){
                insertAtEnd(val);
                return;
            }


            Node t = new Node(val);
            Node temp = Head;
            for (int i=1;i<=idx-1;i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }


        void getElementAt(int idx){
            if(idx < 0 || idx >= size()){
                System.out.println("wrong index");
                return;
            }

            Node temp = Head;
            for (int i=0;i<idx;i++){
                temp = temp.next;
            }
            System.out.println(temp.data);
        }




        void display(){
            Node temp = Head;
            while (temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size(){
            Node temp = Head;
            int count = 0;
            while (temp!=null){
                count++;
                temp = temp.next;
            }
            return count;
        }




    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
//        ll.insertAtEnd(1); // inserting 1 which is first element of ll
//        ll.insertAtEnd(2); //inserting 2 at the end
//        ll.display();
//        ll.size();
//        ll.insertAtEnd(4);
//        ll.display();
//
//
//        //inserting at the start
//        ll.insertAtStart(0);
//        ll.display();
//        ll.insertAtStart(-1);
//        ll.display();
//
//
//        //inserting at a given index
//        ll.insertAt(4,3);
//        ll.display();






        ll.insertAtStart(1);
        ll.insertAt(1,2);
        ll.insertAt(2,3);

        ll.display();
        ll.getElementAt(2);


    }


}
