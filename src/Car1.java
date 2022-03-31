class Car {

		String color;
		int gear;
		int speed;
		
		@Override
		public String toString() {
			return "Car[color="+color+", speed="+speed+", gear="+gear+"]";
		}
		
		void Carcolor (String c) {
			color = c;
		}
		
		void changeGear(int g) {
			gear = g;
		}
		
		void speedUp() {
			speed = speed + 10;
		}
		
		void speedDown() {
			speed = speed - 10;
		}
	}

public class Car1 {
	public static void main(String[] args) {
		
		Car myCar = new Car();
		myCar.Carcolor("»¡°£»ö");
		myCar.changeGear(1);
		myCar.speedUp();
		System.out.println(myCar);
	}
}

