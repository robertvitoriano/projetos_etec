import java.util.Scanner;
public class Aluno {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String name;
		String grade;
		String telephone;
		float average;
		System.out.println("Digite seu nome abaixo:");
		name = scanner.next();
		System.out.println("Digite seu telefone");
	    telephone = scanner.next();
		System.out.println("Digite sua s�rie:");
	    grade = scanner.next();
		System.out.println("Digite sua m�dia:");
	    average = scanner.next();
        System.out.println("--------------------------- T�cnico em Inform�tica EaD ---------------------------------");
		System.out.println("nome: "+name);
		System.out.println("telefone: "+telephone);
		System.out.println("s�rie: "+grade);
		System.out.println("------------------------------------------------------------------------------------------------");
		System.out.println("m�dia: "+average);


	}

}
