public class Printer extends Thread {
    private PrintServer printServer;

    public Printer(PrintServer printServer) {
        this.printServer = printServer;
    }
    public void run(){
        while (true){
            printServer.printTask();
        }
    }
}
