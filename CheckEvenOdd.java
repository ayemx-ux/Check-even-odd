import java.util.Scanner;

public class CheckEvenOdd {
    public static void main(String[] args) {
        // Kullanıcıdan bir sayı al
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Bir sayı girin: ");
        int number = scanner.nextInt();

        // Sayının çift mi tek mi olduğunu kontrol et
        if (number % 2 == 0) {
            System.out.println(number + " çift bir sayıdır.");
        } else {
            System.out.println(number + " tek bir sayıdır.");
        }

        scanner.close();
    }
}
