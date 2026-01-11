import java.util.Locale;
import java.util.Scanner;

public class Estrutura1Variaveis{
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		
		// variáveis em Java
		// <tipo> <nome> = <valor inicial (opcional)>;
		
		// Inteiros:
		int valorPadrao = 25; // 8b
		byte valorPequeno = 127; //16b
		short valorMedio = 32767; //32b
		long valorGrande = 1234567890; //64b
		
		// Flutuante:
		float valorFlutuantePadrao = 10.0f; // 32b // em Java, depois do valor iniciado põe-se f
		double valorFlutuanteGrande = 9.5; // 64b
		
		// Valor Unicode:
		char letra = 'a';
		
		// Valor Verdade:
		boolean vF = true; 
		
		// Valor Palavras:
		
		String palavra = "Palavra";

	}
}