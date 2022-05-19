import java.util.Scanner;

public class AssertionTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("날짜를 입력: ");
		int date = input.nextInt();
		assert(date >= 1 && date <= 31): "잘못된 날짜: " + date;
		System.out.printf("입력된 날짜는 %d입니다.\n", date);
	}

}
