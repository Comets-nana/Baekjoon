import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        if(s.length() > 100) {
            return;
        }
        System.out.println(s.length());
    }
}