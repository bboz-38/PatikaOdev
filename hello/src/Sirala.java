
import java.util.Scanner;

public class Sirala {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan üç sayı al
        System.out.print("Birinci sayıyı girin: ");
        int sayi1 = scanner.nextInt();
        System.out.print("İkinci sayıyı girin: ");
        int sayi2 = scanner.nextInt();
        System.out.print("Üçüncü sayıyı girin: ");
        int sayi3 = scanner.nextInt();

        // Sayıları sıralamak için değişkenler
        int enKucuk, orta, enBuyuk;

        // Küçükten büyüğe sıralama
        if (sayi1 <= sayi2 && sayi1 <= sayi3) {
            enKucuk = sayi1;
            if (sayi2 <= sayi3) {
                orta = sayi2;
                enBuyuk = sayi3;
            } else {
                orta = sayi3;
                enBuyuk = sayi2;
            }
        } else if (sayi2 <= sayi1 && sayi2 <= sayi3) {
            enKucuk = sayi2;
            if (sayi1 <= sayi3) {
                orta = sayi1;
                enBuyuk = sayi3;
            } else {
                orta = sayi3;
                enBuyuk = sayi1;
            }
        } else {
            enKucuk = sayi3;
            if (sayi1 <= sayi2) {
                orta = sayi1;
                enBuyuk = sayi2;
            } else {
                orta = sayi2;
                enBuyuk = sayi1;
            }
        }

        // Sonucu ekrana yazdır
        System.out.println("Sıralama: " + enKucuk + " < " + orta + " < " + enBuyuk);
    }
}
