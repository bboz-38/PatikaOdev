
import java.util.Scanner;

public class alan {
    public static void main(String[] args) {
        int a,b,c,alan;
        Scanner inp = new Scanner(System.in);
        System.out.print("İlk kenar uzunluğunu giriniz: ");
        a = inp.nextInt();
        System.out.print("İkinci kenar uzunluğunu giriniz: ");
        b = inp.nextInt();
        System.out.print("Üçüncü kenar uzunluğunu giriniz: ");
        c = inp.nextInt();
        int u = (a+b+c) / 2;
        alan = u*(u-a)*(u-b)*(u-c);
        System.out.println(alan);
    }
}
