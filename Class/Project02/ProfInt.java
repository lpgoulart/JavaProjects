// Leonardo Goulart
// Java Programming language
// Project 02

public class ProfInt extends Prof{

	// Private variables declaration
		private double salary;

	// Constructor
		ProfInt (String name, String id, int age, double salary) {
			super ( name, id, age );
			this.salary = salary;
		}

	// Set functions
		public void setSalary ( double salary ) {
			this.salary = salary;
		}

	// Get Functions
		public double getSalary () {
			return this.salary;
		}

	// Salary function 
		public double salary () {
			return this.salary;
		}
}