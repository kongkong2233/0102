import java.util.Scanner;

public class Lec2Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1;
		int number2;
		
		Scanner input = new Scanner(System.in);
		System.out.print("ù ��° ������ �Է��ϼ���: ");
		number1 = input.nextInt();
		
		System.out.print("�� ��° ������ �Է��ϼ���: ");
		number2 = input.nextInt();
		
		if (number1 > number2) {
			System.out.println(number1 + "(��)�� " + number2 + "���� Ů�ϴ�.");
		}else {
			System.out.println(number2 + "(��)�� " + number1 + "���� Ů�ϴ�.");
		}
	}

}
