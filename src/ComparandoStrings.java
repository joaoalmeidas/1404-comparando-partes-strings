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
		
		if(s1.length() > s2.length()) {
			
			System.out.printf("\"%s\" tem mais caracteres que \"%s\"%n", s1, s2);
			
		}else if(s1.length() < s2.length()) {
			
			System.out.printf("\"%s\" tem menos caracteres que \"%s\"%n", s1, s2);
			
		}else if(s1.length() == s2.length()) {
			
			System.out.printf("\"%s\" tem o mesmo numero de caracteres que \"%s\"%n", s1, s2);
			
		}

	}

}
