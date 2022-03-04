package view;

import controller.RedesController;

public class Principal {

	public static void main(String[] args) {
		RedesController redesController = new RedesController();

		String os = redesController.os();
		System.out.println(os);

		String process = "IPCONFIG";
		redesController.readProcessIP(process);

		String process1 = "PING -4 -n 10 www.google.com.br";
		redesController.readProcessPING(process1);

// Professor, sei que algumas coisas faltaram ou não ajustei. 
// Preciso revisar alguns comando, métodos e treinar bastante, 
// então da próxima faço melhor *-* 				

	}

}
