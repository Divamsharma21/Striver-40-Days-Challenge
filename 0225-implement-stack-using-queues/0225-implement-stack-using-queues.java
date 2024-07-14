
import java.util.*;
class MyStack {
Queue<Integer> s=new LinkedList<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
     s.add(x);
         for(int i=0;i<s.size()-1;i++)
       {
           s.add(s.poll());
       }
    }
    
    public int pop() {
       return s.remove();
    }
    
    public int top() {
        return s.peek();
    }
    
    public boolean empty() {
        if(s.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */