package TimeTracker;

public class TimePrinterRunnable implements Runnable {
    int secondsPassed = 0;
    @Override
    public void run() {
        while (true) {
            System.out.println("Timer: " + secondsPassed + " с. минуло з моменту запуску програми.");
            secondsPassed++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
