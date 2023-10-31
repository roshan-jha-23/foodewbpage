public class QueueMain {
    public static void main(String[] args) {
       CustomQueue queue=new CustomQueue(5);
       queue.insert(45);
        queue.insert(85);
        queue.insert(5);
        queue.insert(12);
        queue.insert(23456789);
        queue.display();
    }
}
