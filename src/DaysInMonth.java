import java.util.Scanner;

public class DaysInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Month;
		
		Scanner input = new Scanner(System.in);
		System.out.print("���� �Է��ϼ���: ");
		Month = input.nextInt();
		
		switch (Month) {
		case 4 : 
		case 6 :
		case 9 :
		case 11 : 
			System.out.print(Month + "���� �ϼ��� 30�� �Դϴ�.");
			break;
		case 2 : 
			System.out.print(Month + "���� �ϼ��� 28�� �Դϴ�.");
			break;
		default : 
			System.out.print(Month + "���� �ϼ��� 31�� �Դϴ�.");
			break;
	}
	}

}
