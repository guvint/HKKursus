package modul1GrundlæggendeJava;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.Calendar;

/**
 * Opgave 1.4.5 Er det fredag? Du kan få at vide, hvilken ugedag det er på denne
 * måde:
 * 
 * Calendar calendar = Calendar.getInstance(); int day =
 * calendar.get(Calendar.DAY_OF_WEEK); Alle ugedagene har navne i Java, så hvis
 * værdien i variablen day er lig med Calendar.FRIDAY er det fredag.
 * 
 * Lav et program, som siger, om det er fredag.
 */
public class ErDetFredag extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ErDetFredag frame = new ErDetFredag();
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
	public ErDetFredag() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 0, 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		JLabel lblTekst = new JLabel("Er det fredag?     ");
		GridBagConstraints gbc_lblTekst = new GridBagConstraints();
		gbc_lblTekst.insets = new Insets(0, 0, 0, 5);
		gbc_lblTekst.gridx = 0;
		gbc_lblTekst.gridy = 0;
		contentPane.add(lblTekst, gbc_lblTekst);

		JLabel lblSvar = new JLabel("");
		GridBagConstraints gbc_lblSvar = new GridBagConstraints();
		gbc_lblSvar.gridx = 1;
		gbc_lblSvar.gridy = 0;
		contentPane.add(lblSvar, gbc_lblSvar);

		Calendar calendar = Calendar.getInstance();
		int day = calendar.get(Calendar.DAY_OF_WEEK);

		if (calendar.FRIDAY == day) {
			lblSvar.setText("JA!");
		} else {
			lblSvar.setText("Nej :(");
		}
	}

}
