import java.io.IOException;

public class MatrixPerfTest
{
    public static final String MATRIX1_NAME = "m1.txt";
    public static final String MATRIX2_NAME = "m2.txt";

    public static void main(String s[]) throws IOException, InterruptedException {

        Matrix m1 = new DMat(MATRIX1_NAME);
        Matrix m2 = new DMat(MATRIX2_NAME);
        long start = System.currentTimeMillis();

        System.out.println("Starting loading sparse matrices");
        m1 = new SMat(MATRIX1_NAME);
        System.out.println("1 loaded");
        m2 = new SMat(MATRIX2_NAME);
        System.out.println("2 loaded");
        start = System.currentTimeMillis();
        Matrix r2 = m1.pmul(m2);
        System.out.println("Sparse Matrix time: " +(System.currentTimeMillis() - start));
    }
}