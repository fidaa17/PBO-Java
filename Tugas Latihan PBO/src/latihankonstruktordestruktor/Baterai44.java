package latihankonstruktordestruktor;
/*
 * Nama (NPM) : 1. Aufa Akhdan Khairi (221106042887)
 * 				2. Fida Van Saeli (221106043011)
 * 				3. Muhammad Danise Raditya Saneistha (221106042959)
 * 
 * Kelas 	: Reguler D
 * Tugas	: Latihan Pertemuan 4 Konstruktor destruktor
 * 			: Latihan 44. HUKUM OHM
 */
public class Baterai44 {
	private float kuatArus;
	private float hambatan;
	
	//konstruktor tanpa parameter
	public Baterai44() {
		this.kuatArus = 3.0f;
		this.hambatan = 12.0f;
	}
	
	//Konstruktor dengan parameter
	public Baterai44(float kuatArus, float hambatan) {
		this.kuatArus = kuatArus;
		this.hambatan = hambatan;
	}
	
	public float getKuatArus() {
		return kuatArus;
	}
	
	public float getHambatan() {
		return hambatan;
	}
	
	public float hitungTegangan() {
		return kuatArus * hambatan;
	}
	
	public static void main(String[] args) {
		Baterai44 baterai44 = new Baterai44();
		
		System.out.println("=======Hukum Ohm=======");
		System.out.println("Kuat arus yang mengalir pada suatu kawat penghantar"
				+"\nakan berbanding lurus dengan beda potensial"
				+"\npada ujung-ujung kawat penghantar tersebut"
				+"\nasalkan suhu kawat dijaga konstan");
		System.out.println("\nKuat Arus: "+ baterai44.getKuatArus()+ " ampere");
		System.out.println("Hambatan: "+ baterai44.getHambatan()+ " ohm");
		System.out.println("Hasil Tegangan: "+ baterai44.hitungTegangan()+ " Volt");
	}
}
