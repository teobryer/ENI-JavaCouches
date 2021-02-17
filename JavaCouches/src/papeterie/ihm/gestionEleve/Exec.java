package papeterie.ihm.gestionEleve;

import javax.swing.SwingUtilities;

public class Exec {

	public static void main(String[] args) {
		// Executer l'écran principal dans un thread specifique
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() { 
				
				EleveController controller = new EleveController();
			
				EcranEleve ecran = new EcranEleve(controller);		
				Log log = new Log(controller);
				
				controller.action("START");
				
				ecran.setVisible(true);
			}
		});
		
		
	}

}
