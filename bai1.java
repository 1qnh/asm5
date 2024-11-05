package asm5;
import java.util.Random;
import java.util.Scanner;
public class bai1{
    public static void main(String[] args) {
        Random  random = new Random();
        int sochinh = random.nextInt(50) + 1;  // Sinh số ngẫu nhiên từ 1 đến 50
        Scanner scanner = new Scanner(System.in);
        int sodoan = 0;

        System.out.println("doan so 1-50");

        // Vòng lặp cho đến khi đoán đúng
        while (sodoan != sochinh) {
            System.out.print("so muon doan: ");
            sodoan = scanner.nextInt();

            if (sodoan < sochinh) {
                System.out.println("so cua ban nho hon so ngau nhien.");
            } else if (sodoan > sochinh) {
                System.out.println("so cua ban lon hon so ngau nhien.");
            } else {
                System.out.println("CHUC MUNG! Ban da doan dung.");
            }
        }

        scanner.close();
    }
}
