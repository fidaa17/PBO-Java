package latihangettersetter;
/*
 * Nama (NPM) : 1. Aufa Akhdan Khairi (221106042887)
 * 				2. Fida Van Saeli (221106043011)
 * 				3. Muhammad Danise Raditya Saneistha (221106042959)
 * 
 * Kelas 	: Reguler D
 * Tugas	: Latihan Pertemuan 4 Getter Setter
 */
public class Tester {

	public static void main(String[] args) {
		// class persegi panjang
		PersegiPanjang persegiPanjang = new PersegiPanjang(100, 45);
		System.out.println("Persegi Panjang");
		System.out.println("Panjang: "+ persegiPanjang.getPanjang());
		System.out.println("Lebar: "+ persegiPanjang.getLebar());
		System.out.println("Keliling: "+ persegiPanjang.hitungKeliling());
		System.out.println("Luas: "+ persegiPanjang.hitungLuas());
		
		//class persegi
		Persegi persegi = new Persegi(80);
		System.out.println("\nPersegi");
		System.out.println("Sisi: "+ persegi.getSisi());
		System.out.println("Keliling: "+ persegi.hitungKeliling());
		System.out.println("Luas: "+ persegi.hitungLuas());
	}

}
