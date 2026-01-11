import java.util.Locale;

public class ExercicioES{
	public static void main(String[] args){
		String product1 = "Computer";
		String product2 = "Office Desk";
		
		byte age = 30;
		int code = 5290;
		
		char gender = 'F';
		
		float price1 = 2100.0f;
		float price2 = 650.50f;
		double measure = 53.234567;
		
		System.out.printf("Products:%n%s, which price is $%.2f%n%s, witch price is $%.2f%n%n", product1, price1, product2, price2);
		System.out.printf("Record: %d years old, code %d and gender: %s%n%n", age, code, gender);
		System.out.printf("Measure with eigth decimal places: %.8f%nRouded (three decimal places): %.3f%n", measure, measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US Decimal Point: %.3f", measure);
		
	}
}