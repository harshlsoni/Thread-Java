/* 
Name: Harshal soni
PRN: 23070126048
Batch: A2
*/

public class Main {
    public static void main(String[] args) {
        // Creating threads
        PrintNumbersThread t1 = new PrintNumbersThread();
        PrintAlphabetsThread t2 = new PrintAlphabetsThread();
        EvenNumbersThread t3 = new EvenNumbersThread();


        // Starting all threads
        t1.start();
        t2.start();
        t3.start();
    }
}