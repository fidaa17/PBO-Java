package latihangettersetter;

public class PersegiPanjang {
 private double panjang;
 private double lebar;
 
 public PersegiPanjang(double panjang, double lebar) {
	 this.panjang = panjang;
	 this.lebar = lebar;
 }
 public double getPanjang() {
	 return panjang;
 }
 public void setPanjang(double panjang) {
	 this.panjang = panjang;
 }
 public double getLebar() {
	 return lebar;
 }
 public void setLebar(double lebar) {
	 this.lebar = lebar;
 }
 public double hitungKeliling() {
	 return 2 * (panjang + lebar);
 }
 public double hitungLuas() {
	 return panjang * lebar;
 }
}
