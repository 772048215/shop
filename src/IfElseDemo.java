import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int num = s.nextInt();

		if (num % 2 == 1) {
			System.out.println("是一个奇数");
		} else {
			System.out.println("是一个偶数");
		}

	}

}