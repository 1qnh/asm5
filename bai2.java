package bai2;
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap so phan tu day Fibonacci: ");
        int n = scanner.nextInt();

        int sodau = 0, sosau = 1;

        System.out.print("day Fibonacci: ");
        for (int i = 0; i < n; i++) {
            System.out.print(sodau + " ");
            int next = sodau + sosau;
            sodau = sosau;
            sosau = next;
        }

        scanner.close();
    }
}
