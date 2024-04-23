import java.io.File;
import java.io.IOException;

import javax.sound.sampled.*;

public class Music {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		
		File file = new File("the .wav file");
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
		Clip clip = AudioSystem.getClip();
		clip.open(audioStream);
		
		clip.start();
		
	}

}
