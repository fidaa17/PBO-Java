package jalan;

public class Age3 {
	    private String red;

	    public Age3(String red) {
	        this.red = red;
	    }

	    public String getRed() {
	        return red;
	    }

	    public void setRed(String red) {
	        this.red = red;
	    }

	    public static void main(String[] args) {
	        Age3 age3 = new Age3("SomeValue"); // Ganti "SomeValue" dengan nilai String yang Anda inginkan
	        String redValue = age3.getRed();
	        System.out.println("Nilai red: " + redValue);
	    }
	}
class Age {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        String redText = "Teks Berwarna Merah";
        System.out.println(ANSI_RED + redText + ANSI_RESET);
    }
}

