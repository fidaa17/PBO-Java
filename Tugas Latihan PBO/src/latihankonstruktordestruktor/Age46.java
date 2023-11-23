package latihankonstruktordestruktor;
import java.util.Scanner;
/*
 * Nama (NPM) : 1. Aufa Akhdan Khairi (221106042887)
 * 				2. Fida Van Saeli (221106043011)
 * 				3. Muhammad Danise Raditya Saneistha (221106042959)
 * 
 * Kelas 	: Reguler D
 * Tugas	: Latihan Pertemuan 4 Konstruktor destruktor
 * 			: Latihan 46. TANDANYA KAMU
 */
public class Age46 {
	private int yearBirth;
	private int yearNow;
	private String red;
	
	public Age46(int yearNow) {
		this.yearNow = yearNow;
	}
	public int getYearBirth() {
		return yearBirth;
	}
	public void setYearBirth(int yearBirth) {
		this.yearBirth = yearBirth;
	}
	public int getYearNow() {
		return yearNow;
	}
	
	public int hitungUmur() {
		return yearNow - yearBirth;
	}
	
	//isi tabel method
	public String tandanyaKamu(int umur) {
		if(umur < 6) {
			return "LAGI LUCU-LUCUNYA";
		}else if(umur<10) {
			return "MASIH ANAK ANAK";
		}else if(umur<15) {
			return "MASIH REMADJA";
		}else if(umur<20) {
			return "ALAY";
		}else if(umur<29) {
			return "LAGI GALAU NYARI JODOH";
		}else if(umur<35) {
			return "LAGI SIBUK NYARI UANG";
		}else if(umur<150) {
			return "SUDAH TUA";
		}else {
			return "TIDAK TERDETEKSI KEHIDUPAN";
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Masukkan Tahun Lahir Anda : ");
		int tahunLahir = scanner.nextInt();
		System.out.println("\n=====Hasil Perhitungan Umur=====");
		System.out.println("Tahun Lahir anda :"+ tahunLahir);
	
		
		System.out.print("Hari ini tahun : ");
		int tahun = scanner.nextInt();
		
		Age46 age46 = new Age46(tahun);
		age46.setYearBirth(tahunLahir);
		
		int umur = age46.hitungUmur();
		String tandaUmur = age46.tandanyaKamu(umur);
		
		System.out.println("Umur kamu sampai hari ini adalah "+ umur+ " tahun");
		System.out.print("Tandanya Kamu "+ tandaUmur);
		
		scanner.close();
	}
	
}
