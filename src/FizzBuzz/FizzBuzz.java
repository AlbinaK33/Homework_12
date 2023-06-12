package FizzBuzz;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class FizzBuzz {
    private int n;
    private BlockingQueue<String> queue;

    public FizzBuzz(int n) {
        this.n = n;
        this.queue = new LinkedBlockingQueue<>();
    }

    public void fizz() {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                try {
                    queue.put("fizz");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void buzz() {
        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0 && i % 3 != 0) {
                try {
                    queue.put("buzz");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void fizzbuzz() {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                try {
                    queue.put("fizzbuzz");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void number() {
        for (int i = 1; i <= n; i++) {
            String output = null;
            if (i % 3 != 0 && i % 5 != 0) {
                output = String.valueOf(i);

            } else if (output == null) {

                try {
                    output = queue.take();
                } catch (InterruptedException e) {
                    e.printStackTrace();

                }
            }
            System.out.print(output);
            if (i != n) {
                System.out.print(",");
            }
        }
    }
}
