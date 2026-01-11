import java.util.Scanner;
import java.util.Locale;

public class ex2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double raio = 0.0f, area = 0.0f;
		double pi = 3.14159f;
		
		System.out.print("Digite o raio da circunferência: ");
		raio = sc.nextDouble();
		
		area =  pi * Math.pow(raio, 2);
		
		System.out.printf("%nA área da circunferência é: %.4f", area);

		sc.close();
	}
}