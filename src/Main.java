/**
 * Main
 */
public class Main {

	public static void main(String[] args) {
		Computer computer = new Computer();
		Hologram hologram = new Hologram();
		Sound soundIn = new Sound();
		Gesture gestureIn = new Gesture();

		soundIn.connectTo(hologram);
		gestureIn.connectTo(hologram);

		hologram.connectTo(computer);

		soundIn.read();
		gestureIn.read();
	}
}