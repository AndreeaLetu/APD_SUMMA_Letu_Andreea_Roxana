public class Main {

    static final int N = 128 ; // Matrix dimension
    static final int BLOCK_SIZE = BlockMatrixMultiplication.computeBlockSize(N);

    public static void main(String[] args) {
        // Initialize matrices
        int[][] A = new int[N][N];
        int[][] B = new int[N][N];
        int[][] C = new int[N][N];

        // Initialize matrices A and B
        MatrixUtils.initializeMatrices(A, B, N);

        // Print the initialized matrices
        System.out.println("Matrix A:");
        printMatrix(A);

        System.out.println("\nMatrix B:");
        printMatrix(B);

        // Measure execution time for the SUMMA algorithm and display it
        long executionTime = ExecutionTimer.measureExecutionTime(A, B, C, BLOCK_SIZE);
        System.out.println("Execution time for SUMMA algorithm: " + executionTime + " ms");

        // Print the resulting matrix (C = A x B)
        System.out.println("\nSolution matrix (C = A x B):");
        printMatrix(C);

        System.out.println("\nBlock size dimension: " + BLOCK_SIZE);
    }

    // Function to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.printf("%6d ", value);
            }
            System.out.println();
        }
    }
}
