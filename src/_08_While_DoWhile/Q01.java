package _08_While_DoWhile;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {
       /* TASK :
        verilen bir sayinin Armstrong sayi olup olmadigini kontrol eden code create ediniz
        Armstrong sayi rakamlarinin kuplerinin toplamina esit olan sayidir
        153 = (1*1*1) + (5*5*5) + (3*3*3) gibi

        */

        Scanner scan = new Scanner(System.in);
        System.out.print("Armstrong kontrol icin bir sayi giriniz: ");
        int n=scan.nextInt();
        int k=n; // gecici bir deger icerisine orijinal degeri tutalim/ amac orjinal degerin degisimini onlemek
        // bu yontem ile orginal deger uzerinde istedigimiz manipulasyonu yapabiliriz.
        int temp=0;//digitlerin kupunu buraya dahil edecegiz
        // temp is a variable that contains one single element of that array in your loop
        while(n>0){
            int a=n%10;
            temp+=(a*a*a);
            n=n/10;
        }
        //orjinal deger ile kiyaslayalim ve print edelim.
        if(k==temp)
            System.out.println(k + " armstrongdur");
        else
            System.out.println(k + "armstrin degildir");
    }

}
