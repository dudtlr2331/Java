package week14;

public class Lecturer {
	public String lecturer = "�Ϲݰ���";
	public int time = 4;

	public void Lecturer() {
		
	}

}

class LecturerP extends Lecturer{
	public LecturerP() {
		lecturer= "���� ����";
	}
	public void Lecturer() {
		System.out.println(lecturer);
		System.out.println("����� : " + time * 90000 + "��\n");
	}
}

class LecturerNight extends Lecturer{
	public LecturerNight() {
		lecturer= "�߰� ����";
	}
	public void Lecturer() {
		System.out.println(lecturer);
		System.out.println("����� : " + time * 135000 + "��\n");
	}
}

class LecturerAtGS extends Lecturer{
	public LecturerAtGS() {
		lecturer= "���п� ����";
	}
	public void Lecturer() {
		System.out.println(lecturer);
		System.out.println("����� : " + time * 180000 + "��\n");
	}
}

class LecturerWithWork extends Lecturer{
	public LecturerWithWork() {
		lecturer= "������ ����";
	}
	public void Lecturer() {
		System.out.println(lecturer);
		System.out.println("����� : " + time * 45000 + "��\n");
	}
}