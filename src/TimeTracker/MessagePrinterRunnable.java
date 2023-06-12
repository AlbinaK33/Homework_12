package TimeTracker;

public class MessagePrinterRunnable implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("Минуло 5 секунд.");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
