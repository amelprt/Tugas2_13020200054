/* 13020200054 */
/* AMELIA PUTRI PRATIWI*/
/* SELASA,22 FEB 2022 */
/* 07.00 */

import java.util.Scanner;

public class Konversiwaktu {
    public static void main(String[] args){
        int d,J,M,D,Z;
        Scanner baca = new Scanner(System.in);
        System.out.println("Masukkan Angka = ");d=baca.nextInt();
        D=d;
        J=D/3600; D=D%3600;
        M=D/60; D=D%60;
        Z=J%24;
        System.out.println("konversi dari nilai : "+ d + " adalah : ");
        System.out.print(D + " Detik = ");
        System.out.print(M + " Menit = ");
        System.out.print(J + " Jam = ");
        System.out.print(Z + " JamSekarang ");
        
    }
}