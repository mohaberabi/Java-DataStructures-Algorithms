public class ArrayStack {


    private  int capacity ;
    private  int[] stack ;

    private int top;


    public ArrayStack(){

        top = -1 ;
        capacity = 10 ;
        stack = new int[10];
    }
    public ArrayStack(int cap){

        top = -1 ;
        capacity = cap ;
        stack = new int[cap];
    }




    int getPeek (){
        return  stack[top -1];
    }

    public void push (int data){
        top++;
        stack[top ]=data;
    }
    int pop (){
        int removed = stack[top ];
       top -- ;
        return  removed;

    }

    boolean isEmpty (){
       return stack.length==0;
    }


}
