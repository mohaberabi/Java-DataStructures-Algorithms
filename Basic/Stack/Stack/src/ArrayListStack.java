import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListStack {


    private final ArrayList<Integer> stack = new ArrayList<>();

  public   ArrayListStack (){}


int getPeek (){
      return  stack.get(stack.size()-1);
}

    public void push (int data){
      stack.add(data);
    }
    int pop (){
      int removed = stack.get(stack.size()-1);
      stack.remove(stack.size()-1);
      return  removed;

    }

    boolean isEmpty (){
      return stack.size()==0;
    }



}
