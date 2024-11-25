import java.util.Scanner;

public class UsHesapla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan taban ve üs değerlerini alma
        System.out.print("Taban değerini giriniz: ");
        int taban = scanner.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int us = scanner.nextInt();

        // Üslü sayıyı hesaplamak için döngü
        long sonuc = 1;
        for (int i = 1; i <= us; i++) {
            sonuc *= taban;  // Tabanı her adımda sonuca çarpıyoruz
        }

        // Sonucu ekrana yazdırma
        System.out.println(taban + " üssü " + us + " = " + sonuc);
    }

}
