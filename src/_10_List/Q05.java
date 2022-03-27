package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
       /* TASK :
        Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        sadece tek elemanlarını ayrı diziye bir metodda atayarak
         yazdırınız.

        */

        Scanner scan = new Scanner(System.in);
        int Arr[]=new int[6];

        for (int i = 0; i <6 ; i++) {
            System.out.print(i+1+" Numaralı elemanın değerini giriniz:");
            Arr[i]=scan.nextInt();
        }
        int Arr2[]=returnodd(Arr);
        System.out.println(Arrays.toString(Arr2));
    }
    private static int [] returnodd(int[] arr) {
        List<Integer> sayilar = new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            if(i%2==1) sayilar.add(i);
        }
        int arrodd[]= new int[sayilar.size()];
        for (int i = 0; i <sayilar.size(); i++) {
            arrodd[i]=sayilar.get(i);
        }
        return arrodd;

    }


}
