package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();

		sc.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.printf("Employoee #%d:", (i + 1));
			System.out.print("\nId: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();

			list.add(new Employee(id, name, salary));
		}

		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int searchId = sc.nextInt();

		boolean idFound = false;
		for (Employee emp : list) {
			if (searchId == emp.getId()) {
				System.out.print("enter the percentage: ");
				Double Percent = sc.nextDouble();
				emp.increaseSalary(Percent);
				
				idFound = true;
			} 
		}
		if (!idFound) {
			System.out.print("this id does not exist!\n");
		}

		System.out.println();
		System.out.print("List of employees:\n");
		for (Employee emp : list) {
			System.out.println(emp);
		}

		sc.close();
	}
}
