package Methods;

public class MethodOverRiding {
		   protected void displayInfo() {
		      System.out.println("I am an animal.");
		   }
		}

		class Dog extends MethodOverRiding {
		   public void displayInfo() {
		      System.out.println("I am a dog.");
		   }
		}

		class Main {
		   public static void main(String[] args) {
		      Dog d1 = new Dog();
		      d1.displayInfo();
		   }
		}

	