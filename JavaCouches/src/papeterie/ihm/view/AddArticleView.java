package papeterie.ihm.view;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import papeterie.ihm.controller.ArticleController;

import papeterie.ihm.model.ArticleModel;
import papeterie.ihm.Controller;
import papeterie.ihm.ObserverController;

public class AddArticleView extends JFrame implements ObserverController<ArticleModel> {

	/**
	 * 
	 */

	private Controller<ArticleModel> controller;
	private static final long serialVersionUID = 1L;

	private JLabel lblNewLabel_3;
	private JLabel messageInformations;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JTextField designation;
	private JTextField typeArt;
	private JTextField prixU;
	private JTextField marque;
	private JTextField ref;
	private JTextField grammage;
	private JTextField couleur;
	private JTextField qteStock;
	private boolean canUpdate = true;;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ArticleController controller = new ArticleController();

					AddArticleView frame = new AddArticleView(controller);
					frame.setVisible(true);
					Log log = new Log(controller);
					
					controller.action("START");
					
				
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */

	private void initIHM() {

		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 100, 203, 0 };
		gridBagLayout.rowHeights = new int[] { 70, 70, 70, 70, 70, 70, 70, 70, 70, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		getContentPane().setLayout(gridBagLayout);
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 0;
		getContentPane().add(getLblNewLabel_3(), gbc_lblNewLabel_3);
		GridBagConstraints gbc_designation = new GridBagConstraints();
		gbc_designation.insets = new Insets(0, 0, 5, 0);
		gbc_designation.gridx = 1;
		gbc_designation.gridy = 0;
		getContentPane().add(getDesignation(), gbc_designation);
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 1;
		getContentPane().add(getLblNewLabel_2(), gbc_lblNewLabel_2);
		GridBagConstraints gbc_typeArt = new GridBagConstraints();
		gbc_typeArt.insets = new Insets(0, 0, 5, 0);
		gbc_typeArt.gridx = 1;
		gbc_typeArt.gridy = 1;
		getContentPane().add(getTypeArt(), gbc_typeArt);
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 2;
		getContentPane().add(getLblNewLabel_4(), gbc_lblNewLabel_4);
		GridBagConstraints gbc_prixU = new GridBagConstraints();
		gbc_prixU.insets = new Insets(0, 0, 5, 0);
		gbc_prixU.gridx = 1;
		gbc_prixU.gridy = 2;
		getContentPane().add(getPrixU(), gbc_prixU);
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 3;
		getContentPane().add(getLblNewLabel_5(), gbc_lblNewLabel_5);
		GridBagConstraints gbc_marque = new GridBagConstraints();
		gbc_marque.insets = new Insets(0, 0, 5, 0);
		gbc_marque.gridx = 1;
		gbc_marque.gridy = 3;
		getContentPane().add(getMarque(), gbc_marque);
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 0;
		gbc_lblNewLabel_6.gridy = 4;
		getContentPane().add(getLblNewLabel_6(), gbc_lblNewLabel_6);
		GridBagConstraints gbc_ref = new GridBagConstraints();
		gbc_ref.insets = new Insets(0, 0, 5, 0);
		gbc_ref.gridx = 1;
		gbc_ref.gridy = 4;
		getContentPane().add(getRef(), gbc_ref);
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 0;
		gbc_lblNewLabel_7.gridy = 5;
		getContentPane().add(getLblNewLabel_7(), gbc_lblNewLabel_7);
		GridBagConstraints gbc_grammage = new GridBagConstraints();
		gbc_grammage.insets = new Insets(0, 0, 5, 0);
		gbc_grammage.gridx = 1;
		gbc_grammage.gridy = 5;
		getContentPane().add(getGrammage(), gbc_grammage);
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.gridx = 0;
		gbc_lblNewLabel_8.gridy = 6;
		getContentPane().add(getLblNewLabel_8(), gbc_lblNewLabel_8);
		GridBagConstraints gbc_couleur = new GridBagConstraints();
		gbc_couleur.insets = new Insets(0, 0, 5, 0);
		gbc_couleur.gridx = 1;
		gbc_couleur.gridy = 6;
		getContentPane().add(getCouleur(), gbc_couleur);
		GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
		gbc_lblNewLabel_9.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_9.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_9.gridx = 0;
		gbc_lblNewLabel_9.gridy = 7;
		getContentPane().add(getLblNewLabel_9(), gbc_lblNewLabel_9);
		GridBagConstraints gbc_qteStock = new GridBagConstraints();
		gbc_qteStock.insets = new Insets(0, 0, 5, 0);
		gbc_qteStock.gridx = 1;
		gbc_qteStock.gridy = 7;
		getContentPane().add(getQteStock(), gbc_qteStock);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.anchor = GridBagConstraints.EAST;
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 8;
		getContentPane().add(getBtnNewButton(), gbc_btnNewButton);
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.gridx = 1;
		gbc_btnNewButton_1.gridy = 8;
		getContentPane().add(getBtnNewButton_1(), gbc_btnNewButton_1);
		
		GridBagConstraints gbc_Message = new GridBagConstraints();
		gbc_Message.gridx = 0;
		gbc_Message.gridwidth=2;
		gbc_Message.gridy = 9;
		getContentPane().add(getMessageInformations(), gbc_Message);
	}

	public AddArticleView(Controller<ArticleModel> controller) {
		this.controller = controller;
		this.controller.addObserver(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 351, 700);
		initIHM();

	}

	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("D\u00E9signation");
			lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblNewLabel_3;
	}

	
	private JLabel getMessageInformations() {
		if (messageInformations == null) {
			messageInformations = new JLabel("");
			messageInformations.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return messageInformations;
	}
	
	
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Type article");
		}
		return lblNewLabel_2;
	}

	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("Prix unitaire");
		}
		return lblNewLabel_4;
	}

	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("Marque");
		}
		return lblNewLabel_5;
	}

	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Vider");
		}
		return btnNewButton;
	}

	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Ajouter article");
		}
		
		btnNewButton_1.addActionListener(e -> controller.action("ADD_ARTICLE"));
		return btnNewButton_1;
	}

	private JLabel getLblNewLabel_6() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel("R\u00E9f\u00E9rence");
		}
		return lblNewLabel_6;
	}

	private JLabel getLblNewLabel_7() {
		if (lblNewLabel_7 == null) {
			lblNewLabel_7 = new JLabel("Grammage");
		}
		return lblNewLabel_7;
	}

	private JLabel getLblNewLabel_8() {
		if (lblNewLabel_8 == null) {
			lblNewLabel_8 = new JLabel("Couleur");
		}
		return lblNewLabel_8;
	}

	private JLabel getLblNewLabel_9() {
		if (lblNewLabel_9 == null) {
			lblNewLabel_9 = new JLabel("Quantit\u00E9 stock");
		}
		return lblNewLabel_9;
	}

	private JTextField getDesignation() {
		if (designation == null) {
			designation = new JTextField(ArticleController.getInstance().getMyModel().getDesignation());
			designation.setColumns(20);
		}

		designation.getDocument().addDocumentListener(new DocumentListener() {
			public void changedUpdate(DocumentEvent e) {
				warn();
			}

			public void removeUpdate(DocumentEvent e) {
				warn();
			}

			public void insertUpdate(DocumentEvent e) {
				warn();
			}

			public void warn() {

				//ArticleController.getInstance().getMyModel().setDesignation(designation.getText());
				//getMarque().setText(designation.getText());
				if (canUpdate) {
					// update();
				}

			}
		});
		return designation;
	}

	private JTextField getTypeArt() {
		if (typeArt == null) {
			typeArt = new JTextField(ArticleController.getInstance().getMyModel().getTypeArt());
			typeArt.setColumns(20);
		}

		typeArt.getDocument().addDocumentListener(new DocumentListener() {
			public void changedUpdate(DocumentEvent e) {
				warn();
			}

			public void removeUpdate(DocumentEvent e) {
				warn();
			}

			public void insertUpdate(DocumentEvent e) {
				warn();
			}

			public void warn() {

//				ArticleController.getInstance().getMyModel().setTypeArt(typeArt.getText());
//				if (canUpdate) {
//					// update();
//
//				}
			}
		});
		return typeArt;
	}

	private JTextField getPrixU() {
		if (prixU == null) {
			prixU = new JTextField(String.valueOf(ArticleController.getInstance().getMyModel().getPrixU()));
			prixU.setColumns(20);
		}

		prixU.getDocument().addDocumentListener(new DocumentListener() {
			public void changedUpdate(DocumentEvent e) {
				warn();
			}

			public void removeUpdate(DocumentEvent e) {
				warn();
			}

			public void insertUpdate(DocumentEvent e) {
				warn();
			}

			public void warn() {

//				ArticleController.getInstance().getMyModel().setPrixU(Float.parseFloat(prixU.getText()));
//				if (canUpdate) {
//					// update();
//
//				}
			}
		});
		return prixU;
	}

	private JTextField getMarque() {
		if (marque == null) {
			marque = new JTextField(ArticleController.getInstance().getMyModel().getMarque());
			marque.setColumns(20);
		}

		marque.getDocument().addDocumentListener(new DocumentListener() {
			public void changedUpdate(DocumentEvent e) {
				warn();
			}

			public void removeUpdate(DocumentEvent e) {
				warn();
			}

			public void insertUpdate(DocumentEvent e) {
				warn();
			}

			public void warn() {

//				ArticleController.getInstance().getMyModel().setMarque(marque.getText());
//				if (canUpdate) {
//					/// update();
//
//				}
			}
		});
		return marque;
	}

	private JTextField getRef() {
		if (ref == null) {
			ref = new JTextField(ArticleController.getInstance().getMyModel().getRef());
			ref.setColumns(20);
		}

		ref.getDocument().addDocumentListener(new DocumentListener() {
			public void changedUpdate(DocumentEvent e) {
				warn();
			}

			public void removeUpdate(DocumentEvent e) {
				warn();
			}

			public void insertUpdate(DocumentEvent e) {
				warn();
			}

			public void warn() {

//				ArticleController.getInstance().getMyModel().setTypeArt(ref.getText());
//				if (canUpdate) {
//					// update();
//
//				}
			}
		});
		return ref;
	}

	private JTextField getGrammage() {
		if (grammage == null) {
			grammage = new JTextField(String.valueOf(ArticleController.getInstance().getMyModel().getGrammage()));
			grammage.setColumns(20);
		}

		grammage.getDocument().addDocumentListener(new DocumentListener() {
			public void changedUpdate(DocumentEvent e) {
				warn();
			}

			public void removeUpdate(DocumentEvent e) {
				warn();
			}

			public void insertUpdate(DocumentEvent e) {
				warn();
			}

			public void warn() {

//				if (canUpdate) {
//					ArticleController.getInstance().getMyModel().setGrammage(Integer.parseInt(grammage.getText()));
//
//					// update();
//				}

			}
		});
		return grammage;
	}

	private JTextField getCouleur() {
		if (couleur == null) {
			couleur = new JTextField(ArticleController.getInstance().getMyModel().getCouleur());
			couleur.setColumns(20);
		}

		couleur.getDocument().addDocumentListener(new DocumentListener() {
			public void changedUpdate(DocumentEvent e) {
				warn();
			}

			public void removeUpdate(DocumentEvent e) {
				warn();
			}

			public void insertUpdate(DocumentEvent e) {
				warn();
			}

			public void warn() {

//				if (canUpdate) {
//					ArticleController.getInstance().getMyModel().setTypeArt(couleur.getText());
//
//					// update();
//				}

			}
		});

		return couleur;
	}

	private JTextField getQteStock() {
		if (qteStock == null) {
			System.out.println("1 - " + ArticleController.getInstance().getMyModel().getQteStock());
			System.out.println("2 - " + String.valueOf(ArticleController.getInstance().getMyModel().getQteStock()));
			qteStock = new JTextField(String.valueOf(ArticleController.getInstance().getMyModel().getQteStock()));
			qteStock.setColumns(20);
		}

		qteStock.getDocument().addDocumentListener(new DocumentListener() {
			public void changedUpdate(DocumentEvent e) {
				warn();
			}

			public void removeUpdate(DocumentEvent e) {
				warn();
			}

			public void insertUpdate(DocumentEvent e) {
				warn();
			}

			public void warn() {

//				System.out.println(qteStock.getText());
//				if (canUpdate) {
//					ArticleController.getInstance().getMyModel()
//							.setQteStock((int) (Integer.parseInt(qteStock.getText())));
//
//					// update();
//				}

			}
		});
		return qteStock;
	}

	@Override
	public void fromModel(ArticleModel model) {
		getQteStock().setText(String.valueOf(model.getQteStock()));
		getCouleur().setText(model.getCouleur());
		getGrammage().setText(String.valueOf( model.getGrammage()));
		getRef().setText(model.getRef());
		getMarque().setText(model.getMarque());
		getPrixU().setText( String.valueOf( model.getPrixU()));
		getTypeArt().setText(model.getDesignation());
		getDesignation().setText(model.getDesignation());
		getMessageInformations().setText(model.getMessage());
		
		
		

	}

	@Override
	public ArticleModel populateModel(ArticleModel model) {
		model.setCouleur(getCouleur().getText());
		model.setDesignation(getDesignation().getText());
		model.setGrammage(Integer.parseInt(getGrammage().getText()));
		model.setMarque(getMarque().getText());
		model.setPrixU(Float.parseFloat(getPrixU().getText()));
		model.setQteStock(Integer.parseInt(getQteStock().getText()));
		model.setRef(getRef().getText());
		model.setTypeArt(getTypeArt().getText());
		model.setMessage(getMessageInformations().getText());
		
		return model;
	}

//	private void update() {
//		canUpdate =false;
//	
//		System.out.println("3 - " + ArticleController.getInstance().getMyModel().getQteStock());
//		String qteStock = String.valueOf( ArticleController.getInstance().getMyModel().getQteStock());
//		getQteStock().setText(qteStock);
//		getCouleur().setText(ArticleController.getInstance().getMyModel().getCouleur());
//		getGrammage().setText(String.valueOf(ArticleController.getInstance().getMyModel().getGrammage()));
//		getRef().setText(ArticleController.getInstance().getMyModel().getRef());
//		getMarque().setText(ArticleController.getInstance().getMyModel().getMarque());
//		getPrixU().setText(String.valueOf(ArticleController.getInstance().getMyModel().getPrixU()));
//		getTypeArt().setText(ArticleController.getInstance().getMyModel().getDesignation());
//		//getDesignation().setText(ArticleController.getInstance().getMyModel().getDesignation());
//		canUpdate = true;
//		}

}
