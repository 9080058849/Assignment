package week3Interface;

public class Samsung implements AndroidDesign {

	

	@Override
	public void makecall() {
		System.out.println("make call");
		
	}

	@Override
	public void videoCall() {
		System.out.println("videocall");
		
	}

	@Override
	public void voiceCall() {
		System.out.println("voicecall");
		
	}
	public static void main(String[] args) 
	{
		Samsung sam=new Samsung();
		sam.makecall();
		sam.videoCall();
		sam.voiceCall();
	}
}