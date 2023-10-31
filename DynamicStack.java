public class DynamicStack extends Stack1 {
public DynamicStack(){
    super();

}
public DynamicStack(int size){
    super(size);
}

    @Override
    public boolean push(int item) {
    if(isFull()){
        // double the array size
        int [] temp=new int[2* data.length];
        for(int i=0;i< temp.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }
    //
        return super.push(item);
    }
}
