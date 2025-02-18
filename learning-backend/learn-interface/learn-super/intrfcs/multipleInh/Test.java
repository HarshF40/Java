package intrfcs.multipleInh;

public class Test {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.playMusic();
		sp.takePhoto();
		sp.recordVideo();
		sp.stopMusic();
		sp.makeCall();
		sp.endCall();
	}
}
