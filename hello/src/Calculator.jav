import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hesap Makinesi");
        System.out.println("Yapmak istediğiniz işlemi seçiniz: +, -, *, /, %");

        // İşlem türünü al
        System.out.print("İşlem türü: ");
        char operator = scanner.next().charAt(0);

        // Sayıları al
        System.out.print("Birinci sayıyı giriniz: ");
        double num1 = scanner.nextDouble();

        System.out.print("İkinci sayıyı giriniz: ");
        double num2 = scanner.nextDouble();

        double result;

        // Switch-case ile işlem yap
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Sonuç: " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("Sonuç: " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("Sonuç: " + result);
                break;

            case '/':
                // Bölme işlemi için sıfıra bölmeyi kontrol et
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Sonuç: " + result);
                } else {
                    System.out.println("Hata: Bir sayı sıfıra bölünemez!");
                }
                break;

            case '%':
                // Mod işlemi için sıfıra bölmeyi kontrol et
                if (num2 != 0) {
                    result = num1 % num2;
                    System.out.println("Sonuç: " + result);
                } else {
                    System.out.println("Hata: Bir sayı sıfıra bölünemez!");
                }
                break;

            default:
                System.out.println("Hatalı işlem türü seçtiniz!");
        }

        scanner.close();
    }
}
