package ar.com.alura.main;

import javax.swing.JOptionPane;

import ar.com.alura.conversor.Conversion;
import ar.com.alura.conversorDivisas.ConversionDivisas;
import ar.com.alura.conversorTemperatura.ConversionTemperatura;

public class Main {

		public static void main(String[] args) {
		
		Conversion divisas = new ConversionDivisas();
		Conversion temperatura = new ConversionTemperatura();
		
		ejecutarFuncion(divisas, temperatura);			
	}
	
	public static void ejecutarFuncion(Conversion divisas, Conversion temperatura) {
		
		String userInput = (JOptionPane.showInputDialog(null,"Selecciona una opción de conversión", "Menu", 
				  JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Conversor de divisas", "Conversor de temperatura"},"Conversor de divisas")).toString();
		
		if(userInput == "Conversor de divisas") {
			
			String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: ");
			String tipoConv = divisas.selectTipoConversion();
			double total = divisas.calculoConversion(tipoConv, divisas.cantidad(input));
			
			String[] text = tipoConv.split("\\s+");
			String msg = text[text.length - 1];
			
			JOptionPane.showMessageDialog(null, "Tienes $ " + Math.round(total * 100) / 100d + " " + msg);
			
		} else if(userInput == "Conversor de temperatura") {  
			String input = JOptionPane.showInputDialog("Ingresa el valor de la temperatura que deseas convertir");
			String tipoConv = temperatura.selectTipoConversion();
			double total = temperatura.calculoConversion(tipoConv, temperatura.cantidad(input));
			
			String[] text = tipoConv.split("\\s+");
			String msg = text[text.length - 1];
			
			JOptionPane.showMessageDialog(null, "Tienes " + Math.round(total) + " grados " + msg);
		}
		int continuar = JOptionPane.showConfirmDialog(null, "¿Deseas continuar?","Seleccione", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
		if(continuar == 0) {
			ejecutarFuncion( divisas, temperatura);
		} else {
			JOptionPane.showMessageDialog(null, "Programa Terminado");
		}
	}
}

