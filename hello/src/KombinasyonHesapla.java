import java.util.Scanner;

public class KombinasyonHesapla {
     // Faktöriyel hesaplama fonksiyonu
    public static long faktoriyel(int sayi) {
        long sonuc = 1;
        for (int i = 1; i <= sayi; i++) {
            sonuc *= i;
        }
        return sonuc;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan n ve r değerlerini alma
        System.out.print("n değeri (eleman sayısı) giriniz: ");
        int n = scanner.nextInt();
        System.out.print("r değeri (seçilen eleman sayısı) giriniz: ");
        int r = scanner.nextInt();

        // Geçerli veri kontrolü
        if (n < 0 || r < 0 || r > n) {
            System.out.println("Geçersiz değerler! Lütfen doğru bir n ve r değeri giriniz.");
        } else {
            // C(n, r) hesaplama
            long kombinasyon = faktoriyel(n) / (faktoriyel(r) * faktoriyel(n - r));
            System.out.println("C(" + n + ", " + r + ") = " + kombinasyon);
        }
    }
}
