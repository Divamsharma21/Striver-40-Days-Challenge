// class MinStack {
// Stack<Integer> st=new Stack<>();
//     public MinStack() {
        
//     }
    
//     public void push(int val) {
        
//             st.push(val);
        
//     }
    
//     public void pop() {
//         // if(!st.isEmpty()){
//             st.pop();
//         // }
//     }
    
//     public int top() {
//           // if(st.isEmpty()) return 0;
        
//      return st.peek();
//     }
    
//     public int getMin() {
    
        
//            // return st.peek();
//           return Collections.min(st);
//     }
// }





class MinStack {
    Stack<Integer> stack=new Stack<>();
int min=Integer.MAX_VALUE;
public void push(int x) {
    if(x<=min) {stack.push(min); min=x;}
    stack.push(x);
}
public void pop() {
    if(stack.peek()==min){ stack.pop(); min=stack.pop(); }
    else stack.pop();
}
public int top() {
    return stack.peek();
}
public int getMin() {
    return min;
}
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */