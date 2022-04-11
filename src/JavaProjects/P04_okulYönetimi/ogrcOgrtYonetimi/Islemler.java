package JavaProjects.P04_okulYönetimi.ogrcOgrtYonetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Islemler {

    static List<Kisi> ogrncListesi= new ArrayList<>();
    static ArrayList<Kisi> ogrtmListesi= new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static String kisiTuru;

    public static void girisPaneli(){
        System.out.println("====================================\nOGRENCI VE OGRETMEN YONETIM PANELI\n" +
                "====================================\n"
                + "1- OGRENCI ISLEMLERI\n2- OGRETMEN ISLEMLERI\nQ- CIKIS");
        System.out.print("isleminiz seciniz : ");
        String secim = scan.next().toUpperCase();
        switch(secim){
            case "1":
                kisiTuru="OGERNCI";
                islemMenusu();
                break;
            case "2":
                kisiTuru="OGRETMEN";
                islemMenusu();
                break;
            case "Q":
                cikis();
                break;
            default:
                System.out.println("hatali giris yaptiniz : (");
                girisPaneli();
                break;

        }

    }

    private static void cikis() {
        System.out.println(" Yine bekleriz... ");
    }

    public static void islemMenusu(){
        System.out.println("Sectiginiz  Kişi turu: "+ kisiTuru+" icin  aşağıdaki işlemlerden tercih yapınız.\r\n"
                + "============= İŞLEMLER =============\r\n"
                + "     1-EKLEME\r\n"
                + "     2-ARAMA\r\n"
                + "     3-LİSTELEME\r\n"
                + "     4-SİLME\r\n"
                + "     0-ANA MENU");

        System.out.print("islem tercihinizi giriniz : ");
        int secilenIslem = scan.nextInt();
        switch (secilenIslem){
            case 1:
                ekle();
                islemMenusu();
                break;
            case 2:
                islemMenusu();
                break;
            case 3:
                islemMenusu();
                break;
            case 4:
                islemMenusu();
                break;
            case 0:
                girisPaneli();
                break;
            default:
                System.out.println("adam gibi bisey gir .. :");

                islemMenusu();

                break;

        }


    }

    private static void ekle() {
        System.out.println("  ++++   "+kisiTuru+" ekleme asyfasi   ++++ ");
        System.out.print("ad soyad giriniz .. : ");
        String adSoyad= scan.nextLine();
        System.out.print("kimlik no giriniz .. : ");
        String kimlikno = scan.nextLine();
        System.out.print("yas giriniz .. : ");
        int yas = scan.nextInt();
        if(kisiTuru.equals("OGRENCI")){
            System.out.print("ogrenci no giriniz .. : ");
            String ogrcNo= scan.nextLine();
            System.out.print("sinif giriniz .. : ");
            String sinif  = scan.nextLine();
            Ogrenci sefilOgrenci = new Ogrenci();


        }else{
            System.out.print("sicil no giriniz .. : ");
            String sicilNo= scan.nextLine();
            System.out.print("bolum giriniz .. : ");
            String bolum = scan.nextLine();
        }
    }


}
