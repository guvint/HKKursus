package overriding_modul2ObjektorienteretProgrammering;

/**
 * Lav tre klasser: Dyr, Hund og Kat. Dyr er superklasse for de to øvrige.
 * 
 * Alle tre klasser skal have metoden sigNoget. Den metode skal skrive hvad
 * dyret siger i konsollen.
 * 
 * Lav et array af typen Dyr[] og læg instanser af Hund og Kat i det. Løb
 * array'et igennem og få alle dyrene til at sige deres lyd.
 */
public class Main {

	public static void main(String[] args) {
		Dyr[] mineDyr = new Dyr[] { new Hund(), new Kat() };

		for (Dyr dyr : mineDyr) {
			System.out.println(dyr.sigNoget());
		}
	}
}
