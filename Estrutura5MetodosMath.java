import java.util.Locale;
import java.util.Scanner;
 
public class Estrutura5MetodosMath{
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Raiz quadrada: <variável> = Math.sqrt(<variável>);
		// Potencia: <variável> = Math.pow(<variável>, <variável>);
		// Valor absoluto: <variável> = Math.abs(<variável>);
		int x = 25;
		int y = 2;
		
		double a, b, c;
		
		a = Math.sqrt(x);
		b = Math.pow(x, y);
		c = Math.abs(x);
		
		System.out.printf("Raiz quadrada de %d é %.2f%n", x, a);
		System.out.printf("%d elevado a %d é %.2f%n", x, y, b);
		System.out.printf("O valor absoluto de %d é %.2f%n", x, c);
		
		// Um bhaskara só de memes:
		
		double bA = 5.0, bB = 10.0, bC = 15.0, bX1, bX2, delta;
		
		delta = Math.pow(b, 2.0) - 4 * bA *bC;
		
		bX1 = (-bB + Math.sqrt(delta)) / (2 * bA);
		bX2 = (-bB - Math.sqrt(delta)) / (2 * bA);
		
		System.out.printf("x' = %.2f x'' = %.2f", bX1, bX2);

		sc.close();
	}
}

