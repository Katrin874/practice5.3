public class Main {
    public static void main(String[] args) {

            PrintServer printServer = new PrintServer();
            for(int i=0; i<10;i++){
                new User(printServer).start();
            }
            for (int i=0; i< 3;i++){
                new Printer(printServer).start();
            }

    }
}