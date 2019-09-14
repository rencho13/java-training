public class ObjectTraining {


		private String name;
		private int age;
		private boolean wilder;


		public ObjectTraining(String name, int age) {
			this.name = name;
			this.age = age;
			
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public  int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public boolean isWilder() {
			return wilder;
		}

		public void setWilder(boolean wilder) {
			this.wilder = wilder;
		}

		public String whoAmI() {
			return "My name is " + this.getName() + " and I'm " + this.getAge(); 
		}


		public ObjectTraining() {
		}

	
}
