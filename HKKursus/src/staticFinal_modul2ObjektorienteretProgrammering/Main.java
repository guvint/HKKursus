package staticFinal_modul2ObjektorienteretProgrammering;

public class Main {
	public static void main(String[] args) {
		

		for (int i = 0; i < 10; i++) {
			new Kunde();
			
			System.out.println("Kundenummer: " + Kunde.getKundenummer());
		}
	}
}
