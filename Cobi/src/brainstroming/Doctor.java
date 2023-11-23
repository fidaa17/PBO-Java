package brainstroming;

public class Doctor {
	private String identity;

    public Doctor(String identity) {
        this.identity = identity;
    }

    public void treatPatient() {
        System.out.println("Doctor is treating a patient.");
    }

    public void worksAtHospital() {
        System.out.println("Doctor works at a hospital.");
    }

}
class Surgeon extends Doctor {
    public Surgeon() {
        super("No Special Identity");
    }

    public void makeIncision() {
        System.out.println("Surgeon is making an incision.");
    }

	String getIdentity() {
		// TODO Auto-generated method stub
		return null;
	}
}

class FamilyDoctor extends Doctor {
    public FamilyDoctor() {
        super("House Calls and Family Advice Identity");
    }

    public void giveAdvice() {
        System.out.println("Family doctor is giving advice.");
    }

	String getIdentity() {
		// TODO Auto-generated method stub
		return null;
	}
}
