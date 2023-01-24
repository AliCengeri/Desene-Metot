import java.util.MissingFormatArgumentException;
import java.util.Scanner;

public class Main {
    static int desen(int a, int b) {
        if (b > 0) {
            System.out.print(b + " ");
            return desen(a, b-5);
        }
        return desen2(a, b);
    }

    static int desen2(int a, int b) {
        if (b <= a) {
            System.out.print(b + " ");
            return desen2(a, b+5);
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int a = input.nextInt();
        int b = a;
        desen(a, b);
    }
}