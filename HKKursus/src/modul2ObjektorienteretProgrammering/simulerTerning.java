package modul2ObjektorienteretProgrammering;

import java.util.Random;

/**
 * Opgave 2.1.1 Lav en metode, som kan simulere et terningekast. Metoden skal
 * altså returnere et tilfældigt tal fra 1 til 6.
 * 
 * Kald metoden 6 gange fra din main-metode (ligesom en slag i yatzy).
 * 
 * Opgave 2.1.2 Rollespillere bruger ofte terninger med flere sider end 6. Udvid
 * metoden fra før, så du som parameter kan angive, hvor mange sider terningen
 * skal have. Det vil sige, hvad det højeste tal der kan slås er.
 * 
 * Opgave 2.1.3 I stedet for at kaste med en enkelt terning, skal metoden nu
 * kaste flere terninger og returnere det samlede antal øjne på kastet.
 * 
 * Udvid metoden så den har to parametre: antal terninger og antal sider på
 * terningen. Antag, at alle terninger i kastet har lige mange sider.
 */
public class simulerTerning {

	public static int terning(int sider, int terninger) {
		Random r = new Random();
		int kast = r.nextInt(sider) + 1;
		return kast * terninger;
	}

	public static void main(String[] args) {
		int terningeSider = 8;
		int antalTerninger = 2;
		System.out.print("Dine terningekast er: ");

		for (int i = 0; i < 6; i++) {
			System.out.print((terning(terningeSider, antalTerninger)) + " ");
		}
	}
}
