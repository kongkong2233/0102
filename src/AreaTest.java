import java.util.Scanner;

public class AreaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		double radius;
		double area;
		final double PI = 3.141592;
		
		System.out.println("반지름을 입력하시오: ");
		radius = input.nextInt();
		
		area = PI * radius * radius;
		
		System.out.println("반지름이 " + radius + "인 원의 면적은 " + area + "입니다.");
	}

}
