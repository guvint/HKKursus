package figurer_modul2ObjektorienteretProgrammering;

public class Trekant extends Figur {
	int laengde1;
	int laengde2;
	int laengde3;

	public Trekant(int laengde1, int laengde2, int laengde3) {
		super();
		this.laengde1 = laengde1;
		this.laengde2 = laengde2;
		this.laengde3 = laengde3;
	}

	public int getLaengde1() {
		return laengde1;
	}

	public void setLaengde1(int laengde1) {
		this.laengde1 = laengde1;
	}

	public int getLaengde2() {
		return laengde2;
	}

	public void setLaengde2(int laengde2) {
		this.laengde2 = laengde2;
	}

	public int getLaengde3() {
		return laengde3;
	}

	public void setLaengde3(int laengde3) {
		this.laengde3 = laengde3;
	}

	@Override
	public double getAreal() {
		return laengde1 + laengde2 + laengde3;
	}

}
