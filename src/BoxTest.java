public class BoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box obj1 = new Box(10, 20, 50);
		Box obj2 = new Box(10, 20, 50);
		
		System.out.println("obj1 == obj2: " + obj1.isSameBox(obj1, obj2));
	}

}
