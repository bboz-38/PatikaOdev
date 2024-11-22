
import java.util.Scanner;

public class Kullanıcı {
    public static void main(String[] args) {
        String userName, password, answer, newPassword = null;
        Scanner scn = new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz: ");
        userName = scn.nextLine();
        System.out.print("Şifrenizi giriniz: ");
        password = scn.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş başarılı");
        } else {
            System.out.println("hatalı şifre girdiniz");
            System.out.println("Şifrenizi değiştirmek ister misiniz?");
            System.out.println("yes veya no seçeneklerinden birini seçiniz");
            answer = scn.nextLine();
            if (answer.equals("yes")) {
                System.out.println("Yeni şifre giriniz:");
                newPassword = scn.nextLine();
                if (newPassword.equals("java123")) {
                    System.out.println("Yeni şifre eski şifreyle aynı olamaz!");
                } else {
                    System.out.println("Şifreniz değiştirilmiştir!");
                }
            }

        }

    }
}
