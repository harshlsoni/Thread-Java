// Prints even numbers from 2 to 10

public class EvenNumbersThread extends Thread {
    @Override
    public void run() {
        // Printing even numbers from 2 to 10
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("Even Number: " + i);
            try {
                Thread.sleep(600); // pause for 600ms
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}