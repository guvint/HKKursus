package hKKursus.modul1GrundlæggendeJava;

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
import java.awt.event.ActionEvent;

/**
 * Lidt mere om datoer.
 * 
 * I denne opgave skal brugeren kunne skrive nummeret på en måde (1 = Januar, 2
 * = Februar, osv) og så skal programmet skrive navnet på måneden.
 * 
 * Gør dette:
 * 
 * Lav en brugergrænseflade som opgave 1.4.1 (label, tekstfelt, knap) Lav et
 * array som indholder navnene på månederne. Tænk over: Hvilken type skal
 * array'et have? Hvilken nummer i array'et har januar? Når brugeren trykker på
 * knappen, skal programmet skrive månedens navn.
 */
public class Maaned extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Maaned frame = new Maaned();
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
	public Maaned() {
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

		JLabel lblNewLabel = new JLabel("Indtast måned i tal");
		JLabel lblResultat = new JLabel("Her kommer måneden");
		textField = new JTextField();
		JButton btnNewButton = new JButton("OK");

		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);

		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);

		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 1;
		contentPane.add(btnNewButton, gbc_btnNewButton);

		GridBagConstraints gbc_lblResultat = new GridBagConstraints();
		gbc_lblResultat.gridx = 1;
		gbc_lblResultat.gridy = 2;
		contentPane.add(lblResultat, gbc_lblResultat);

		String[] maaneder = new String[] { "", "Januar", "Februar", "Marts", "April", "Maj", "Juni", "Juli", "August",
				"September", "Oktober", "November", "December" };

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String resultat = "";
				int i = Integer.parseInt(textField.getText());

				resultat += maaneder[i];

				lblResultat.setText(resultat);
			}
		});
	}

}
