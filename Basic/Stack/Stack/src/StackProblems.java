import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Stack;

public class StackProblems {


public static void main(String []args ){

    int []ar = {1,2,3,4,} ;

minAtEachPop(ar );
}


public static void   minAtEachPop (int []arr ){

    Stack<Integer> stack = new Stack();
    Stack<Integer> tempStack = new Stack();

    for ( int i = 0 ; i < arr.length;i++){
        stack.push(arr[i]);
    }

  while (!stack.isEmpty()){

      int min = findMinInStack(stack);
      System.out.println("MIN IS "+min );
      stack.pop();
  }

//    while (!stack.isEmpty()){
//        int peek = stack.peek();
//        System.out.println("POPPING "+peek);
//       int popped  = stack.pop();
//        System.out.println("POPPED "+popped);
//        tempStack= stack;
//        int min = Integer.MAX_VALUE;
//        while (!tempStack.isEmpty()){
//            min= Math.min(min,tempStack.pop());
//
//        }
//        System.out.println("MIN IS " +min);
//    }
}



public static void deleteMiddleOfStack (Stack  <Integer>  stack , int n ){


    if (n==0){return;}


    Stack<Integer> temp = new Stack();
    int middle = n/2 ;
 for ( int  i = 0 ; i < middle ;i ++){

     int popped = stack.pop();
     temp.push(popped);
 }

 stack.pop();

 while (!temp.isEmpty()){
     int popped = temp.pop();
     stack.push(popped);
 }
}


static void closestGreaterElement (int []arr){

    Deque<Integer> stack = new ArrayDeque<>();

    int n = arr.length;

stack.push(n-1);
int ans [] = new int [n ];
ans [n-1]= -1 ;

for (int i = n-2 ;i >=0 ; i--){
    while (!stack.isEmpty()&&stack.peek()<=arr[i]){
        stack.pop();
    }
    ans[i] = stack.isEmpty()?-1 : stack.peek();
    stack.push(arr[i]);

}



    for ( int i= 0 ; i < n ; i ++){
        System.out.println(ans[i]);
    }

}
static void closestPreviousGreatest (int[]arr){
    Deque<Integer> stack  = new ArrayDeque<>() ;
stack.push(0);
int ans = -1 ;
    System.out.println(ans );

    for (int i = 1 ; i < arr.length;i++){
        while (!stack.isEmpty()&&arr[stack.peek()]<=arr[i]){
            stack.pop();
        }

        ans = stack.isEmpty()?-1 : stack.peek();

        if (ans ==-1){
            System.out.println(-1);
        }
        else {
            System.out.println(arr[ans]);
        }

        stack.push(i);
    }


}
static void stockSpanProblem (int [] arr){
    Deque<Integer> stack  = new ArrayDeque<>() ;
    stack.push(0);
    int span =1 ;
    System.out.println(span +" ");
    for ( int i = 1 ; i < arr.length;i++){
        while(!stack.isEmpty()&& arr[i]>=arr[stack.peek()]){
            stack.pop();
        }
        span = stack.isEmpty()?i+1 : i-stack.peek();
        System.out.println(span);
        stack.push(i);
    }
}
    static boolean isBalancedParanthesis (String str){


        Stack<Character>stack = new Stack<>();

        for ( int i = 0 ; i < str.length() ; i ++){
            char c = str.charAt(i);

            if (c =='('||c=='['||c=='{'){
                stack.push(c);
            }
            else {
                if (stack.isEmpty()){
                    return false;
                }
                else if (!hasMatching(stack.peek(), c)){
                    return false;
                }
                else {
                    stack.pop();
                }

            }
        }
        return  stack.isEmpty();
    }

    static private boolean hasMatching (char  a , char  b){
        return  (a=='('&&b==')')||(a=='{'&&b=='}')||(a=='['&&b==']');
    }

    public static int findMinInStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            throw new IllegalArgumentException("Stack is empty");
        }

        int min = stack.peek();

        // Iterate through the stack to find the minimum
        for (int value : stack) {
            if (value < min) {
                min = value;
            }
        }

        return min;
    }
}
