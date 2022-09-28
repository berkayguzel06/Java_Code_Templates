import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
public class Sounds {
	static public void play(String soundName) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		File sound = new File(soundName);// main sound
		AudioInputStream audiostream = AudioSystem.getAudioInputStream(sound);
		Clip clip = AudioSystem.getClip();
		clip.open(audiostream);
		clip.start();
	}
}