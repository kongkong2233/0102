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
		System.out.println("채널은 " + channel + "이고 볼륨은 " + volume + "입니다.");
	}

}
