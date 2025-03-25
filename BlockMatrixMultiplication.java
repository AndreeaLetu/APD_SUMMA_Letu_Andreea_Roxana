public class BlockMatrixMultiplication {

    public static int computeBlockSize(int n) {
        for (int size = (int) Math.sqrt(n); size >= 1; size--) {
            if (n % size == 0) return size;
        }
        return n;
    }
    // SUMMA Algorithm
    public static void summaMatrixMultiplication(int[][] A, int[][] B, int[][] C, int BLOCK_SIZE) {
        int N = A.length; // Get matrix dimension dynamically
        int numBlocks = N / BLOCK_SIZE;

        for (int step = 0; step < numBlocks; step++) {
            for (int i = 0; i < numBlocks; i++) {
                for (int j = 0; j < numBlocks; j++) {
                    MatrixUtils.multiplyBlocks(A, B, C,
                            i * BLOCK_SIZE, step * BLOCK_SIZE,
                            step * BLOCK_SIZE, j * BLOCK_SIZE,
                            i * BLOCK_SIZE, j * BLOCK_SIZE, BLOCK_SIZE);
                }
            }
        }
    }
}
