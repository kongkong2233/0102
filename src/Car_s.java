public class Car_s {
	
	private String model;
	private String color;
	private int speed;
	
	private int id;
	private static int numbers = 0;
	
	public Car_s(String m, String c, int s) {
		model = m;
		color = c;
		speed = s;
		id = ++numbers;
	}

	public static int getNumberOfCars() {
		return numbers;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
