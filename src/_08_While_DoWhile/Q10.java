package _08_While_DoWhile;

import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {
        //TASK :  Kullanıcıdan 5 sayı isteyiniz, bu sayılardan en büyüğünü bularak yazdırınız.


           Scanner scan = new Scanner(System.in);
            int sayi;  // `sayi`, `buyuk`, `i`nin tanımlanması.
            int i;
            int buyuk;
            System.out.println("5 Sayi giriniz:");
            sayi = scan.nextInt(); // İlk sayının döngüye girmeden kullanıcıdan girilmesi
            buyuk = sayi; // İlk girilen en büyük olarak kabul edilir
            for ( i = 1; i <= 4; i++) { //  döngünün oluşturulması
                sayi = scan.nextInt();
                {
                    if (sayi > buyuk) // Sayının “buyuk”le karşılaştırılması
                        buyuk = sayi;
                }
            }
            System.out.println("En Buyuk sayi= " + buyuk); // “buyuk”ün ekrana yazdırılması

        /*
        Scanner scan = new Scanner(System.in);
        int sayi, buyuk;
        int i = 0;
        System.out.println("5 Sayi giriniz:");
        sayi = scan.nextInt();
        buyuk = sayi;
        do {
            i < sayi

            System.out.println(sayi);
            i++;
        }
        while (buyuk == sayi) ;


        System.out.println("En Buyuk sayi = " + buyuk);

         */
    }
}




