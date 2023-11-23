package latihankonstruktordestruktor;

/*
 * Nama (NPM) : 1. Aufa Akhdan Khairi (221106042887)
 * 				2. Fida Van Saeli (221106043011)
 * 				3. Muhammad Danise Raditya Saniestha (221106042959)
 * 
 * Kelas	  : Reguler D
 * Tugas 	  : Latihan Pertemuan 4 Konstruktor Desruktor
 * 			  : Latihan 43. GAJI PEGAWAI
 */

public class GajiPegawai43 {
	public static void main(String[] args) {
		String nama = "Rizki Adam Kurniawan";
		String alamat = "Jalan Semar dlm 4 No 72/66";
		int uangTransport = 250000;
		int uangTunjangan = 300000;
		int gajiPokok = 4500000;
		int totalGaji = gajiPokok + uangTransport + uangTunjangan;
		
		System.out.println("### Data Gaji Karyawan PT. KAKATU ###");
		System.out.println("--------------------------------");
		System.out.println("Nama Karyawan: " + nama);
		System.out.println("Alamat: " + alamat);
		System.out.println("Uang Transport: Rp " + uangTransport);
		System.out.println("Uang Tunjangan: Rp " + uangTunjangan);
		System.out.println("Gaji Pokok: Rp "+ gajiPokok);
		System.out.println("Total Gaji: Rp "+ totalGaji);
			
		
	}

}
