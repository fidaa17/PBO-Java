package latihangettersetter;

public class Persegi {
	private double sisi;
	
	public Persegi(double sisi) {
		this.sisi = sisi;
	}
	
	public double getSisi() {
		return sisi;
	}
	
	public void setSisi(double sisi) {
		this.sisi = sisi;
	}
	
	public double hitungKeliling() {
		return 4 * sisi;
	}
	
	public double hitungLuas() {
		return sisi * sisi;
	}
}
