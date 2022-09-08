package ex1;

public class Mid_1 {
	String student[];

	Mid_1(int n) {
		student = new String[n];
	}

	public void input(String name) {
		for (int i = 0; i < student.length; i++) {
			if (this.student[i] == null) {
				this.student[i] = name;
				break;
			}
		}
	}

	public int seek(String name) {
		for (int i = 0; i < student.length; i++) {
			if (this.student[i].equals(name))
				return i;
		}
		return -1;
	}
	
	public String[] getStudent() {
		return student;
	}

	public static void main(String[] args) {
		int n = 2;
		
		Mid_1 st = new Mid_1(n);

		st.input("ȫ�浿");
		st.input("�浿");

		for(String str : st.getStudent())
			System.out.println(str);

		st.seek("ȫ�浿");
		System.out.println(st.seek("ȫ�浿"));
		System.out.println(st.seek("�浿"));
		System.out.println(st.seek("��"));

	}
}
