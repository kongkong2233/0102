import java.util.Scanner;

public class Lec2Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int s[] = {0, 11, 18, 29, 35, 49, 62, 68, 73, 88, 100};
		int value;
		
		int index1 = -1;
		int index2 = -1;
		
		System.out.print("정수를 입력하시오: ");
		
		Scanner input = new Scanner(System.in);
		value = input.nextInt();
		
		for (int i = 0; i < s.length; i++) {
			if (s[i] < value) {
				index1 = s[i];
			}
		}
		
		for (int i = 0; i < s.length ; i++) {
			if (s[i] > value) {
				index2 = s[i];
				
				break;
			}
		}
		
			System.out.println("" + value + "은(는) " + index1 + "보다 크고 " + index2 + "보다 작습니다.");
		
	}

}
