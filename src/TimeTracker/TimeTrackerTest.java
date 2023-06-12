package TimeTracker;

public class TimeTrackerTest {
    public static void main(String[] args) {
        Thread timerThread = new Thread(new TimePrinterRunnable());
        Thread messageThread = new Thread(new MessagePrinterRunnable());
        timerThread.start();
        messageThread.start();
    }
}
