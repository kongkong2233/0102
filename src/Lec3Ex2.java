import java.util.Scanner;

public class Lec3Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("양의 정수를 입력하시오: ");
		
		int num1 = input.nextInt();
		int a;
		
		System.out.println(num1 + "의 약수는 다음과 같습니다.");
		
		for (a = 1; a <= num1; a++) {
			if ((num1%a) == 0) {
				System.out.print(a + " ");
			}
		}
	}

}
