package exercicio04;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		/*
		 * Relizei a criação desta inserção abaixo para validar a criação do SKU com
		 * base nos dados do Produto e também a inserção no banco de dados
		 */

		Scanner sc = new Scanner(System.in);
		Produto p = new Produto();

		System.out.println("Informe o nome do produto");
		String nome = sc.nextLine();
		p.setNome(nome);

		System.out.println("Informe a marca do produto");
		String marca = sc.nextLine();
		p.setMarca(marca);

		System.out.print("Informe o Departamento do produto \n");
		String depart = sc.next();
		p.setDepartamento(depart);

		System.out.println("Informe a cor do produto");
		String cor = sc.next();
		p.setCor(cor);

		SKU k = new SKU();
		p.setSku(k.geradorSKU(nome, marca, depart, cor));

		System.out.println(p);


		sc.close();
	}

}
