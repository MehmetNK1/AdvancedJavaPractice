package _08_While_DoWhile;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {

        // TASK : STRING OLAN PIN kodunuzu kontrol eden ve 3 giris hakki veren bir kod yazınız.

            Scanner scan = new Scanner(System.in);
            String pin = "said.12345";
            int girisHakki = 4;
            System.out.println("*****Hosgeldiniz*****");
            while (true) {
                System.out.print("pin kodu giriniz : ");
                String girilenPin = scan.nextLine();
                if (pin.equals(girilenPin)) {
                    System.out.println("basarili giris yaptiniz..:)");
                    break;
                } else {
                    System.out.println("yanlis giris yaptiniz...");
                    girisHakki--;
                    System.out.println("kalan giris hakkiniz :" + girisHakki);
                }
                if (girisHakki == 0) {
                    System.out.println("giris hakkiniz kalmadi.. sim kartiniz bloke oldu..");
                    break;
                }

        }
    }
}
