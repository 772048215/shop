import java.util.Scanner;

public class IfDemo {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int i = s.nextInt();

		// 如果i大于5，才输出i
		// 如果代码块只有一句，{}可以省略
		if (i > 5) {
			System.out.println(i);
			System.out.println(i * 2);
		}

	}

}