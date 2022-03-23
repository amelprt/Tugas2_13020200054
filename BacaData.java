/* 13020200054 */
/* AMELIA PUTRI PRATIWI */
/* SELASA,22 FEB 2022 */
/* 07.00 */

import java.util.Scanner;

public class BacaData {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		Scanner masukan;
	
		System.out.print ("Contoh membaca dan menulis, ketik nilai integer: \n");
		masukan = new Scanner(System.in);
		a = masukan.nextInt();
		System.out.print ("Nilai yang dibaca : "+ a);
	}
}