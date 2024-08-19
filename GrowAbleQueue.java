import java.util.ArrayList;

public class GrowAbleQueue <T>{
    private ArrayList<T> queue;

    public GrowAbleQueue(){
        queue=new ArrayList<>();
    }
    public void enqueue(T ele){
        
        queue.add(ele);
    }
    public T dequeue(){
        if(isEmpty()){
            throw new IllegalStateException("queue is empty");
        }
        return queue.remove(0);
    }
    public T peek(){
        return queue.get(0);
    }
    public boolean isEmpty(){
        return queue.isEmpty();
    }
    public int size(){
        return queue.size();
    }
    public static void main(String[] args) {
        GrowAbleQueue<Integer>queue=new GrowAbleQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Front element: " + queue.peek()); // Output: 1
        System.out.println("Dequeued: " + queue.dequeue());   // Output: 1
        System.out.println("Front element: " + queue.peek()); // Output: 2
        System.out.println("Queue size: " + queue.size());    // Output: 2

        queue.enqueue(4);
        queue.enqueue(5);
    }
}
