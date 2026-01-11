import java.util.Locale;
import java.util.Scanner;

public class Estrutura3DeProcessamento{
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		
		// Processamento de dados em Java e Casting:
		// Atribuição: <variável> = <expressão>;
				
		byte x, y;
		x = 5;
		y = 10;
				
		System.out.println(x);
		System.out.println(y);
				
		float w, z;
				
		w = 5.5f;
		z = 10.10f;
				
		System.out.println(w);
		System.out.println(z);
				
		float b = 6f, B = 8f, h = 5f, area;
				
		area = (b + B) / 2 * h;
				
		System.out.printf("área = %.2f%n", area);
				
		int cinco = 5, dois = 2;
		float resultado;
				
		resultado = cinco / dois; // Não há o casting, logo há uma perda de dados
				
		System.out.printf("Resultado sem Casting = %.2f%n", resultado);
				
		float resultadoCerto;
				
		resultadoCerto = (float) cinco / dois;
				
		System.out.printf("Resultado com Casting = %.2f%n", resultadoCerto);
				
		float valorUm;
		int recebeValorUm;
				
		valorUm = 1;
		recebeValorUm = (int)valorUm; // Posso fazer um casting para uma var de um tipo receber valor de var de outro tipo
				
		System.out.printf("Recebi um valor float numa var int mas com o casting o valor 'virou' int: %d%n", recebeValorUm);
	}
}