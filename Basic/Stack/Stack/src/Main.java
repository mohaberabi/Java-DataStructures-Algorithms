public class Main {
    public static void main(String[] args) {





        ArrayListStack stack = new ArrayListStack();



        stack.push(1);


        stack.push(2);
        stack.push(3);

        System.out.println(stack.getPeek());
        stack.pop();
        stack.pop();

        System.out.println(stack.getPeek());

    }
}