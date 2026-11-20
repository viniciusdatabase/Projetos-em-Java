/* Exercício de Fixação
 * 
 * Em um novo programa, inicie as seguintes variáveis
 * 
 * String product1 = "Computer";
 * String product2 = "Office desk";
 * 
 * int age = 30;
 * int code = 5290;
 * char gender = 'F';
 * 
 * double price1 = 2100.0
 * double price2 = 650.50;
 * double measure = 53.234567;
 * 
 * Em seguida, usando os valores das variáveis, produza a seguinte saída
 * na tela do console
 * 
 * Products:
 * Computer, which price is $ 2100,00
 * Office desk, which price is $ 650,50
 * 
 * Record: 30 years old, code 5290 and gender: F
 * 
 * Measue with eight decimal places 53,234556700
 * Rouded (three decimal places): 53,235
 * US decimal point: 53.235
 * 
 * Sim, eu quis fazer uma única linha grandona apenas para treinar :)
 * */

import java.util.Locale;

public class exercício_valores {
	
	public static void main(String[] args) {		
		
	//*** variáveis ***//
	
	String product1 = "Computer";
	String product2 = "Office desk";
	
	int age = 30;
	int code = 5290;
	char gender = 'F';
	
	double price1 = 2100.0;
	double price2 = 650.50;
	double measure = 53.234567;
	//*** fim das variáveis ***//

	//*** começo do código ***//

	System.out.printf("Products: \n %s , which price is $ %.2f \n %s , which price is $ %.2f \n\nRecord: %d years old, code %d and gender: %c \n\n Measure with eight decimal places: %.8f \n Rouded (three decimal places): %.3f \n US decimal point: ", product1, price1, product2, price2, age, code, gender, measure, measure );
	Locale.setDefault(Locale.US);
	System.out.printf("%.3f", measure);
	
	}
	

}
