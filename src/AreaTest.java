import java.util.Scanner;

public class AreaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		double radius;
		double area;
		final double PI = 3.141592;
		
		System.out.println("�������� �Է��Ͻÿ�: ");
		radius = input.nextInt();
		
		area = PI * radius * radius;
		
		System.out.println("�������� " + radius + "�� ���� ������ " + area + "�Դϴ�.");
	}

}
