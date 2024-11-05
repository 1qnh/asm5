package bai3;
import java.util.Scanner;
public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("bang cuu chuong cua so: ");
        int a = scanner.nextInt();

        System.out.println("bang cuu chuong cua so " + a + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(a + " x " + i + " = " + (a * i));
        }

        scanner.close();
    }
}
