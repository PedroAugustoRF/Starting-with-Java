import java.util.Locale;
import java.util.Scanner;

public class Estrutura4DeEntrada{
	public static void main(String[] args){
		
		// Entrada ou leitura de dados em Java:
		// O Java tem uma particularidade para fazer entrada de dados
		// Precisamos criar um objeto do tipo Scanner
				
		// Se usa a "Biblioteca" java.util.Scanner;
		// Scanner <nome da variável> = new Scanner(System.in);
		// Use <nome da variável>.close(); quando não precisar (desalocar) mais do objeto <nome da variável>
				
		// Para uma variável receber o valor que você quer entrar:
		// <nome da variável> = <nome da variável Scanner>.next();
		
		Locale.setDefault(Locale.US);				
		Scanner scanf = new Scanner(System.in);
		
		String nomeUser;
		
		System.out.print("Digite seu nome: ");
		nomeUser = scanf.next(); // esse comando "para" o programa e espera a entrada de dados
		System.out.printf("Seu nome é: %s%n", nomeUser);

		int idadeUser;
				
		System.out.print("\nAgora digite sua idade: ");
		idadeUser = scanf.nextInt(); // usa-se o .nextInt(); para ler o proximo inteiro
		System.out.printf("Sua idade é: %d anos%n", idadeUser);
		
		// Para Scanner float/double ele pega a localidade do sistema, no print vai aparecer xx,xx e não xx.xx
		// No caso o user tem que digitar com "," se o PC estiver em Portugues
		// usa o Locale antes do Scanner para digitar com "."
		
		float notaFloatUser;
		
		System.out.print("\nSua nota N1: ");
		notaFloatUser = scanf.nextFloat();
		System.out.printf("Sua nota da N1 (float) foi: %.2f%n", notaFloatUser);
		
		double notaDoubleUser;
		
		System.out.print("\nSua nota N2: ");
		notaDoubleUser = scanf.nextDouble();
		System.out.printf("Sua nota da N2 (double) foi: %.2f%n", notaDoubleUser);
		
		
		// Para Scanner char usa .next().charAt(0);
		// charAt(0); significa que ele vai pegar o caractere da posição que está dentro dos parenteses
		
		char letraUser;
		
		System.out.printf("\nDigite uma letra: ");
		letraUser = scanf.next().charAt(0);
		System.out.printf("Você digitou a letra: %c%n", letraUser);
				
		
		// Para ler vários dados na mesma linha
		
		String nome;
		char letra;
		int inteiro;
		double real;
		
		System.out.println("\nDigite em ordem um Nome, Letra, Número Inteiro e Número Real: ");
		nome = scanf.next();
		letra = scanf.next().charAt(0);
		inteiro = scanf.nextInt();
		real = scanf.nextDouble();
		System.out.printf("Nome: '%s', Letra: '%c', Inteiro: '%d', Real: '%.2f'%n", nome, letra, inteiro, real);
		
		// Ler dados até a quebra de linha, ou seja, o proximo scanner é ativado quando você der enter
		// <nome da variável>.nextLine();
		
		String cidade;
		String estado;
		String pais;
		
		System.out.print("Em qual cidade você mora? ");
		cidade = scanf.nextLine();
		System.out.print("\nEm qual estado você mora? ");
		estado = scanf.nextLine();
		System.out.print("\nem qual país você mora? ");
		pais = scanf.nextLine();
		
		System.out.printf("Você mora em %s, %s, %s", cidade, estado, pais);
		
		scanf.close();
		
	}
}