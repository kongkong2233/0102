import java.util.Scanner;

public class AssertionTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("��¥�� �Է�: ");
		int date = input.nextInt();
		assert(date >= 1 && date <= 31): "�߸��� ��¥: " + date;
		System.out.printf("�Էµ� ��¥�� %d�Դϴ�.\n", date);
	}

}
