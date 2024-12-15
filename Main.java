import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		

		System.out.println("Qual a tabuada que precisa: ?");
		numero = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
		
		System.out.println(numero + "x" + i + "=" + (numero * i));
		}
		sc.close();
	}

}
