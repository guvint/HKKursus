package hKKursus.modul2ObjektorienteretProgrammering.figurer;

public class Cirkel extends Figur {
	int radius;

	public Cirkel(int radius) {
		super();
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public double getAreal() {
		return 2 * Math.PI * radius;
	}

}
