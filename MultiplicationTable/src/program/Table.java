package program;

import java.util.Scanner;

public class Table {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o número que deseja calcular a tabuada: ");
		int number = scanner.nextInt();
		
		System.out.print("Digite o limite de multiplicação da tabuada: ");
		int limit = scanner.nextInt();
		
		for(int i = 1; i <= limit; i++) {
			int result = i * number;
			System.out.println(i + " x " + number + " = " + result);
		}
	}
}
