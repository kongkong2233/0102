import java.util.Scanner;

public class Lec3Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("���� ������ �Է��Ͻÿ�: ");
		
		int num1 = input.nextInt();
		int a;
		
		System.out.println(num1 + "�� ����� ������ �����ϴ�.");
		
		for (a = 1; a <= num1; a++) {
			if ((num1%a) == 0) {
				System.out.print(a + " ");
			}
		}
	}

}
