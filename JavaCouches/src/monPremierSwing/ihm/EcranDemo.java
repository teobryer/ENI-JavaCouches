package monPremierSwing.ihm;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EcranDemo extends JFrame {

	public EcranDemo() {
		this.setTitle("Calculatrice");
		this.setSize(new Dimension(500, 200));
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		initIHM();
	}

	private void initIHM() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();

		JTextField textField1 = new JTextField();
		JTextField textField2 = new JTextField();
		/*
		 * textField1.setPreferredSize(new Dimension(50, 20));
		 * textField2.setPreferredSize(new Dimension(50, 20));
		 */
//		textField1.set(new Insets(0, -0, 0, 0));
//		textField2.setMargin(new Insets(0, 0, 0, 0));

		gbc.gridy = 0;
		gbc.gridx = 0;
		gbc.fill = GridBagConstraints.HORIZONTAL;

		panel.add(textField1, gbc);

		gbc.gridy = 0;
		gbc.gridx = 1;

		panel.add(textField2, gbc);

		gbc.gridy = 1;
		gbc.gridx = 0;
		panel.add(new JButton("+"), gbc);

		gbc.gridy = 1;
		gbc.gridx = 1;
		panel.add(new JButton("-"), gbc);

		gbc.gridy = 2;
		gbc.gridx = 0;
		panel.add(new JButton("*"), gbc);

		gbc.gridy = 2;
		gbc.gridx = 1;
		panel.add(new JButton("/"), gbc);

		this.setContentPane(panel);
	}
}
