/**
 * Gesture
 */
public class Gesture implements Input {
	private Input in;

	public void connectTo(Input in) {
		this.in = in;
	}

	@Override
	public void read() {
		System.out.println("read gesture");
		in.read();
	}
}