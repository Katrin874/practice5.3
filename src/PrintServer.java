import java.util.LinkedList;
import java.util.Queue;

public class PrintServer {
    private Queue<String> queue = new LinkedList<>();
    private final int maxQueueCapacity = 10;

    public synchronized void addTask(String task) {
        while (queue.size() >= maxQueueCapacity) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        queue.add(task);
        notifyAll();
    }
    public synchronized void printTask(){
        while (queue.isEmpty()){
            try{
                wait();
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        String task= queue.poll();
        System.out.println("Виконано "+task);
        notify();
    }

}
