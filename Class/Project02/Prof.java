// Leonardo Goulart
// Java Programming language
// Project 02

public class Prof {

	// Private variables declaration
		private String name;
		private String   id;
		private int     age;
	// They are seen by every class extended from this

	// Constructor
		Prof ( String name, String id, int age ) {
			this.name = name;
			this.id   = id;
			this.age  = age;
		}

	// Set functions
		public void setName ( String name ) {
			this.name = name;
		}

		public void setId ( String id ) {
			this.id = id;
		}

		public void setAge ( int age ) {
			this.age = age;
		}

	// Get Functions
		public String getName () {
			return this.name;
		}

		public String getId () {
			return this.id;
		}

		public int getAge () {
			return this.age;
		}

	// Salary function
		public double salary () {
			return 0.0;
		}
}