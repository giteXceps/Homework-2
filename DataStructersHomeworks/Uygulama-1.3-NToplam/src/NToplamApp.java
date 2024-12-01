import java.util.Scanner;

public class NToplamApp {
    public static long nToplam(long n) {
        if (n == 1) {
            return 1;
        }
        return n + nToplam(n - 1);
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        long n = scanner.nextLong();
        System.out.println("Girilen sayinin n toplami:");
        System.out.println(nToplam(n));
        scanner.close();
    }
}
