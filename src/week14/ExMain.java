package week14;

public class ExMain {

	public static void main(String[] args) {
		Lecturer le = new Lecturer();
		le.Lecturer();

		LecturerP lp = new LecturerP();
		lp.Lecturer();
		
		LecturerNight ln = new LecturerNight();
		ln.Lecturer();
		
		LecturerAtGS la = new LecturerAtGS();
		la.Lecturer();
		
		LecturerWithWork lw = new LecturerWithWork();
		lw.Lecturer();
	}

}
