package latihankonstruktordestruktor;

/*
 * Nama (NPM) : 1. Aufa Akhdan Khairi (221106042887)
 * 				2. Fida Van Saeli (221106043011)
 * 				3. Muhammad Danise Raditya Saniestha (221106042959)
 * 
 * Kelas	  : Regurel D
 * Tugas 	  : Latihan Pertemuan 4 Konstruktor Desruktor
 * 			  : Latihan 47. NILAI MAHASISWA
 */
public class NilaiMahasiswa47 {
	private double quis;
	private double uts;
	private double uas;
	private double nilaiAkhir;
	
	public NilaiMahasiswa47(double quis, double uts, double uas) {
		this.quis = quis;
		this.uts = uts;
		this.uas = uas;
	}
	
	public void hitungNilaiAkhir() {
		this.nilaiAkhir = 0.20 * quis + 0.30 * uts + 0.50*uas;
	}
	
	public String tentukanIndex() {
        if (nilaiAkhir < 0 || nilaiAkhir > 100) {
            return "Nilai Tidak Valid";
        } else if (nilaiAkhir >= 80) {
            return "A";
        } else if (nilaiAkhir >= 68) {
            return "B";
        } else if (nilaiAkhir >= 56) {
            return "C";
        } else if (nilaiAkhir >= 45) {
            return "D";
        } else {
            return "E";
        }
    }

    public String berikanKeterangan() {
        String index = tentukanIndex();
        switch (index) {
            case "A":
                return "Sangat Baik";
            case "B":
                return "Baik";
            case "C":
                return "Cukup";
            case "D":
                return "Kurang";
            case "E":
                return "Sangat Kurang";
            default:
                return "Indeks tidak valid";
        }
    }

    public static void main(String[] args) {
    	NilaiMahasiswa47 mahasiswa2 = new NilaiMahasiswa47(75.0, 45.0, 34.0);
        mahasiswa2.hitungNilaiAkhir();
        String index2 = mahasiswa2.tentukanIndex();
        String keterangan2 = mahasiswa2.berikanKeterangan();
        System.out.println("quiz = 75.0, uts = 45.0, uas = 34.0");
        System.out.println("nilai akhir = " + mahasiswa2.nilaiAkhir);
        System.out.println("index = " + index2);
        System.out.println("keterangan = " + keterangan2);
    	
        NilaiMahasiswa47 mahasiswa1 = new NilaiMahasiswa47(60.0, 80.0, 75.0);
        mahasiswa1.hitungNilaiAkhir();
        String index1 = mahasiswa1.tentukanIndex();
        String keterangan1 = mahasiswa1.berikanKeterangan();
        System.out.println("\nquiz = 60.0, uts = 80.0, uas = 75.0");
        System.out.println("nilai akhir = " + mahasiswa1.nilaiAkhir);
        System.out.println("index = " + index1);
        System.out.println("keterangan = " + keterangan1);

        NilaiMahasiswa47 mahasiswa3 = new NilaiMahasiswa47(30.0, 80.0, 40.0);
        mahasiswa3.hitungNilaiAkhir();
        String index3 = mahasiswa3.tentukanIndex();
        String keterangan3 = mahasiswa3.berikanKeterangan();
        System.out.println("\nquiz = 30.0, uts = 80.0, uas = 40.0");
        System.out.println("nilai akhir = " + mahasiswa3.nilaiAkhir);
        System.out.println("index = " + index3);
        System.out.println("keterangan = " + keterangan3);
    }
}
