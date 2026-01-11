import java.util.Scanner;

public class ex1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int x = 0, y = 0, z = 0;
		
		System.out.print("Digite um inteiro: ");
		x = sc.nextInt();
		System.out.printf("%nDigite outro inteiro: ");
		y = sc.nextInt();
		
		z = x + y;
		
		System.out.printf("%nA soma de %d e %d é %d", x, y, z);

		sc.close();
		
	}
}