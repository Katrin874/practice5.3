import java.util.concurrent.ThreadLocalRandom;

public class User extends  Thread{
    private PrintServer printServer;

    public User(PrintServer printServer) {
        this.printServer = printServer;
    }

    public void run(){
        int countOfTask = ThreadLocalRandom.current().nextInt(2,6);
        for(int i = 1; i<=countOfTask;i++){
            printServer.addTask("Завдання "+i+" від користувача" +Thread.currentThread().getName());
        }
    }
}
