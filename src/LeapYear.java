import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int year;
		boolean Leap = false;
		
		System.out.println("년수를 입력하시오: ");
		year = input.nextInt();
		
		Leap = (year % 4 == 0);
		if(Leap) {
			System.out.println(year + "년은 윤년입니다.");
		} else {
			System.out.println(year + "년은 윤년이 아닙니다.");
		}
	}

}
