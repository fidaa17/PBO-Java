package praktikum5;
// inheritance (pewarisan)
// dan Visibility

public  abstract class Hewan {
	protected static String name;
	protected abstract void eat();
}

class Cat extends Hewan {
	String warna;
	int berat;
//	inheritance
	public void identitas(String namaKucing, String warnaKucing, int beratKucing) {
		Cat.name = namaKucing;
		warna = warnaKucing;
		berat = beratKucing;
	}
	public void eat() {
		System.out.print(Cat.name + " Suka Makan Tulang Ayam");
	}
	
// Visibility
	String ambilNama() {
		return Cat.name;
	}
	String ambilWarna() {
		return warna;
	}
	int ambilBerat() {
		return berat;
	}
}