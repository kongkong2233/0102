public class Lec3Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		
		for (int i = 2; i <= 1000; i++) {
			for (int j = 2; j <= i; j++) {
				if (i % j == 0) {
					a++;
				}
			}
			
			if (a == 1) {
				System.out.print(i + " ");
			}
			
			a = 0;
		}
	}

}
