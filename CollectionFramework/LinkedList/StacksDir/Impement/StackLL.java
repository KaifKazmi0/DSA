package CollectionFramework.LinkedList.StacksDir.Impement;

import java.util.Arrays;

public class StackLL{
    private static class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
        }
    }

    public static class Stack1{
        private Node head = null;
        private int count = 0;

        public void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            count++;
        }

        public int pop(){
            if(head==null){
                throw new StackOverflowError("Stack is empty nigga");
            }else {
                int n = head.val;
                head = head.next;
                count--;
                return n;
            }
        }

        public int peek(){
            if(head==null) {
                System.out.println("Stack is empty");
                return Integer.MIN_VALUE;
            }else {
                return head.val;
            }
        }

        public int size(){
            return count;
        }

        public boolean isEmpty(){
            return head == null;
        }

        public String stack(){
            Node temp = head;
            int arr[] = new int[count];
            for (int i = count-1;i>=0;i--){
                arr[i] = temp.val;
                temp = temp.next;
            }
            return Arrays.toString(arr);
        }


        @Override
        public String toString() {
            return stack();
        }
    }
}

