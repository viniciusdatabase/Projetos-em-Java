package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//*** VARIÁVEIS ***//
		
		Funcionario colaborador = new Funcionario();
		double aumento;
		
		//*** CÓDIGO ***//
		
		System.out.print("Name: ");
		colaborador.Name = sc.nextLine();
		
		System.out.print("\nGross salary: ");
		colaborador.GrossSalary = sc.nextDouble();
		
		System.out.print("\nTax: ");
		colaborador.Tax = sc.nextDouble();
		
		System.out.print("Employee: " + colaborador.Name + ", $ " + colaborador.NetSalary());
		
		System.out.print("\nWhich percentage to increase salary? ");
		aumento = sc.nextDouble();
		
		colaborador.IncreaseSalary(aumento);
		
		System.out.println("Updated data: " + colaborador.Name + ", $ " + colaborador.NetSalary());
		sc.close();
		
	}

}
