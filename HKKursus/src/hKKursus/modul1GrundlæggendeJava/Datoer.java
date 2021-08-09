package hKKursus.modul1GrundlæggendeJava;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridLayout;

/**
 * I denne opgave skal du lave et array med to dimensioner. Arrayet skal
 * indeholder navnene på månederne og antallet af dage i månederne.
 * 
 * Når du starter programmet, skal det skrive hver måned efterfulgt af antal
 * dage. Vi tager ikke højde for skudår.
 * 
 * Januar 31
 * 
 * Februar 28
 * 
 * I programmet skal du bruge følgende:
 * 
 * Et og kun ét array (men det skal have to dimensioner, så det defineres
 * således String[][]) Mindst en for-løkke
 */
public class Datoer extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Datoer frame = new Datoer();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Datoer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(12, 2));

		String[][] maaneder = {
				{ "Januar", "Februar", "Marts", "April", "Maj", "Juni", "Juli", "August", "September", "Oktober",
						"November", "December" },
				{ "31", "28", "31", "30", "31", "30", "31", "31", "30", "31", "30", "31" } };

		// Column-Major Order
		for (int i = 0; i < maaneder[0].length; i++) {
			for (int j = 0; j < maaneder.length; j++) {
				contentPane.add(new JLabel(maaneder[j][i]));
			}
		}
	}
}
