public class PrintNumbersThread extends Thread {
    @Override
    public void run() {
        // Printing numbers 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
            try {
                Thread.sleep(500); // pause for 500ms
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}