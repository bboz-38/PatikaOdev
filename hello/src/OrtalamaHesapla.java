import java.util.Scanner;

public class OrtalamaHesapla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan sayı alma
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        // Geçerli veri kontrolü
        if (sayi <= 0) {
            System.out.println("Pozitif bir sayı giriniz!");
        } else {
            int toplam = 0;
            int sayac = 0;

            // 0'dan girilen sayıya kadar döngü
            for (int i = 1; i <= sayi; i++) {
                if (i % 3 == 0 && i % 4 == 0) {
                    toplam += i;
                    sayac++;
                }
            }

            // Ortalama hesaplama
            if (sayac > 0) {
                double ortalama = (double) toplam / sayac;
                System.out.printf("3 ve 4'e tam bölünen sayıların ortalaması: %.2f\n", ortalama);
            } else {
                System.out.println("3 ve 4'e tam bölünen herhangi bir sayı yok.");
            }
        }
    }

}
