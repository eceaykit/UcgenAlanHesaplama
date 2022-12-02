import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Değişkenleri belirleyelim.

        double a, b, c, u, alan;

        //Kullanıcıdan veri alalım.
        Scanner input = new Scanner(System.in);
        System.out.print("İlk Kenar Uzunluğunu Giriniz: ");
        a= input.nextDouble();
        System.out.print("İkinci Kenar Uzunluğunu Giriniz: ");
        b= input.nextDouble();
        System.out.print("Üçüncü Kenar Uzunluğunu Giriniz: ");
        c= input.nextDouble();

        //Üçgenin alanını hesaplayalım.
        u= (a+b+c)/2;
        alan= Math.sqrt (u*(u-a)*(u-b)*(u-c));
        System.out.print("Üçgenin Alanı: " +alan);



    }
}