import java.util.Scanner;

public class Int2Hwd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1;
		
		Scanner input = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		number1 = input.nextInt();
		
		switch (number1) {
			case 1 : 
				System.out.print("하나");
				break;
			case 2 : 
				System.out.print("둘");
				break;
			case 3 : 
				System.out.print("셋");
				break;
		}
	}

}
