public class StackLinkedList {


    private Node top;

    public StackLinkedList() {
        this.top = null;
    }

    //push
    public void push(int data){
        Node node=new Node(data);
        node.next=top;
        top=node;


    }


    //pop
    public int  pop(){
        if(isEmpty()){
            System.out.println("List is empty");
            return -1;
        }
        else {

            int value=top.data;
            top=top.next;
            return value;


        }
    }


    //peek
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        else {
            return top.data;
        }
    }


    //isEmpty
    public boolean isEmpty() {
        return this.top==null;
    }


    //display


    public void  display(){
        if(isEmpty()){
            System.out.println("List is Empty");
            return;
        }
        else{
            Node temp=top;
            while(temp!=null){
                System.out.println(temp.data+"\t");
                temp=temp.next;
            }
            System.out.println();
        }
    }

}