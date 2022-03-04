package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class RedesController {

	public RedesController() {
		super();
	}

	// Retorne o S.O que está em execução na máquina
	public String os() {
		String os = System.getProperty("os.name");

		return os;
	}

//ip	
	public void readProcessIP(String process) {
		try {
			Process p = Runtime.getRuntime().exec(process);
			InputStream fluxo = p.getInputStream();
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			while (linha != null) {
				System.out.println(linha);
				linha = buffer.readLine();
			}
			buffer.close();
			leitor.close();
			fluxo.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

// ping	
	public void readProcessPING(String process1) {
		try {
			Process p = Runtime.getRuntime().exec(process1);
			InputStream fluxo = p.getInputStream();
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			while (linha != null) {
				System.out.println(linha);
				linha = buffer.readLine();
			}
			buffer.close();
			leitor.close();
			fluxo.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
