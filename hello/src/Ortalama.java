import java.util.Scanner;

public class Ortalama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double toplam = 0;
        int dersSayisi = 0;

        System.out.println("Ders notlarınızı giriniz. Geçerli notlar 0-100 aralığında olmalıdır.");
        System.out.println("Ders isimleri: 1-Fizik, 2-Kimya, 3-Matematik, 4-Türkçe, 5-Müzik");

        // Fizik
        System.out.print("Fizik notunu giriniz: ");
        int fizikNotu = scanner.nextInt();
        if (fizikNotu >= 0 && fizikNotu <= 100) {
            toplam += fizikNotu;
            dersSayisi++;
        } else {
            System.out.println("Geçersiz not: Fizik dersine girilen not ortalamaya dahil edilmedi.");
        }

        // Kimya
        System.out.print("Kimya notunu giriniz: ");
        int kimyaNotu = scanner.nextInt();
        if (kimyaNotu >= 0 && kimyaNotu <= 100) {
            toplam += kimyaNotu;
            dersSayisi++;
        } else {
            System.out.println("Geçersiz not: Kimya dersine girilen not ortalamaya dahil edilmedi.");
        }

        // Matematik
        System.out.print("Matematik notunu giriniz: ");
        int matematikNotu = scanner.nextInt();
        if (matematikNotu >= 0 && matematikNotu <= 100) {
            toplam += matematikNotu;
            dersSayisi++;
        } else {
            System.out.println("Geçersiz not: Matematik dersine girilen not ortalamaya dahil edilmedi.");
        }

        // Türkçe
        System.out.print("Türkçe notunu giriniz: ");
        int turkceNotu = scanner.nextInt();
        if (turkceNotu >= 0 && turkceNotu <= 100) {
            toplam += turkceNotu;
            dersSayisi++;
        } else {
            System.out.println("Geçersiz not: Türkçe dersine girilen not ortalamaya dahil edilmedi.");
        }

        // Müzik
        System.out.print("Müzik notunu giriniz: ");
        int muzikNotu = scanner.nextInt();
        if (muzikNotu >= 0 && muzikNotu <= 100) {
            toplam += muzikNotu;
            dersSayisi++;
        } else {
            System.out.println("Geçersiz not: Müzik dersine girilen not ortalamaya dahil edilmedi.");
        }

        // Ortalama hesaplama
        if (dersSayisi > 0) {
            double ortalama = toplam / dersSayisi;
            if (ortalama > 55) {
                System.out.println("Geçtiniz");
            } else {
                System.out.println("Kaldınız");
            }

        } else {
            System.out.println("Geçerli ders notu bulunamadı.");
        }

        scanner.close();
    }
}