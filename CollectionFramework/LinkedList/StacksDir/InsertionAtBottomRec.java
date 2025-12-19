package CollectionFramework.LinkedList.StacksDir;

import java.util.Stack;

public class InsertionAtBottomRec {
    static void insertB(Stack<Integer> st,int n){
        if(st.empty()){
            st.push(n);
            return;
        }
        int top = st.pop();
        insertB(st,n);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        for (int i=1;i<=5;i++){
            st.push(i);
        }
        System.out.println(st);

        insertB(st,6);
        System.out.println(st);
    }
}
