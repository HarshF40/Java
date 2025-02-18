package intrfcs.multipleInh;

//multiple inheritance
public class SmartPhone implements Phone, Camera, MusicPlayer {

	@Override
	public void makeCall() {
		System.out.println("making call");
	}

	@Override
	public void endCall() {
		System.out.println("ending call");
	}

	@Override
	public void takePhoto() {
		System.out.println("Taking photo");
	} 

	@Override
	public void recordVideo(){
		System.out.println("recording video");
	}

	@Override
	public void playMusic(){
		System.out.println("playing music");
	}

	@Override
	public void stopMusic(){
		System.out.println("stopping music");
	}
	
}
