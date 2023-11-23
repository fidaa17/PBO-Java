package latihankonstruktordestruktor;
/*
 * Nama (NPM) : 1. Aufa Akhdan Khairi (221106042887)
 * 				2. Fida Van Saeli (221106043011)
 * 				3. Muhammad Danise Raditya Saneistha (221106042959)
 * 
 * Kelas 	: Reguler D
 * Tugas	: Latihan Pertemuan 4 Konstruktor destruktor
 * 			: Latihan 41. MASSA JENIS
 */
public class Kubus41 {
	private int sisi;
	private int massa;
	
	//konstruktor
	public Kubus41(int sisi, int massa) {
		this.sisi = sisi;
		this.massa = massa;
	}
	
	public int getSisi() {
		return sisi;
	}
	
	public void setSisi() {
		this.sisi = sisi;
	}
	public int getMassa() {
		return massa;
	}
	public void setMassa() {
		this.massa = massa;
	}
	public int hitungVolume(int parSisi) {
		return parSisi * parSisi * parSisi;
	}
	public int hitungMassaJenis(int parMassa, int volume) {
		return parMassa / volume;
	}
	
	public static void main(String[] args) {
		Kubus41 kubus41 = new Kubus41(5,250);
		System.out.println("=======Massa Jenis Kubus=======");
		System.out.println("Sisi: "+ kubus41.getSisi());
		System.out.println("Massa: "+ kubus41.getMassa());
		System.out.println("\n=======Hasil Perhitungan=======");
		System.out.println("Volume: "+ kubus41.hitungVolume(kubus41.getSisi()));
		System.out.println("Massa Jenis: "+ kubus41.hitungMassaJenis(kubus41.getMassa(), kubus41.hitungVolume(kubus41.getSisi())));
	}
}
