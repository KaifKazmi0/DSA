package CollectionFramework.LinkedList.StacksDir;

import java.util.Arrays;

public class ImplemntStackUsingArr {
    public static void main(String[] args) {
        MyStack st = new MyStack();
        st.push(5);
        st.push(1);
        st.push(5);
        st.push(1);
        st.push(5);
        st.display();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.display();
        st.pop();
        st.display();
    }
}

class MyStack{
    private int arr[] = new int[5];
    private int idx = 0;

    void push(int n){
        if(idx==5){
            System.out.println(" Error StackOverflow ");
            return;
        }
        arr[idx++] = n;
    }

    int pop(){
        if (idx==0) {
            System.out.println("Stack is empty");
            return -1;
        }
        int x = arr[idx-1];
        arr[idx-1] = 0;
        idx--;
        return x;
    }

    int peek(){
        if (idx==0){
            System.out.println("stack is empty");
            return -1;
        }
        return arr[idx-1];
    }

    int size(){
        return idx;
    }

    void display(){
        System.out.println(Arrays.toString(arr));
    }

}

