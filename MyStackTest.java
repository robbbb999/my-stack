package mystack;

public class MyStackTest {

    public static void main(String[] args) {
        MyStack stack = new MyStack(5);
        stack.push(4);
        stack.push(3);
        //stack.push(3);
        stack.push(6);
        stack.push(1);
        stack.push(2);
        //stack.push(4);
        int elem;
        try{
            elem = stack.pop();
            elem = stack.pop();
            elem = stack.pop();
            elem = stack.pop();
            elem = stack.pop();
           
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        try {
           elem=  stack.top();
           System.out.println(elem); 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(stack.isEmpty());
     
    }
    
}
