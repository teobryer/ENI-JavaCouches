package monPremierSwing.ihm;

import javax.swing.SwingUtilities;

public class Exec {

	public static void main(String[] args) {
		// Executer l'écran principal dans un thread specifique
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				EcranDemo ecran = new EcranDemo();		
				ecran.setVisible(true);
			}
		});
		
		
	}

}
