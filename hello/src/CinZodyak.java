
import java.util.Scanner;

public class CinZodyak {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        // Kullanıcıdan doğum yılını alma
        System.out.print("Doğum yılınızı giriniz: ");
        int dogumYili = scanner.nextInt();

        // Geçerli veri kontrolü
        if (dogumYili <= 0) {
            System.out.println("Hatalı bir yıl girdiniz!");
        } else {
            // Çin Zodyağı hesaplama
            String[] zodyak = {
                "Maymun", "Horoz", "Köpek", "Domuz",
                "Fare", "Öküz", "Kaplan", "Tavşan",
                "Ejderha", "Yılan", "At", "Koyun"
            };

            int index = dogumYili % 12;
            String cinZodyagi = zodyak[index];

            // Sonuç
            System.out.println("Çin Zodyağı Burcunuz: " + cinZodyagi);
        }
    }
}
