import javax.swing.SwingUtilities;

import controller.controladora;
import view.MainView;

public class Principal {

	public static void main(String[] args) {
		try {
			SwingUtilities.invokeLater(() -> {
				MainView mv = new MainView();
				controladora c1 = new controladora(mv);
				c1.iniciar();
	        });
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
