package figurer_modul2ObjektorienteretProgrammering;

public class Firkant extends Figur {
	int bredde;
	int hojde;
	
	public Firkant(int bredde, int hojde) {
		super();
		this.bredde = bredde;
		this.hojde = hojde;
	}
	
	public int getBredde() {
		return bredde;
	}
	
	public void setBredde(int bredde) {
		this.bredde = bredde;
	}
	
	public int getHojde() {
		return hojde;
	}
	
	public void setHojde(int hojde) {
		this.hojde = hojde;
	}

	@Override
	public double getAreal() {
		return bredde * hojde;
	}
}
