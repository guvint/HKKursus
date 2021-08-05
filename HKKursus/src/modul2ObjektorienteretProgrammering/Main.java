package modul2ObjektorienteretProgrammering;

/**
 * Opgave 2.3.1 Lav klasserne Figur, Firkant og Cirkel. I stedet for metoden
 * getAreal fra eksemplet, skal de have metoden getOmkreds.
 * 
 * Firkantens omkreds er (2 * bredde) + (2 * højde). Cirklens omkreds er 2 * pi
 * * radius.
 * 
 * Lav constructors og get- og set-metoder.
 * 
 * Opgave 2.3.2 Lav også Trekant-klassen. Omkredsen af trekanten er summen af
 * længden af de tre sider.
 */
public class Main {

	public static void main(String[] args) {
		Figur[] mineFigurer = new Figur[] { new Firkant(2, 6), new Cirkel(3), new Trekant(1, 2, 3) };

		for (Figur figur : mineFigurer) {
			figur.printAreal();
		}
	}

}
