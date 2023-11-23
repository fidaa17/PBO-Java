package tebakan;
import java.util.Random;
import java.util.Scanner;
public class TebakAngka {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int angkaTertebak = random.nextInt(100) + 1; // Angkaacakantara1hingga100
        int tebakan;
        int percobaan = 0;
        boolean benar = false;

        System.out.println("Selamat datang di permainan Tebak Angka!");
        System.out.println("Saya telah memilih sebuah angka antara 1 hingga 100.");
        
        while (!benar) {
            System.out.print("Tebak angka: ");
            tebakan = input.nextInt();
            percobaan++;

            if (tebakan < angkaTertebak) {
                System.out.println("Angka yang kamu tebak terlalu kecil. Coba lagi!");
            } else if (tebakan > angkaTertebak) {
                System.out.println("Angka yang kamu tebak terlalu besar. Coba lagi!");
            } else {
                benar = true;
                System.out.println("Selamat! Kamu berhasil menebak angka " + angkaTertebak + " dalam " + percobaan + " percobaan.");
            }
        }

        input.close();
    }
}

