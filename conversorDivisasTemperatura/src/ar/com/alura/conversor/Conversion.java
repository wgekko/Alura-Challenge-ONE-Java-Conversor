package ar.com.alura.conversor;

/**
 * 
 * @version 1.0
 * 
 * @author petrahernandez
 */
import javax.swing.JOptionPane;

public abstract class Conversion {

	private String option;
	protected String tipoConversion;
	private double valor;
	private boolean bool = true;
	
	
	public String getOption() {
		return option;
	}
	
	public void setOption(String option) {
		this.option = option;
	}
		
	
	public double cantidad(String input) {
		while(bool) {
			
			if(input.isEmpty()) {
				JOptionPane.showMessageDialog(null, "No introdujiste ningun valor");
			} else {
				bool = false;
			}
		}
		this.valor = Double.parseDouble(input);
		return this.valor;

	}
	
	
	public abstract String selectTipoConversion();
	
	public abstract double calculoConversion(String tipoConversion, double cantidad);

}
