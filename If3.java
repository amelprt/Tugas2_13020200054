/* 13020200054 */
/* AMELIA PUTRI PRATIWI */
/* SELASA,22 FEB 2022 */
/* 07.00 */

import java.util.Scanner;

public class If3 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		Scanner masukan=new Scanner(System.in);
		
		System.out.print ("Contoh IF tiga kasus \n");
		System.out.print ("Ketikkan suatu nilai integer :");
		a=masukan.nextInt();
		if (a > 0){
			System.out.println ("Nilai a positif "+ a);
		}else if (a == 0){
			System.out.println ("Nilai Nol "+ a);
		}else /* a > 0 */ {
		System.out.println ("Nilai a negatif "+ a);
		}
	}
}