import java.util.Scanner;

public class strwww {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url;
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.print("�ּҸ� �Է��ϼ���: ");
			url = scan.next();
			if(url.equals("quit") == true) 
				break;
			
			if(url.matches("^www\\.(.+)")) {
				System.out.println(url + " �� 'www'�� �����մϴ�.");
			} else {
				System.out.println(url + " �� 'www'�� �������� �ʽ��ϴ�.");
			}
		}
	}

}
