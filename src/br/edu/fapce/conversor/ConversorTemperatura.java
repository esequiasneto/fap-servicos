package br.edu.fapce.conversor;

public class ConversorTemperatura {
	
	public static double converterParaFahrenheit(Double celsius) {
	    return ((celsius * 9) + 160 )/5.0;
	}
	
	public static double converterParaCelsius(Double fahrenheit) {
		return ((fahrenheit - 32)*5.0)/9;
		
	}

}
