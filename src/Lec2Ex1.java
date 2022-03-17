import java.util.Scanner;

public class Lec2Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1;
		int number2;
		
		Scanner input = new Scanner(System.in);
		System.out.print("첫 번째 정수를 입력하세요: ");
		number1 = input.nextInt();
		
		System.out.print("두 번째 정수를 입력하세요: ");
		number2 = input.nextInt();
		
		if (number1 > number2) {
			System.out.println(number1 + "(이)가 " + number2 + "보다 큽니다.");
		}else {
			System.out.println(number2 + "(이)가 " + number1 + "보다 큽니다.");
		}
	}

}
