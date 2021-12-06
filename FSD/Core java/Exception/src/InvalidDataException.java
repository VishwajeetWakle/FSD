import javax.swing.JOptionPane;

public class InvalidDataException extends Exception{
	public void displayError(String errorMsg) {
		JOptionPane.showInternalMessageDialog(null, errorMsg, "Invalid Data", JOptionPane.ERROR_MESSAGE);
	}
}
