import java.util.Locale;
import java.util.Scanner;

public class Estrutura2DeSaida{
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		
		// Saída de dados ou Escrita:
		
		System.out.print("Olá!"); //print não tem uma quebra de linha no final
		System.out.println("Oi"); //println tem uma quebra de linha no final (\n)
		
		byte idade = 23;
		System.out.println(idade); // print de inteiro
		
		float nota = 9.5f;
		System.out.printf("%.2f%n", nota); // printf é o print formatado
		
		byte i = 10;
		System.out.println("São: " + i + " Metros"); // Concatenar partes
		System.out.printf("São: %d Metros%n", i);
		
		String nome = "Pedro";
		byte idadePessoa = 23;
		float notaProva = 7.8f;
		
		System.out.printf("Nome: %s%nIdade: %d%nNota: %.2f%n", nome, idadePessoa, notaProva);

	}
}