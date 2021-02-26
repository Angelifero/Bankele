package com.bankele.PDSingleton;

public class Logger {
	private static Logger log;
	private String value;

	private Logger() {

	}

	// Si el log ya esta instanciado no se creara ninguna nueva instancia, se va
	// utilizar la misma a travez de un metodo.
	public static Logger getInstance() {

		if (log == null) {
			log = new Logger(); 
		}

		return log;

	}

	// Metodo que regresa una cadena.
	public void log(String mensaje) {
		System.out.println(mensaje);
	}
	
	public void setValue(String msg) {
		value=msg;
	}
	
	public String getValue() {
		return value;
	}
}
