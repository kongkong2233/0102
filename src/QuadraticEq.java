import java.util.Scanner;

public class QuadraticEq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		double b;
		double c;
		
		System.out.println("����� �Է��Ͻÿ�: ");
		b = input.nextFloat();
		
		System.out.println("����� �Է��Ͻÿ�: ");
		c = input.nextFloat();
		
		double offi = b * b - 4.0 * c;
		double root = Math.sqrt(offi);
		
		double r1 = (-b + root) / 2.0;
		double r2 = (-b - root) / 2.0;
		
		System.out.println("���� " + r1);
		System.out.println("���� " + r2);
	}

}
