public class Television {
	
	private int channel;
	private int volume;
	private boolean onOff;


	int getChannel() {
		return channel;
	}
	
	void setChannel(int ch) {
		channel = ch;
	}
	
	void print() {
		System.out.println("ä���� " + channel + "�̰� ������ " + volume + "�Դϴ�.");
	}

}
