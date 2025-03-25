public class MatrixUtils {

    // Initialize matrices A and B
    public static void initializeMatrices(int[][] A, int[][] B, int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = i + j + 1;
                B[i][j] = (i + 1) * (j + 1);
            }
        }
    }

    // Optimized function for block multiplication
    public static void multiplyBlocks(int[][] A, int[][] B, int[][] C,
                                      int rowA, int colA, int rowB, int colB, int rowC, int colC, int BLOCK_SIZE) {
        int[][] localA = A, localB = B, localC = C; // Memory access optimization
        int block = BLOCK_SIZE;

        for (int i = 0; i < block; i++) {
            for (int j = 0; j < block; j++) {
                int sum = 0;
                for (int k = 0; k < block; k++) {
                    sum += localA[rowA + i][colA + k] * localB[rowB + k][colB + j];
                }
                localC[rowC + i][colC + j] += sum;
            }
        }
    }
}
