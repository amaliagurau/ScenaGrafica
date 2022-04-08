
public class Figuri {
	protected String culoare;

	public Figuri(String culoare) {
		this.culoare = culoare;
	}

	protected double perimetru() {
		return 0.0;
	}

	public String getCuloare() {
		return culoare;
	}

	public void setCuloare(String culoare) {
		this.culoare = culoare;
	}

	public String toString() {
		return this.getClass() + " " + this.getCuloare() + " Perimetru " + this.perimetru();
	}

	public boolean equals(Figuri f) {
		if ((this.getClass().equals(f.getClass())) && (this.perimetru() == f.perimetru())) {
			return true;
		}
		return false;
	}
}