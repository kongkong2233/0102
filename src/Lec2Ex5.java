import java.util.Scanner;

public class Lec2Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		double pi = 0;
		double a = 1;
		double b = 1;
		
		System.out.print("�ݺ� Ƚ���� �Է��Ͻÿ�: ");
		
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		for (i = 1; i <= num; i++) {
			pi = pi + (1/a) * b;
			a = a + 2;
			b = b * -1;
		}
		
		System.out.println(4*pi);
	}

}
