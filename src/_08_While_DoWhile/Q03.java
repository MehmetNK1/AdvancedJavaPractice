package _08_While_DoWhile;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
      /*   Kullanicidan 2 sayi alaliniz.
        1. sayi taban
        2. sayi Ust
        1 sayinin ussunu hesaplatan code create ediniz.
         3, 3  sonuc = 27
        2  3 = 2*2*2=8
       */


        int a= 3;
        int b=3;
        System.out.println((int)Math.pow(a,b));



        Scanner scanner = new Scanner(System.in);
        int secim=0;  // sart
        do{
            System.out.println("Lütfen 1. sayıyı giriniz: ");
            int taban= scanner.nextInt();            // 1. sayi
            System.out.println("Lütfen 2. sayıyı giriniz: ");
            int us=scanner.nextInt();               // 2.sayi           kullanicidan sirayla 2 sayi aldik
            System.out.println(taban+"'nın "+us+ " sü = " + Math.pow(taban,us)); //=Math.pow(sayi, us);
                                                     // burada "Math." uslu sayilar gibi matematiksel islemlerde kullanilir
            System.out.println("Yeni işlemle devam etmek istiyorsanız 1'e\n çıkış yapmak için 0'a basınız: ");
            secim =scanner.nextInt();             // yukarda atanan sart dogru ise calisir ve dongu yu bitirir
        }while(secim==1);                        // yukarda atanan sart dogru degilse yeni islem icin dongu ye gonderilir
        System.out.println("Programdan çıkış yapıldı. Yine bekleriz...");



        Scanner scan = new Scanner(System.in);
        System.out.println("taban sayisini giriniz");
        int taban=scan.nextInt();
        System.out.println("us sayisini giriniz");
        int us=scan.nextInt();
        int i=1;
        int top=1;
        while(i<=us) {   // "i" "us" se esit olana kadar artacak ve kosul calisacak
            top=top*taban; // tabani her seferinde toplamla carpip
            i++;         // "i" "us" se gelene kadar
        }
        System.out.println(top);
    }
}
