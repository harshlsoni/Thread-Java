# 🧵 Java Multithreading Demonstration

This project demonstrates the use of **Java threads** to concurrently execute three different tasks:

1. Printing numbers from 1 to 5  
2. Printing alphabets from A to E  
3. Printing even numbers from 2 to 10  

Each task runs in its own thread, showcasing basic multithreading concepts in Java.

---

## 📂 Project Structure

- **`PrintNumbersThread.java`** – Prints numbers 1 to 5, with a delay of 500ms between prints.  
- **`PrintAlphabetsThread.java`** – Prints characters A to E, with a delay of 700ms between prints.  
- **`PrintEvenNumbersThread.java`** – Prints even numbers from 2 to 10, with a delay of 600ms between prints.  
- **`Main.java`** – Creates and starts all three threads concurrently.

---

## 🛠️ How to Run

1. **Clone the repository**  
   ```bash
   git clone https://github.com/harshlsoni/Thread-Java
   cd Thread-Java
   ```

2. **Compile the Java files**  
   ```bash
   javac *.java
   ```

3. **Run the program**  
   ```bash
   java Main
   ```

---

## 🧪 Sample Output

```
Number: 1
Alphabet: A
Even Number: 2
Number: 2
Alphabet: B
Even Number: 4
...
```

Note: Output may vary slightly in order due to thread scheduling by the JVM.

---
