import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger N, M;
        N = sc.nextBigInteger();
        M = sc.nextBigInteger();

        System.out.println(N.subtract(M).abs());
    }
}