package latihan;

import java.util.Scanner;

public class Perhitungan {
	public static void perkalian (){
	//TODO Auto-generated 
		int angka1, angka2, hasil;
		Scanner Input = new Scanner(System.in);
		
		System.out.print("--- Perkalian ---");
		System.out.print("\nMasukan Angka 1 =");
		angka1 = Input.nextInt();
		System.out.print("Masukan Angka 2 =");
		angka2 = Input.nextInt();
		
		hasil = angka1 * angka2;
		System.out.println("Hasil Perkalian = "+hasil);
	}
		
	
		public static void pembagian (){
		//TODO Auto-generated 
			int angka1, angka2, hasil;
			Scanner Input = new Scanner(System.in);
			
			System.out.print("--- Pembagian ---");
			System.out.print("\nMasukan Angka 1 =");
			angka1 = Input.nextInt();
			System.out.print("Masukan Angka 2 =");
			angka2 = Input.nextInt();
			
			hasil = angka1 / angka2;
			System.out.println("Hasil Pembagian = "+hasil);		
		}

		
			public static void pengurangan (){
			//TODO Auto-generated 
				int angka1, angka2, hasil;
				Scanner Input = new Scanner(System.in);
				
				System.out.print("--- Pengurangan ---");
				System.out.print("\nMasukan Angka 1 =");
				angka1 = Input.nextInt();
				System.out.print("Masukan Angka 2 =");
				angka2 = Input.nextInt();
				
				hasil = angka1 - angka2;
				System.out.println("Hasil Pengurangan = "+hasil);
			}
			
	
				public static void penambahan (){
				//TODO Auto-generated 
					int angka1, angka2, hasil;
					Scanner Input = new Scanner(System.in);
					
					System.out.print("--- Penambahan ---");
					System.out.print("\nMasukan Angka 1 =");
					angka1 = Input.nextInt();
					System.out.print("Masukan Angka 2 =");
					angka2 = Input.nextInt();
					
					hasil = angka1 + angka2;
					System.out.println("Hasil Penambahan = "+hasil);
					
				}
}

			

					