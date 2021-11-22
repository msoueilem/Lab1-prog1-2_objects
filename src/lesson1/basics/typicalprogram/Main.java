package lesson1.basics.typicalprogram;

/**
 * Creates a few Employees, stores them in an array.
 * Then locates all Employees with first name Bill
 *
 * @author Mei Li
 * @editor Soueilem Mohamed Lemine
 *
 */
public class Main {

	public static void main(String[] args) {
		Address add1A = new Address("10 Adams", "Fairfield", "IA", "52556");
		Address add1B = new Address("110 Burlington", "Fairfield", "IA", "52556");
		Address add2A = new Address("322 Harrison", "Fairfield", "IA", "52556");
		Address add2B = new Address("2210 Burlington", "Fairfield", "IA", "52556");

		Customer customer1 = new Customer("Soueilem", "msoueilem@miu.edu",212,1200);
		Customer customer4 = new Customer("MLS", "mls@miu.edu",215,200);


		Employee e1 = new Employee("Mls", "Lemine");
		e1.setSalary(100000);
		e1.setHome(add1A);
		e1.setWork(add1B);

		Employee e2 = new Employee("Soueilem", "Mohamed");
		e2.setSalary(120000);
		e2.setHome(add2A);
		e2.setWork(add2B);

		//print info about Employee 1
		System.out.println(e1);
		System.out.println(" Home address: "+e1.getHome());
		System.out.println(" Work address: " +e1.getWork());

		//Create an Employee array of length 2
		Employee[] empArray = new Employee[2];
		empArray[0] = e1;
		empArray[1] = e2;

		//Search the array for an Employee having first name "Bill"
		//If found, print out the Employee's full name
		for (Employee employee : empArray) {
			String firstName = employee.getFirstName();
			if (firstName.equals("soueilem")) {
				System.out.println("Found Bill! " + employee);
			}
		}
		System.out.println(customer1);

		for (Employee employee : empArray) {
			String firstName = employee.getFirstName();
			if (firstName.equals("mls")) {
				System.out.println("Found Bill! " + employee);
			}
		}
		System.out.println(customer4);

	}

}
