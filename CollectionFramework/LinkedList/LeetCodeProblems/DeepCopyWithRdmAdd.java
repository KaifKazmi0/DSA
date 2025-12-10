    package CollectionFramework.LinkedList.LeetCodeProblems;

    public class DeepCopyWithRdmAdd {
        public static class Node{
            int val;
            Node next;
            Node rdm;

            Node(int val){
                this.val = val;
            }
        }

        public static class LL{
            Node deepCopyLL(Node head){
                Node temp = head;
                Node nayi = new Node(0);
                Node x = nayi;
                while (temp!=null){
                    Node y = new Node(temp.val);
                    x.next = y;
                    x = x.next;
                    temp = temp.next;
                }
                return nayi.next;
            }

            public void display(Node head) {
                if(head==null) {
                    System.out.println();
                    return;}
                System.out.print(head.val+" ");
                display(head.next);
            }


            public void connectAlt(Node head1,Node head2){

                Node a = head1;
                Node t1 = head1;
                Node t2 = head2;
                while (t1!=null && t2!=null){
                    a = t1.next;
                    t1.next = t2;
                    t1 = a ;

                    a = t2.next;
                    t2.next = t1;
                    t2 = a;
                }
//                display(head1);
//                System.out.println();





//                Node nayi = new Node(0);
//                Node t = nayi;
//                t.next = head1;
//                Node t1 = head1;
//                Node t2 = head2;
//                while (t1!=null){
//                    t = t1.next;
//                    t1.next = t2;
//                    t1 = t;
//
//                    t = t2.next;
//                    t2.next = t1;
//                    t2 = t;
//                }
//                display(nayi);
            }

            public void rdmPointers(Node head1, Node head2) {
                Node t1 = head1;
                Node t2 = head2;
                while (t1!=null&& t2!=null){
                    if (t1.rdm==null) t2.rdm = null;
                    else {
                        t2.rdm = t1.rdm.next;
                    }

                    if(t1.next!=null) t1 = t1.next.next;
                   if(t2.next!=null) t2 = t2.next.next;
                }
            }

            public void seperateList(Node head1, Node head2) {
                Node t1 = head1;
                Node t2 = head2;
                while (t1!=null){
                   t1.next = t2.next;
                   t1 = t1.next;
                   if(t1==null) {
                       t2.next = null;
                       break;
                   }
                   t2.next = t1.next;
                   t2 = t2.next;
                }

            }
        }


        public static void main(String[] args) {
            Node a = new  Node(7);
             Node b = new  Node(13);
             Node c = new  Node(11);
             Node d = new  Node(10);
             Node e = new  Node(1);
            a.next = b;
            a.rdm = null;
            b.next = c;
            b.rdm = a;
            c.next = d;
            c.rdm = e;
            d.next = e;
            d.rdm = c;
            e.rdm = a;


            LL obj = new LL();
            //step 1 deep copy Normal LL
            Node x = obj.deepCopyLL(a);

            //Step 2  Connection alternate
           obj.connectAlt(a,x);


           //Step 3 Assigning Random Pointers
            obj.rdmPointers(a,x);

            //Step 4 Separating the list
            obj.seperateList(a,x);


            obj.display(a);
            System.out.println();
            obj.display(x);


        }


    }
