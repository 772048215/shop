import java.util.Scanner;

public class IfDemo {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int i = s.nextInt();

		// ���i����5�������i
		// ��������ֻ��һ�䣬{}����ʡ��
		if (i > 5) {
			System.out.println(i);
			System.out.println(i * 2);
		}

	}

}