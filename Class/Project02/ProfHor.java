// Leonardo Goulart
// Java Programming language
// Project 02

public class ProfHor extends Prof{

	// Private variables declaration
		private int  total_hour;
		private double salary_hour;

	// Constructor
		ProfHor (String name, String id, int age, int total_hour, double salary_hour) {
			super ( name, id, age );
			this.total_hour  = total_hour;
			this.salary_hour = salary_hour;
		}

	// Set functions
		public void setTotalHour ( int total_hour ) {
			this.total_hour = total_hour;
		}

		public void setSalaryHour ( double salary_hour ) {
			this.salary_hour = salary_hour;
		}

	// Get Functions
		public int getTotalHour () {
			return this.total_hour;
		}

		public double getSalaryHour () {
			return this.salary_hour;
		}

	// Salary function
		public double salary () {
			return this.total_hour * this.salary_hour;
		}
}