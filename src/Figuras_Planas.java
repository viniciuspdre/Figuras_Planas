import java.text.DecimalFormat;
import java.util.Scanner;

public class Figuras_Planas {

	public static void main(String[] args) {
		int area;
		Scanner scan = new Scanner(System.in);
		final double PI = 3.141592;
		DecimalFormat formatador = new DecimalFormat("0.00");
		String confirm = "nao";
		
		//primeiro questionamos se o usuario quer a area do circulo, triangulo ou quadrado
		while (!confirm.equalsIgnoreCase("Sim")) {
		System.out.println("Olá mestre, se você deseja calcular a área do quadrado, digite 1, a do triângulo, digite 2 e a do circulo 3.");
		area = scan.nextInt();
		if (area == 1) {
			System.out.printf("Ok, então me forneça o lado do quadrado: ");
			int lado = scan.nextInt();
			int quadrado = lado * lado;
			System.out.printf("A área do quadrado é igual a: %d%n", quadrado);
		}
		if (area == 2) {
			System.out.printf("Ok, então me forneça o lado do triângulo: ");
			double lado = scan.nextDouble();
			double triang = (lado * lado)/2;
			System.out.println("A área do triângulo é: " + formatador.format(triang));
		}
		if (area == 3) {
			System.out.printf("Ok, então me forneça o raio do circulo: ");
			double raio = scan.nextDouble();
			double circulo = raio * raio * PI;
			System.out.println("A área do circulo é: " + formatador.format(circulo));
		}
		System.out.println("Se você deseja sair digite Sim, se não, digite qualquer coisa.");
		confirm = scan.next();
		}
	}

}
