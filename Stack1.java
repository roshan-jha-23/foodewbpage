public class Stack1 {
    protected int[] data;
    private static  final int DEFAULT_SIZE=10;
    int ptr=-1;

    public Stack1(){
        this(DEFAULT_SIZE);
    }
    public Stack1(int size){
        this.data=new int[size];
    }
    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack1 is Full");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;

    }
    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("cannot pop bro kuch hai hi nai");
        }

        int removed=data[ptr];
        ptr--;
        return removed;
    }
    public int peek() throws StackException{

        if(isEmpty()){
            throw new StackException("cannot pop bro kuch hai hi nai");
        }

        return data[ptr];
    }

    public boolean isFull() {
        return ptr==data.length-1;//pointer is at last index
    }
    public boolean isEmpty(){
        return ptr==-1;
    }

}
