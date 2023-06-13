import java.util.Scanner;

public class Ornek_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double KDV = 0.18;
        double fiyat;
        System.out.println("Fiyatı Giriniz");
        fiyat = scanner.nextDouble();
        System.out.println("KDV' siz miktar : " + fiyat);
        System.out.println("KDV miktarı : " + (fiyat * KDV));
        System.out.println("KDV' li fiyatı : " + (fiyat + (fiyat * KDV)));
    }
}
