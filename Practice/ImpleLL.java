package Practice;

public class ImpleLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }



    public static class LinkedList{
        Node head = null;
        Node tail = null;

        int size = 0;


    public void insertAtEnd1(int val){
        Node temp = new Node(val);
        Node t = head;

        if(head==null){
            head = temp;
            tail = temp;
        }else {
            while(t.next!=null){
                t = t.next;
            }
            t.next = temp;
            tail = temp;
        }
        size++;

    }





        public void displayReverse(Node head){
            if(head == null) return;
            displayReverse(head.next);
            System.out.print(head.data+" ");
        }
        public void disRev(){
            displayReverse(head);
            System.out.println();
        }



        public void displayR(Node head){
            if (head==null) return;
            System.out.print(head.data+" ");
            displayR(head.next);


        }
        public void dis(){
            displayR(head);
            System.out.println();
        }



        public void insertAtStart(int val){
            Node temp = new Node(val);
            if (head==null){
                head = temp;
                tail = temp;
            }
            else {
                temp.next = head;
                head = temp;
            }
            size++;
        }

        public void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head==null){
                insertAtStart(val);
                return;
            }
            else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }


        public void display(){
            Node temp = head;
            while (temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }

        public int getElementAt(int idx){
            if(idx<0 || idx>=size){
                System.out.println("Wrong Index");
                return -1;
            }
            Node temp = head;
            for (int i=0;i<idx;i++){
                temp = temp.next;
            }
            return temp.data;
        }



        public void insertAt(int idx, int val) {
            if(idx<0 || idx>size){
                System.out.println("Wrong Index");
                return;
            }
            if (idx==0){
                insertAtStart(val);
                return;
            }
            if (idx==size){
                insertAtEnd(val);
                return;
            }
            Node nn = new Node(val);
            Node temp = head;
            for (int i=1;i<=idx-1;i++){
                temp = temp.next;
            }
            nn.next = temp.next;
            temp.next = nn;
            size++;
        }
    }

    public static void main(String[] args) {
        LinkedList ll  = new LinkedList();
        ll.insertAtStart(1);

        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);

        ll.display();

//        System.out.println(ll.getElementAt(2));
////        System.out.println(ll.getElementAt(3));
//        System.out.println(ll.size);
        ll.dis();
        ll.disRev();
    }



}
