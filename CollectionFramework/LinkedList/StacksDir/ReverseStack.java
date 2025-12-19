package CollectionFramework.LinkedList.StacksDir;

import java.util.Stack;

public class ReverseStack {

    static void insertAtB(Stack<Integer> st, int n){
        if(st.empty()){
            st.push(n);
            return;
        }
        int top = st.pop();
        insertAtB(st,n);
        st.push(top);
    }


    static void reverseSt(Stack<Integer> st){
        if (st.empty()) return;
        int top = st.pop();
        reverseSt(st);
        insertAtB(st,top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        for (int i=1;i<=5;i++){
            st.push(i);
        }
        System.out.println(st);
        reverseSt(st);
        System.out.println(st);
    }
}
