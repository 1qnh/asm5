package bai4;
import java.util.Scanner;
public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("so hang cho kim tu thap: ");
        int a = scanner.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }

        scanner.close();
    }
}