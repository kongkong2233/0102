import java.util.Scanner;

public class Checkinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int month;
		do {
			System.out.print("�ùٸ� ���� �Է��Ͻÿ� [1-12]: ");
			month = input.nextInt();
	
		} while (month < 1 || month > 12);
	} 
	
}