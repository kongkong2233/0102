import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int year;
		boolean Leap = false;
		
		System.out.println("����� �Է��Ͻÿ�: ");
		year = input.nextInt();
		
		Leap = (year % 4 == 0);
		if(Leap) {
			System.out.println(year + "���� �����Դϴ�.");
		} else {
			System.out.println(year + "���� ������ �ƴմϴ�.");
		}
	}

}
