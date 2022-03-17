import java.util.Scanner;

public class DaysInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Month;
		
		Scanner input = new Scanner(System.in);
		System.out.print("월을 입력하세요: ");
		Month = input.nextInt();
		
		switch (Month) {
		case 4 : 
		case 6 :
		case 9 :
		case 11 : 
			System.out.print(Month + "월의 일수는 30일 입니다.");
			break;
		case 2 : 
			System.out.print(Month + "월의 일수는 28일 입니다.");
			break;
		default : 
			System.out.print(Month + "월의 일수는 31일 입니다.");
			break;
	}
	}

}
