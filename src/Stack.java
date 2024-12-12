public class Stack {

    private int[] array;
    private int maxSize;
    private int top=-1;

    public Stack(int size){
        this.maxSize=size;
        array=new int[maxSize];
        top=-1;

    }
    //push operation
    public void push(int data){
        if(top==maxSize-1){
            System.out.println("Stack overflow");
            return;
        }
        else{
            top++;
            array[top]=data;
        }
    }
    //display data
    public void displayElements(){
        if(top==-1){
            System.out.println("Stack is empty");
        }
        for(int i=0; i<=top; i++){
            System.out.println(array[i]+"\t");
        }
        System.out.println();
    }


}
