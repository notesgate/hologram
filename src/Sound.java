/**
 * Sound
 */
public class Sound implements Input {
	private Input in;

	public void connectTo(Input in) {
		this.in = in;
	}

	@Override
	public void read() {
		System.out.println("read sound");
		in.read();

	}
}