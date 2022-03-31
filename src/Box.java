public class Box {
	
	int width, length, height;
	
	Box(int w, int l, int h) {
		width = w;
		length = l;
		height = h;
	}
	
	boolean isSameBox (Box box1, Box box2) {
		if (box1.width == box2.width && box1.length == box2.length && box1.height == box2.height) 
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
