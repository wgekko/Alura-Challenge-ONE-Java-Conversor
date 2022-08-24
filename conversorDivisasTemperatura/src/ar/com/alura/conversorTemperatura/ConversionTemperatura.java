package ar.com.alura.conversorTemperatura;

import javax.swing.JOptionPane;

import ar.com.alura.conversor.Conversion;

public class ConversionTemperatura extends Conversion {

	public String selectTipoConversion() {
		this.tipoConversion = (JOptionPane.showInputDialog(null,"Selecciona la opción que desea convertir la temperatura","Temperatura", 
				  JOptionPane.PLAIN_MESSAGE, null, new Object[] {
						  "De Celcius a Fahrenheit",
						  "De Celcius a Kelvin",
						  "De Fahrenheit a Celcius",
						  "De Fahrenheit a Kelvin",
						  "De Kelvin a Celcius",
						  "De Kelvin a Fahrenheit",
				  },"De Celcius a Fahrenheit")).toString();
		return tipoConversion;
	}
	
public double calculoConversion(String tipoConversion, double cantidad) {
		
		switch (tipoConversion) {
		case "De Celcius a Fahrenheit":
			cantidad =  (cantidad * 9/5) + 32 ;
			
			break;
			
		case "De Celcius a Kelvin":
			cantidad = cantidad + 273.15 ;
			
			break;
			
		case "De Fahrenheit a Celcius":
			cantidad = (cantidad - 32) * 5/9;
			
			break;
			
		case "De Fahrenheit a Kelvin":
			cantidad = (cantidad - 32) * 5/9 + 273.15;
			
			break;
			
		case "De Kelvin a Celcius":
			cantidad = cantidad - 273.15;
			
			break;
			
		case "De Kelvin a Fahrenheit":
			cantidad = (cantidad - 273.15) * 9/5 + 32;
			
			break;

		default:
			break;
		}
		return cantidad;
		
	}

}
