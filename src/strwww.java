import java.util.Scanner;

public class strwww {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url;
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.print("주소를 입력하세요: ");
			url = scan.next();
			if(url.equals("quit") == true) 
				break;
			
			if(url.matches("^www\\.(.+)")) {
				System.out.println(url + " 은 'www'로 시작합니다.");
			} else {
				System.out.println(url + " 은 'www'로 시작하지 않습니다.");
			}
		}
	}

}
