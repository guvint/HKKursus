package modul1GrundlæggendeJava;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

/**
 * Opgave 1.4.1 Du skal lave et program, som er verdens kedeligste gætteleg.
 * 
 * Computeren tænker på et tal, og brugeren skal gætte, hvad tallet er.
 * 
 * Det lyder måske ikke så kedeligt, men computeren tænker altid på tallet 42.
 * 
 * (Opgaven minder meget om "Har du en heldig fødselsdato")
 * 
 * Gør følgende:
 * 
 * Lav en JFrame Tilføj en JLabel Tilføj et JTextField. På labelen skal stå,
 * hvad brugeren skal gøre (gætte på et tal). Tekstfeltet er der for brugeren
 * indtaster tallet Tilføj også en JButton, som brugeren skal trykke på, når han
 * har gættet Når brugeren trykker på knappen, skal computeren fortælle, om
 * brugerne gættede rigtigt. Brug en if til dette.
 * 
 * Opgave 1.4.2 Udvid programmet: Hvis brugeren gætter forkert, skal computeren
 * også skrive det. (brug en else)
 * 
 * Opgave 1.4.3 Udvid programet: Hvis brugeren gætter forkert, skal computeren
 * skrive, om det var for højt eller for lavt (if - else if - else)
 * 
 * Opgave 1.4.4 Nu skal gætteleget blive sjovere! Computeren skal tænke på et
 * tilfældigt tal.
 * 
 * Du laver et tilfældigt tal således:
 * 
 * int tal = new Random().nextInt(10); Tallet 10 fortæller angiver den øvre
 * grænse for det tilfældige tal (ekskl.)
 */
public class Gaetteleg extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gaetteleg frame = new Gaetteleg();
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
	public Gaetteleg() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 0, 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 0, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		int graense = 100;
		int tal = new Random().nextInt(graense);
		
		JLabel lblGaet = new JLabel("Gæt tallet (maks " + graense + "):");
		JLabel lblResultat = new JLabel("");
		textField = new JTextField();
		JButton btnOK = new JButton("OK");

		GridBagConstraints gbc_lblGaet = new GridBagConstraints();
		gbc_lblGaet.insets = new Insets(0, 0, 5, 5);
		gbc_lblGaet.anchor = GridBagConstraints.EAST;
		gbc_lblGaet.gridx = 0;
		gbc_lblGaet.gridy = 0;
		contentPane.add(lblGaet, gbc_lblGaet);

		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);

		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int gaet = Integer.parseInt(textField.getText());

				if (tal == gaet) {
					lblResultat.setText("Du har gættet rigtigt!");
				} else if (gaet < tal) {
					lblResultat.setText("Dit gæt var lavere. Prøv igen.");
				} else {
					lblResultat.setText("Dit gæt var højere. Prøv igen.");
				}
			}
		});
		GridBagConstraints gbc_btnOK = new GridBagConstraints();
		gbc_btnOK.insets = new Insets(0, 0, 5, 0);
		gbc_btnOK.gridx = 1;
		gbc_btnOK.gridy = 1;
		contentPane.add(btnOK, gbc_btnOK);

		GridBagConstraints gbc_lblResultat = new GridBagConstraints();
		gbc_lblResultat.gridx = 1;
		gbc_lblResultat.gridy = 2;
		contentPane.add(lblResultat, gbc_lblResultat);
	}

}
