import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class TextToSpeech {

	public static void main(String[] args) {
		System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
		Voice voice = VoiceManager.getInstance().getVoice("Kelvin");
		if(voice != null) {
			voice.allocate();
		}
		try {
			voice.setRate(190);
			voice.setPitch(150);
			voice.setVolume(3);
			voice.speak("Hello JAva");
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
