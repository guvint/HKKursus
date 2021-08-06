package staticFinal_modul2ObjektorienteretProgrammering;

/**
 * Lav en klasse, der kan omregne mellem Euro og danske kroner. Antag at en euro
 * koster 7,50 kroner.
 * 
 * Lav en konstant (final variabel) til kursen og lav de to statiske metoder
 * kronerTilEuro og euroTilKroner.
 */
public class EuroKroner {
	public final static double KURS = 7.50;
	
	public static double euroTilKroner(double belob) {
		double nytBelob = belob * KURS;
		
		return nytBelob;
	}
	
	public static double kronerTilEuro(double belob) {
		double nytBelob = belob / KURS;
		
		return nytBelob;
	}
}
