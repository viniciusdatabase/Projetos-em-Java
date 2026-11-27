package entities;

public class Funcionario {
	
	public String Name;
	public double GrossSalary, Tax;
	
	public double NetSalary() {
		
		return GrossSalary - Tax;
		
	}
	
	public void IncreaseSalary(double percentage) {
		
		GrossSalary += GrossSalary * percentage / 100;
		
	}

}
