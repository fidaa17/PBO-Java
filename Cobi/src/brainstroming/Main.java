package brainstroming;

public class Main {
	public static void main(String[] args) {
        Surgeon surgeon = new Surgeon();
        FamilyDoctor familyDoctor = new FamilyDoctor();

        surgeon.treatPatient();
        surgeon.makeIncision();
        surgeon.worksAtHospital();
        System.out.println("Surgeon's Identity: " + surgeon.getIdentity());

        familyDoctor.treatPatient();
        familyDoctor.giveAdvice();
        familyDoctor.worksAtHospital();
        System.out.println("Family Doctor's Identity: " + familyDoctor.getIdentity());
    }
}
