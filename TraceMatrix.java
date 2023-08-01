public class TraceMatrix {
    public static void main(String[] args) {
        int[][]matrix={{1,2,3},{4,5,6},{7,8,9}};
        int trace=computeTrace(matrix);
        System.out.println("The trace of the matrix is:"+trace);
    }
    private static int computeTrace(int[][] matrix) {
        int n= matrix.length;
        int trace=0;
        for (int i=0;i<n;i++){
            trace+=matrix[i][i];
        }
        return trace;
    }

}
