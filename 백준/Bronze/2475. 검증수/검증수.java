import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        int number4 = sc.nextInt();
        int number5 = sc.nextInt();

        System.out.println(
                (long)(
                        Math.pow(number1, 2) + Math.pow(number2, 2) + Math.pow(number3, 2) + Math.pow(number4, 2) + Math.pow(number5, 2)
                ) % 10
        );
    }
}