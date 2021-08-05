package modul2ObjektorienteretProgrammering;

/**
 * Lav en metode, som beregner gennemsnittet af tallene i et array. Lav to
 * udgaver af metoden. Den ene udgave skal arbejde på heltal (int), den anden
 * udgave skal arbejde på decimaltal (double).
 * 
 * Metoderne skal hedde det samme.
 */
public class Gennemsnit {

	public static double beregnGennemsnit(int[] tal) {
		int sum = 0;

		for (int i : tal) {
			sum += i;
		}

		int gennemsnit = sum / tal.length;

		return gennemsnit;
	}

	public static double beregnGennemsnit(double[] tal) {
		double sum = 0;

		for (double i : tal) {
			sum += i;
		}

		double gennemsnit = sum / tal.length;

		return gennemsnit;
	}

	public static void main(String[] args) {
		int[] intArray = new int[] { 1, 2, 3 };
		double[] doubleArray = new double[] { 1.1, 2.2, 3.3 };

		System.out.println(beregnGennemsnit(intArray));
		System.out.println(beregnGennemsnit(doubleArray));
	}
}
