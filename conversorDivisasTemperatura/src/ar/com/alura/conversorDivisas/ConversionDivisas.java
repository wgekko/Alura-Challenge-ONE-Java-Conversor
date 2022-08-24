package ar.com.alura.conversorDivisas;

import javax.swing.JOptionPane;

import ar.com.alura.conversor.Conversion;

public class ConversionDivisas extends Conversion {
		
	private String tipoConversion;
		
		public String selectTipoConversion() {
			this.tipoConversion = (JOptionPane.showInputDialog(null,"Selecciona la divisa que desea convertir su dinero","Divisas", 
					  JOptionPane.PLAIN_MESSAGE, null, new Object[] {
							  "De Pesos a Dólar",
							  "De Pesos a Euros",
							  "De Pesos a Libras Esterlinas",
							  "De Pesos a Yen Japonés",
							  "De Pesos a Won Surcoreano",
							  "De Dólar a Pesos",
							  "De Euros a Pesos",
							  "De Libras Esterlinas a Pesos",
							  "De Yen Japonés a Pesos",
							  "De Won Surcoreano a Pesos",
					  },"De Pesos a Dólar")).toString();
			return tipoConversion;
		}
		
		public double calculoConversion(String tipoConversion, double cantidad) {
			
			switch (tipoConversion) {
			case "De Pesos a Dólar":
				cantidad = cantidad / 300;
				
				break;
				
			case "De Pesos a Euros":
				cantidad = cantidad / 320;
				
				break;
				
			case "De Pesos a Libras Esterlinas":
				cantidad = cantidad / 357;
				
				break;
				
			case "De Pesos a Yen Japonés":
				cantidad = cantidad / 1.08;
				
				break;
				
			case "De Pesos a Won Surcoreano":
				cantidad = cantidad / 0.10;
				
				break;
				
			case "De Dólar a Pesos":
				cantidad = cantidad * 300;
				
				break;
				
			case "De Euros a Pesos":
				cantidad = cantidad * 320;
				
				break;
				
			case "De Libras Esterlinas a Pesos":
				cantidad = cantidad * 357;
				
				break;
				
			case "De Yen Japonés a Pesos":
				cantidad = cantidad * 1.08;
				
				break;
				
			case "De Won Surcoreano a Pesos":
				cantidad = cantidad * 0.10;
				
				break;
				

			default:
				break;
			}
			return cantidad;
			
		}

}
