import java.util.Scanner;

public class BasamakTopla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir sayı alıyoruz
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        int toplam = 0;

        // Sayının basamaklarını toplamak için döngü
        while (sayi > 0) {
            toplam += sayi % 10;  // Sayının son basamağını alıyoruz ve toplama ekliyoruz
            sayi /= 10;  // Sayının son basamağını çıkartıyoruz
        }

        // Sonucu ekrana yazdırıyoruz
        System.out.println("Sayının basamaklarının toplamı: " + toplam);
    }
}
