package br.com.britoj.shipper;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		String nome1;
		String nome2;
		Shipper shipper = new Shipper();
		
		System.out.println("****Ol�, n�s vamos shippar pessoas****");
		
		System.out.println("Quem � o primeiro?");
		nome1 = leitura.nextLine();
		System.out.println("O pr�ximo...");
		nome2 = leitura.nextLine();
		
		System.out.println("Ta� o teu shipp");
		shipper.combinarNomes(nome1, nome2);
		System.out.println("E mais um pra cole��o");
		shipper.combinarNomes(nome2, nome1);
		
	}

}
