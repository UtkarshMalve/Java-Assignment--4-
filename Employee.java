package ASSIGNMENT4;

import java.util.Scanner;

public class Employee {

	private double salary;
	private int hoursPerDay;

	public void getInfo(double salary, int hoursPerDay) {
		this.salary = salary;
		this.hoursPerDay = hoursPerDay;
	}

	public void AddSal() {
		if (salary < 500) {
			salary += 10;
		}
	}

	public void AddWork() {
		if (hoursPerDay > 6) {
			salary += 5;
		}
	}

	public void printFinalSalary() {
		System.out.println("Final Salary: $" + salary);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the salary: ");
		double salary = scanner.nextDouble();
		System.out.print("Enter the number of hours of work per day: ");
		int hoursPerDay = scanner.nextInt();

		Employee employee = new Employee();
		employee.getInfo(salary, hoursPerDay);
		employee.AddSal();
		employee.AddWork();
		employee.printFinalSalary();
	}
}
