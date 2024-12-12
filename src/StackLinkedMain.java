public class StackLinkedMain {
    public static void main(String[] args) {
        StackLinkedList stackLinkedList=new StackLinkedList();
        stackLinkedList.display();
        stackLinkedList.push(90);
        stackLinkedList.push(34);
        stackLinkedList.push(54);
        stackLinkedList.display();
        System.out.println(stackLinkedList.pop());
        stackLinkedList.display();
    }
}
