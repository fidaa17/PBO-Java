package latihankonstruktordestruktor;
import java.util.Scanner;

/*
 * Nama (NPM) : 1. Aufa Akhdan Khairi (221106042887)
 * 				2. Fida Van Saeli (221106043011)
 * 				3. Muhammad Danise Raditya Saniestha (221106042959)
 * 
 * Kelas	  : Regurel D
 * Tugas 	  : Latihan Pertemuan 4 Konstruktor Desruktor
 * 			  : Latihan 42. TABUNGAN
 */

public class Tabungan42 {
	public static void main(String[] args) {
		int saldo, ambiluang;
		
		Scanner input = new Scanner(System.in);
		System.out.println("=========Program Penarikan Uang=========");
		System.out.print("Masukkan Saldo Awal : ");
		saldo = input.nextInt();
		System.out.print("Jumlah Uang yang diambil : ");
		ambiluang = input.nextInt();
		
		if (ambiluang > saldo) {
			System.out.println("Saldo tidak mencukupi.");
		} else {
			saldo -= ambiluang;
			System.out.println("Penarikan berhasil dilakukan.");
			System.out.print("Saldo Anda Sekarang: "+saldo);
		}
		input.close();
	}

}
