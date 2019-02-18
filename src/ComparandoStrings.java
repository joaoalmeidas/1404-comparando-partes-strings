import java.util.Scanner;

public class ComparandoStrings {

	public static void main(String[] args) {
		
		String s1;
		String s2;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira uma frase:");
		s1 = input.nextLine();
		
		System.out.println("Insira outra frase:");
		s2 = input.nextLine();
		
		if(s1.regionMatches(true, 0, s2, 0, s2.length())) {
			
			System.out.print("As duas strings são iguais, ignorando caracteres com caixa alta.");
			
		}else {
			
			System.out.print("As duas strings são diferentes.");
			
		}

	}

}
