//2������һ��ѧ����
//	����������String����ѧ�ţ�String�����꼶��int����רҵ��String��
//	Ȼ��̬���� 10 �����󣬲������Ӧ�ı���
public class E12_CreateAClass_Main {
	public static void main(String[] args) {
		int total=10;
		E12_CreateAClass stu;
		for (int i = 0; i < total; i++) {
			 stu =new E12_CreateAClass();
			 stu.name="Student"+(i+1);
			 stu.number=""+(i+1);
			 stu.grade="Sophomore";
			 stu.major="Computer";
			 System.out.println(stu.name+"��ѧ����"+stu.number+""
			 		+ "���꼶��"+stu.grade+"��רҵ��"+stu.major);
		}

	}
}
