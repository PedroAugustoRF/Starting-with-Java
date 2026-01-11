import java.util.Locale;
import java.util.Scanner;

public class ex6{
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
		double pi = 3.14159;
		
		System.out.println("Digite em sequência três valores com ponto flutuante: ");
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
	
		triangulo = (A * C) / 2;
		circulo = pi * Math.pow(C, 2);
		trapezio = ((A + B) * C)/2;
		quadrado = Math.pow(B, 2);
		retangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f %nCIRCULO: %.3f %nTRAPEZIO: %.3f %nQUADRADO: %.3f %nRETANGULO: %.3f", triangulo, circulo, trapezio, quadrado, retangulo);
		sc.close();
	}
}