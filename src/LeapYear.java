public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year = 2024;
		boolean Leap = false;
		
		Leap = (year % 4 == 0);
		if(Leap) {
			System.out.println(year + "년은 윤년입니다.");
		} else {
			System.out.println(year + "년은 윤년이 아닙니다.");
		}
	}

}
