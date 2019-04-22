/**
 * Hologram
 */
public class Hologram implements Input {
	private Transmition transmition;

	public void connectTo(Transmition transmition) {
		this.transmition = transmition;
	}

	@Override
	public void read() {
		System.out.println("read input hologram");
		System.out.print("sending data ");

		for (char var : "........".toCharArray()) {
			try {
				Thread.sleep(1000);
				System.out.print(var + "");
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println();

		transmition.transmitData();
		System.out.println();
	}
}