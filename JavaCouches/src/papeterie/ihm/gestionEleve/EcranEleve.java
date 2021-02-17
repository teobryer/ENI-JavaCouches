package papeterie.ihm.gestionEleve;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import fr.formation.gestionEleves.bll.EleveManager;
import fr.formation.gestionEleves.bll.EleveManagerFact;
import fr.formation.gestionEleves.bo.Eleve;
import fr.formation.gestionEleves.ihm.Controller;
import fr.formation.gestionEleves.ihm.ObserverController;

public class EcranEleve extends JFrame implements ObserverController<EleveModel>{

	private Controller<EleveModel> controller;
	

	private JLabel lbNom = new JLabel("nom :");
	private JLabel lbPrenom = new JLabel("prenom :");
	private JLabel lbNote = new JLabel("note :");
	private JLabel lbClasse = new JLabel("classe :");

	private JTextField txNom;
	private JTextField txPrenom;
	private JTextField txNote;
	private JTextField txClasse;
	private JButton btValider;
	private JLabel lbErreurs;
	private JLabel lbMoyenne;

	@Override
	public void fromModel(EleveModel model) {
		getTxNom().setText(model.getCurrent().getNom());
		getTxPrenom().setText(model.getCurrent().getPrenom());
		getTxNote().setText(model.getCurrent().getNote().toString());
		getTxClasse().setText(model.getCurrent().getClasse());
		getLbErreurs().setText(model.getMessage());
		getLbMoyenne().setText(model.getMoyenne().toString());
	}

	@Override
	public EleveModel populateModel(EleveModel model) {
		try {
			Eleve eleve = new Eleve();
			eleve.setNom(getTxNom().getText());
			eleve.setPrenom(getTxPrenom().getText());
			eleve.setNote(Integer.parseInt(getTxNote().getText()));
			eleve.setClasse(getTxClasse().getText());
			model.setCurrent(eleve);
			model.setMessage("Insertion réussie!");
		} catch (NumberFormatException e) {
			model.setMessage("La note doit être un entier");
		}
		return model;
	}

	public EcranEleve(Controller<EleveModel> controller) {
		this.controller = controller;
		this.controller.addObserver(this);
		this.setTitle("Gestion d'éleves");
		this.setSize(new Dimension(500, 300));
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		initIHM();
	}

	private void initIHM() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();

		gbc.gridy = 0;
		gbc.gridx = 0;
		panel.add(lbNom, gbc);

		gbc.gridy = 0;
		gbc.gridx = 1;
		panel.add(getTxNom(), gbc);

		gbc.gridy = 1;
		gbc.gridx = 0;
		panel.add(lbPrenom, gbc);

		gbc.gridy = 1;
		gbc.gridx = 1;
		panel.add(getTxPrenom(), gbc);

		gbc.gridy = 2;
		gbc.gridx = 0;
		panel.add(lbNote, gbc);

		gbc.gridy = 2;
		gbc.gridx = 1;
		panel.add(getTxNote(), gbc);

		gbc.gridy = 3;
		gbc.gridx = 0;
		panel.add(lbClasse, gbc);

		gbc.gridy = 3;
		gbc.gridx = 1;
		panel.add(getTxClasse(), gbc);

		gbc.gridy = 4;
		gbc.gridx = 0;
		panel.add(getBtValider(), gbc);

		gbc.gridy = 4;
		gbc.gridx = 1;
		panel.add(getLbMoyenne(), gbc);

		gbc.gridy = 5;
		gbc.gridx = 0;
		panel.add(getLbErreurs(), gbc);

		this.setContentPane(panel);
	}

	private JButton getBtValider() {
		if (btValider == null) {
			btValider = new JButton("valider...");
			btValider.addActionListener(e -> controller.action("ADD_ELEVE"));
		}
		return btValider;
	}

	private JTextField getTxNom() {
		if (txNom == null) {
			txNom = new JTextField(20);
		}
		return txNom;
	}

	private JTextField getTxPrenom() {
		if (txPrenom == null) {
			txPrenom = new JTextField(20);
		}
		return txPrenom;
	}

	private JTextField getTxNote() {
		if (txNote == null) {
			txNote = new JTextField(20);
		}
		return txNote;
	}

	private JTextField getTxClasse() {
		if (txClasse == null) {
			txClasse = new JTextField(20);
		}
		return txClasse;
	}

	private JLabel getLbErreurs() {
		if (lbErreurs == null) {
			lbErreurs = new JLabel();
			lbErreurs.setForeground(Color.RED);
		}
		return lbErreurs;
	}

	private JLabel getLbMoyenne() {
		if (lbMoyenne == null) {
			lbMoyenne = new JLabel();
		}
		return lbMoyenne;
	}

}
