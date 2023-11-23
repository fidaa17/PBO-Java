package latihankonstruktordestruktor;
import java.lang.Throwable;
/*
 * Nama (NPM) : 1. Aufa Akhdan Khairi (221106042887)
 * 				2. Fida Van Saeli (221106043011)
 * 				3. Muhammad Danise Raditya Saneistha (221106042959)
 * 
 * Kelas 	: Reguler D
 * Tugas	: Latihan Pertemuan 4 Konstruktor destruktor
 * 			: Latihan 48. KALKULATOR
 */
public class Kalkulator48 {
	private double value1;
	private double value2;
	private String projectName;
	private String projectNote;
	
	public double getValue1(){
		return value1;
	}
	public void setValue1(double value1) {
		this.value1 = value1;
	}
	public double getValue2() {
		return value2;
	}
	public void setValue2(double value2) {
		this.value2 = value2;
	}
	public void setNameProject() {
		this.projectName = "Project Calculator";
	}
	public void setNoteProject(String note) {
		this.projectNote = note;
	}
	public double add(double val1, double val2) {
		return val1 + val2;
	}
	public double minus(double val1, double val2) {
		return val1 - val2;
	}
	public double multiplication(double val1, double val2) {
		return val1 * val2;
	}
	
	public double division(double val1, double val2) {
		if(val2 !=0) {
			return val1 / val2;
		}else {
			throw new IllegalArgumentException("");
		}
	}
	
	public static void main(String[] args) {
		Kalkulator48 calc = new Kalkulator48();
		
		calc.setValue1(7.0);
		calc.setValue2(5.0);
		
		System.out.println("VALUE 1 = "+ calc.getValue1());
		System.out.println("VALUE 2 = "+ calc.getValue2());
		System.out.println("Project Calculator");
		
		calc.setNameProject();
		
		System.out.println("This project shown you how to manage method in java");
		System.out.println("Result Add is = "+ calc.add(calc.getValue1(), calc.getValue2()));
		System.out.println("Result Minus is = "+ calc.minus(calc.getValue1(), calc.getValue2()));
		System.out.println("Result Multiple is = "+ calc.multiplication(calc.getValue1(), calc.getValue2()));
		
		try {
			System.out.println("Result Division is = " +calc.division(calc.getValue1(), calc.getValue2()));
		
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
