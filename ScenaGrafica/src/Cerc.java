
public class Cerc extends Figuri {
	private double r;

	public Cerc(String culoare, double r) {
		super(culoare);
		this.r = r;
	}

	public double perimetru() {
		return r * 3.1215;
	}
}