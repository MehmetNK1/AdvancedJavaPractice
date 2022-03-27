package _08_While_DoWhile;

import java.util.Scanner;

public class Q06 {


	public static void main(String[] args) {
		/*TASK :
		 kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
		 kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.

		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("bolunen sayiyi giriniz  : ");
		int bolunen = scan.nextInt();
		System.out.print("bolen sayiyi giriniz  : ");
		int bolen=scan.nextInt();

		System.out.println("bolum:"+bolum(bolunen,bolen));
	}

	public static int bolum(int bolunen, int bolen) {
		int bolum=0 ;
		while (bolunen>=bolen) {
			bolunen-=bolen;
			bolum++;
		}
		return bolum;
	}

}


