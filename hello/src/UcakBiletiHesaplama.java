import java.util.Scanner;

public class UcakBiletiHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan veri alma
        System.out.print("Mesafeyi km cinsinden giriniz: ");
        double mesafe = scanner.nextDouble();

        System.out.print("Yaşınızı giriniz: ");
        int yas = scanner.nextInt();

        System.out.print("Yolculuk tipini seçiniz (1: Tek Yön, 2: Gidiş-Dönüş): ");
        int yolculukTipi = scanner.nextInt();

        // Geçerli veri kontrolü
        if (mesafe <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz!");
        } else {
            double birimFiyat = 0.10; // Mesafe başına ücret
            double toplamFiyat = mesafe * birimFiyat;

            // Yaş indirimleri
            if (yas < 12) {
                toplamFiyat *= 0.5; // %50 indirim
            } else if (yas >= 12 && yas <= 24) {
                toplamFiyat *= 0.9; // %10 indirim
            } else if (yas > 65) {
                toplamFiyat *= 0.7; // %30 indirim
            }

            // Yolculuk tipi indirimi
            if (yolculukTipi == 2) {
                toplamFiyat *= 0.8; // %20 indirim
                toplamFiyat *= 2;   // Gidiş-dönüş için fiyat iki katına çıkar
            }

            // Sonuç
            System.out.printf("Toplam Bilet Fiyatınız: %.2f TL\n", toplamFiyat);
        }
    }

}
