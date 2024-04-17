import javax.swing.SwingUtilities;

import view.MainView;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			SwingUtilities.invokeLater(() -> {
	            new MainView().setVisible(true);
	        });
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
