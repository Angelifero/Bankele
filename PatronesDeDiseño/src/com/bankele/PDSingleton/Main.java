package com.bankele.PDSingleton;

public class Main {
	public static void main(String[] args) {

		Logger logger = Logger.getInstance();
		Logger loggerA = Logger.getInstance();
		
		
		//Se setea el mensaje en el logger
		logger.setValue("Mensaje seteado en logger");
		
		//Se imprime el mensaje en loggerA, 
		//Es el mismo valor por que es la misma instancia
		System.out.println(loggerA.getValue());
		
	}
}
