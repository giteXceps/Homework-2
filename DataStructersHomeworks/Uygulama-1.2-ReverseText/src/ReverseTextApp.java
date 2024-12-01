import java.util.Scanner;

public class ReverseTextApp {
    public static String reverseText(String text) {
        if (text.isEmpty()) {
            return ("");
        }
        return reverseText(text.substring(1)) + text.charAt(0);
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ters cevirmek istediginiz kelimeyi giriniz");
        String text = scanner.nextLine();
        String reversedText = reverseText(text);
        System.out.println("Ters cevirme islemi tamamlanmistir");
        System.out.println("Ters cevirme islemi sonucu: " + reversedText);
        scanner.close();
    }
}
