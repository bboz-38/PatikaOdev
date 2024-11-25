import java.util.Scanner;

public class KuvvetleriYazdir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan sayı alma
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        // Geçerli veri kontrolü
        if (sayi < 1) {
            System.out.println("Lütfen pozitif bir sayı giriniz.");
        } else {
            // 4'ün kuvvetlerini yazdırma
            System.out.println("4'ün kuvvetleri:");
            for (int i = 1; i <= sayi; i *= 4) {
                System.out.println(i);
            }

            // 5'in kuvvetlerini yazdırma
            System.out.println("5'in kuvvetleri:");
            for (int i = 1; i <= sayi; i *= 5) {
                System.out.println(i);
            }
        }
    }
}
