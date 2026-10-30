package Lab3;
import java.util.Scanner;

class Salary {
	String name;
	int id;
	double salary;
	public Salary(String name, int id, double salary2) {
		this.name = name;
		this.id = id;
		this.salary = salary2;
	}
	public double grossSalary() {
        return salary+(0.2*salary)+(0.1*salary);
    }
	public void printDetails(int employeeNumber) {
        System.out.println("-Employee Number " + employeeNumber + ":");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id );
        System.out.println("Basic Salary: " + salary );
        System.out.println("Gross Salary: " + grossSalary() + "$");
    }
}

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Input the amount of Employees: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		Salary[] salaries = new Salary[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n---Enter details for Employee Number " + (i + 1));
            System.out.print("Input Employee's Name: ");
            String name = sc.nextLine();
            System.out.print("Input Employee's ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Input Employee's Basic Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();
            salaries[i] = new Salary(name, id, salary);
        }

        System.out.println("\n---Employee Details");
        for (int i = 0; i < salaries.length; i++) {
            salaries[i].printDetails(i + 1);
    }	
        sc.close();
  }
}