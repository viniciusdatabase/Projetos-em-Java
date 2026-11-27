package util;

public class CurrencyConverter {

	public static final double IOF = 0.06;
	
	public static double cotacaoEmDolar;

	public static double valorEmDolares;

	public static double conversaoReaisXDolares() {

		double valorTotal = valorEmDolares * cotacaoEmDolar;
		
		return valorTotal * IOF  + valorTotal ;

	}

}
