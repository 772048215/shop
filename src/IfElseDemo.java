import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int num = s.nextInt();

		if (num % 2 == 1) {
			System.out.println("��һ������");
		} else {
			System.out.println("��һ��ż��");
		}

	}

}