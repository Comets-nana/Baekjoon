import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger n, m;
        n = sc.nextBigInteger();
        m = sc.nextBigInteger();

        System.out.println(n.divide(m));
        System.out.println(n.remainder(m));
    }
}