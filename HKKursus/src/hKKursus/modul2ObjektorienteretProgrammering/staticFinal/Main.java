package hKKursus.modul2ObjektorienteretProgrammering.staticFinal;

public class Main {
	public static void main(String[] args) {
		

		for (int i = 0; i < 10; i++) {
			new Kunde();
			
			System.out.println("Kundenummer: " + Kunde.getKundenummer());
		}
	}
}
