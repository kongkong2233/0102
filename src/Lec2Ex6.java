public class Lec2Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int s[] = {12, 3, 19, 6, 18, 8, 12, 4, 1, 19};
		
		int min = s[0];
		
		for (int i = 0; i < s.length; i++) {
			if (min > s[i]) {
				min = s[i];
			}
		}
		
		System.out.print("ÃÖ¼Ò°ª: " + min);
	}

}
