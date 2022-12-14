package week14;

public class Lecturer {
	public String lecturer = "일반강사";
	public int time = 4;

	public void Lecturer() {
		
	}

}

class LecturerP extends Lecturer{
	public LecturerP() {
		lecturer= "순수 강사";
	}
	public void Lecturer() {
		System.out.println(lecturer);
		System.out.println("강사료 : " + time * 90000 + "원\n");
	}
}

class LecturerNight extends Lecturer{
	public LecturerNight() {
		lecturer= "야간 강사";
	}
	public void Lecturer() {
		System.out.println(lecturer);
		System.out.println("강사료 : " + time * 135000 + "원\n");
	}
}

class LecturerAtGS extends Lecturer{
	public LecturerAtGS() {
		lecturer= "대학원 강사";
	}
	public void Lecturer() {
		System.out.println(lecturer);
		System.out.println("강사료 : " + time * 180000 + "원\n");
	}
}

class LecturerWithWork extends Lecturer{
	public LecturerWithWork() {
		lecturer= "직장인 강사";
	}
	public void Lecturer() {
		System.out.println(lecturer);
		System.out.println("강사료 : " + time * 45000 + "원\n");
	}
}