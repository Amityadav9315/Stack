public class Main {

    public static void main(String[] args) {
        System.out.println("stack example");
        Stack stack=new Stack(4);
        stack.push(56);
        stack.push(54);
        stack.push(50);
//        stack.displayElements();
//        System.out.println(stack.pop());
//        stack.displayElements();
//        stack.pop();
//        stack.displayElements();
        System.out.println(stack.peek());
        stack.displayElements();


    }
}
