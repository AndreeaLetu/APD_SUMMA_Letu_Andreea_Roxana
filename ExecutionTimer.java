public class ExecutionTimer {

    // Function to measure execution time for the SUMMA algorithm in milliseconds (0.1 ms)
    public static long measureExecutionTime(int[][] A, int[][] B, int[][] C, int BLOCK_SIZE) {
        // Record start time for the SUMMA algorithm
        long startTime = System.nanoTime();

        // Calling the Summa Algorithm, passing BLOCK_SIZE as an argument
        BlockMatrixMultiplication.summaMatrixMultiplication(A, B, C, BLOCK_SIZE);

        // Record end time after the SUMMA algorithm has executed
        long endTime = System.nanoTime();

        // Return the elapsed time in milliseconds (0.1 ms)
        return (endTime - startTime) / 10000; // Convert from nanoseconds to 0.1 milliseconds
    }
}
