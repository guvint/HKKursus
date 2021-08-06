package staticFinal_modul2ObjektorienteretProgrammering;

/**
 * Lav en kundeklasse, som har en statisk variabel kaldet naesteKunde. Denne
 * variabel skal indeholde det næste kundenummer.
 * 
 * Klassen skal også have en variabel, der hedder kundenummer og er objektets
 * eget kundenummer.
 * 
 * Lav en constructor, som tæller naesteKunde op, og som gemmer den aktuelle
 * værdi af naesteKunde i kundenummer-variablen.
 * 
 * Lav flere instanser af Kunde-klassen og kontrollér at de for unikke,
 * fortløbende kundenumre.
 */
public class Kunde {
	public static int naesteKunde = 1;
	private static int kundenummer;

	public Kunde() {
		kundenummer = naesteKunde;
		naesteKunde++;
	}

	public static int getKundenummer() {
		return kundenummer;
	}
}
