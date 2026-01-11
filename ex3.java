import java.util.Scanner;

public class ex3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int A = 0, B = 0, C = 0, D = 0, diff;
		
		System.out.printf("Digite 4 inteiros, ao inserir um, dê enter:%n");
		A = sc.nextInt();
		sc.nextLine();
		B = sc.nextInt();
		sc.nextLine();
		C = sc.nextInt();
		sc.nextLine();
		D = sc.nextInt();
		sc.nextLine();
		
		diff = A * B - C * D;
		
		System.out.printf("%n Diferença = %d", diff);

		sc.close();
		
	}
}