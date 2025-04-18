// Prints alphabets from A to E

public class PrintAlphabetsThread extends Thread {
    @Override
    public void run() {
        // Printing characters A to E
        for (char ch = 'A'; ch <= 'E'; ch++) {
            System.out.println("Alphabet: " + ch);
            try {
                Thread.sleep(700); // pause for 700ms
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}