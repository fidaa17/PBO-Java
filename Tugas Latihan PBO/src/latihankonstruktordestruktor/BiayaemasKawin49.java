package latihankonstruktordestruktor;

/*
 * Nama (NPM): 1. Aufa Akhdan Khairi (221106042887)
 *   			2. Fida Van Saeli (221106043011)
 *			    3. Muhammad Danise Raditya Saneistha (221106042959)
 * Kelas 	 : Reguler D
 * Tugas	 : Latihan Pertemuan 4 Konstruktor destruktor
 *		 	 : Latihan 49. Biaya Emas Kawin
 */

public class BiayaemasKawin49 {
    private double hargaEmasPerGram;
    private double beratEmas;

    public BiayaemasKawin49(double hargaEmasPerGram, double beratEmas) {
        this.hargaEmasPerGram = hargaEmasPerGram;
        this.beratEmas = beratEmas;
    }

    public double hitungTotalBiaya() {
        return hargaEmasPerGram * beratEmas;
    }
    public static void main(String[] args) {
        double hargaEmasPerGram = 570000; // Harga 1 gram emas per bulan Oktober (dalam Rupiah)
        double beratEmas = 15.7; // Berat emas yang akan dibeli oleh Hendi (dalam gram)

        BiayaemasKawin49 hendi = new BiayaemasKawin49(hargaEmasPerGram, beratEmas);

        double totalBiaya = hendi.hitungTotalBiaya();

        System.out.println("Total biaya yang harus dikeluarkan oleh Hendi adalah: Rp" + totalBiaya);
    }
}

