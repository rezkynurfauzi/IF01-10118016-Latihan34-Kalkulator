/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118016.latihan34.kalkulator;
import java.util.Scanner;

/**
 *
 * @author Rezky
 * NAMA      : Rezky Nur Fauzi
 * KELAS     : IF-1
 * NIM       : 10118016
 * Deskripsi Program   : Program ini berisi program Kalkulator
 */
public class IF0110118016Latihan34Kalkulator {
    public static double value1;
    public static double value2;

    public static double tambahBilangan() {
	return value1 + value2;
	}

    public static double kurangBilangan() {
        return value1 - value2;
	}

    public static double kaliBilangan() {
	return value1 * value2;
	}

    public static double bagiBilangan() {
        return value1 / value2 ;
	}

    public static double sisaBilangan() {
        return value1 % value2;
	}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
                    
        //input
        System.out.println("=====Aplikasi Kalkulator=====");
        System.out.print("Masukkan nilai ke-1 : ");
        value1 = scanner.nextDouble();
        System.out.print("Masukkan nilai ke-2 : ");
        value2 = scanner.nextDouble();
                    
        //output 
        System.out.println("\nHasil Pertambahan : " + tambahBilangan());
        System.out.println("Hasil Pengurangan : " + kurangBilangan());
        System.out.println("Hasil Perkalian : " + kaliBilangan());
        System.out.println("Hasil Pembagian : " + bagiBilangan());
        System.out.println("Hasil Sisa : " + sisaBilangan());
    }
    
}
