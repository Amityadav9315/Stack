public class StackLinkedList {


    private Node top;

    public StackLinkedList() {
        this.top = null;
    }

    //push
    public void push(int data){
        Node node=new Node(data);


    }


    //pop


    //peek


    //isEmpty
    public boolean isEmpty() {
        if (this.top == null) {
            System.out.println("List is empty");
            return true;

        } else {
            return false;
        }
    }


    //display

}