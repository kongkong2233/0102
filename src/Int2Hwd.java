import java.util.Scanner;

public class Int2Hwd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1;
		
		Scanner input = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���: ");
		number1 = input.nextInt();
		
		switch (number1) {
			case 1 : 
				System.out.print("�ϳ�");
				break;
			case 2 : 
				System.out.print("��");
				break;
			case 3 : 
				System.out.print("��");
				break;
		}
	}

}
