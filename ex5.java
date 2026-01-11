import java.util.Locale;
import java.util.Scanner;

public class ex5{
	public static void main(String[] Args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numPecaUm, codigoPecaUm, numPecaDois, codigoPecaDois;
		double valorPecaUm, valorPecaDois, valorFinal;
		
		System.out.print("Em ordem, digite: Código da Peça, Número de Peças, Valor da Peça: ");
		codigoPecaUm = sc.nextInt();
		numPecaUm = sc.nextInt();
		valorPecaUm = sc.nextDouble();
		
		System.out.printf("%nEm ordem, digite: Código da Peça, Número de Peças, Valor da Peça: ");
		codigoPecaDois = sc.nextInt();
		numPecaDois = sc.nextInt();
		valorPecaDois = sc.nextDouble();
		
		valorFinal = (valorPecaUm * numPecaUm) + (valorPecaDois * numPecaDois);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", valorFinal);
		
		sc.close();
	}
}