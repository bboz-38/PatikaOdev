import java.util.Scanner;

public class CiftVeDortKatlariToplama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int toplam = 0;
        int sayi;

        do {
            // Kullanıcıdan sayı alma
            System.out.print("Bir sayı giriniz (tek sayı girerek çıkabilirsiniz): ");
            sayi = scanner.nextInt();

            // Çift ve 4'ün katı olan sayıları toplama
            if (sayi % 2 == 0 && sayi % 4 == 0) {
                toplam += sayi;
            }
        } while (sayi % 2 == 0); // Tek sayı girilene kadar döngü devam eder

        // Sonucu yazdırma
        System.out.println("Çift ve 4'ün katı olan sayıların toplamı: " + toplam);
    }
}