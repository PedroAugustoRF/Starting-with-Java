import java.util.Locale;
import java.util.Scanner;

public class ex4{
	public static void main(String[] args){
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int  idFuncionario;
		double horasTrabalhadas, valorHora, salario;
		
		System.out.print("Digite seu Numero de Funcionário: ");
		idFuncionario = sc.nextInt();
		System.out.printf("%nQuantas horas trabalhadas? ");
		horasTrabalhadas = sc.nextDouble();
		System.out.printf("Qual valor da sua hora? ");
		valorHora = sc.nextDouble();
		
		salario = horasTrabalhadas * valorHora;
		
		System.out.printf("%nNUMBER = %d%nSALARY = %.2f", idFuncionario, salario);

		sc.close();
	}
}