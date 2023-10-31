public class CustomQueue {
    private int[] data;
    private static final int DEFAULT_SIZE=10;

    int end=0;

    public CustomQueue(){
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size){
        this.data=new int[size];
    }
    public boolean isFull() {
        return end==data.length;//pointer is at last index
    }
    public boolean isEmpty(){
        return end==-1;
    }
    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++]=item;
        return true;
    }
public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("land lele");
        }
        int removed=data[0];
        //shift the elements here
    for(int i=1;i<=data.length;i++){
        data[i-1]=data[i];
    }
    end--;
    return removed;
}
public int peek()throws Exception{
    if(isEmpty()){
        throw new Exception("land lele");
    }
    return data[0];
}
public void display(){
    for (int i = 0; i < data.length; i++) {
        System.out.println(""+data[i]);
    }
}
}
