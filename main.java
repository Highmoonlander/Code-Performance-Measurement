public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        long startMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        // Your code goes here
        
        long endTime = System.currentTimeMillis();
        long endMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        long processTime = endTime - startTime;
        long memoryUsage = endMemory - startMemory;

        System.out.println("Process time: " + processTime + " ms");
        System.out.println("Memory usage: " + memoryUsage + " bytes");
    }
}
write a readme file for this code
