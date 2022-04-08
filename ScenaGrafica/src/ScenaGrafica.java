import java.util.ArrayList;

public class ScenaGrafica {

	public static void main(String[] args) {
		Patrat s1 = new Patrat("Pink", 6.51);
		Triunghi t1 = new Triunghi("Red", 2.4, 2.7, 8.1);
		Cerc c1 = new Cerc("Black", 9.6);

		ArrayList<Figuri> figuri = new ArrayList<Figuri>();
		
		figuri.add(s1);
		figuri.add(t1);
		figuri.add(c1);
		
		System.out.println(figuri);
	}
}