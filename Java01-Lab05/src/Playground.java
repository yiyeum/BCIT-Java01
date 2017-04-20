
/**
 * Class represents the Playground.
 * @author KateYeEumLee
 * @version 1.5
 */

public class Playground {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Playground().run();

	}//main method
	
	/**
	 * Method to create an instance of the Person class.
	 */
	public void run(){
		Person person1 = new Person("Greenie");
		Person person2 = new Person("Greenie");
		System.out.println("Test if two instances have the same first name : ");
		System.out.println("The name of person1 : " + person1.getFirstName());
		System.out.println("The name of person2 : " + person2.getFirstName());
		if(person1.getFirstName().equals(person2.getFirstName())){
			System.out.println("They have Same Name!");
		}else{
			System.out.println("They have Different Name!");
		}
		System.out.println("__________Testing firstName & lastName mutator methods ");;
		System.out.println("When the parameter of setFirstName is null : ");
		Person person3 = new Person();
		person3.setFirstName("");
		System.out.println(person3.getFirstName());
		System.out.println("When the parameter of setLastName is null : ");
		person3.setLastName("");
		System.out.println(person3.getLastName());
	}//run

}
