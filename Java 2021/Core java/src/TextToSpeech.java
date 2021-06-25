import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class TextToSpeech {

	public static void main(String[] args) {
		System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
		Voice voice ;
		voice = VoiceManager.getInstance().getVoice("kevin");//Getting voice
		if(voice != null) {
			voice.allocate();
		}
		try {
//			voice.setRate(190);
//			voice.setPitch(150);
//			voice.setVolume(3);
			voice.speak("Hello how are you bro");
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
