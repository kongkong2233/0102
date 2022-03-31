public class SafeArray {

	private int a[];
	public int length;
	public SafeArray(int size) {
		a = new int[size];
		length = size;
	}
	public int get(int index) {
		if (index >= 0 && index < length) {
			return a[index];
		}
		return -1;
	}
	private void put(int index, int value) {
		// TODO Auto-generated method stub
		if (index >= 0 && index < length) {
			a[index] = value;
		} else
			System.out.println("잘못된 인덱스 " + index);
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SafeArray array = new SafeArray(3);
		
		for (int i = 0; i < (array.length + 1); i++) {
			array.put(i, i * 10);
		}
	}
	

}
