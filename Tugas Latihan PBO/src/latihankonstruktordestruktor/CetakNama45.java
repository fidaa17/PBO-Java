package latihankonstruktordestruktor;
import java.util.Scanner;

/*
 * Nama (NPM): 1. Aufa Akhdan Khairi (221106042887)
 *   			2. Fida Van Saeli (221106043011)
 *			    3. Muhammad Danise Raditya Saneistha (221106042959)
 * Kelas 	 : Reguler D
 * Tugas	 : Latihan Pertemuan 4 Konstruktor destruktor
 *		 	 : Latihan 45. Cetak Nama
 */

public class CetakNama45 {
    private int jmlCetak;
    private String nama;

    public int getJmlCetak() {
        return jmlCetak;
    }

    public void setJmlCetak(int jmlCetak) {
        this.jmlCetak = jmlCetak;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void cetak(String namaAnda) {
        System.out.println("Nama Anda: " + namaAnda);
    }

    public void cetak(int jmlCetak, String hasilCetak) {
        System.out.println("Hasil cetak:");
        for (int i = 1; i <= jmlCetak; i++) {
            System.out.println(i + ". " + hasilCetak);
        }
    }

    public static void main(String[] args) {
        CetakNama45 aplikasi = new CetakNama45();
        System.out.println("=======Aplikasi Pencetak Nama=======");

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama Anda: ");
        String namaAnda = input.nextLine();
        aplikasi.setNama(namaAnda);

        System.out.print("Mau mencetak nama berapa kali: ");
        int jmlCetak = input.nextInt();
        aplikasi.setJmlCetak(jmlCetak);

        System.out.println("Nama Anda: " + aplikasi.getNama());
        aplikasi.cetak(aplikasi.getJmlCetak(), aplikasi.getNama());
    }

}
