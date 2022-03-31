public class Car_sTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car_s c1 = new Car_s("S600", "white", 80);
		Car_s c2 = new Car_s("E500", "blue", 20);
		Car_s c3 = new Car_s("C400", "red", 50);
		int n = Car_s.getNumberOfCars();
		System.out.println("지금까지 생성된 자동차 수 = " + n);
	}

}
