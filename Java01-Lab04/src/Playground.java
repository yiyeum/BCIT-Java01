
/**
 * Class represents the Playground.
 * @author KateYeEumLee
 * @version 1.4
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
		Person person1 = new Person();
		System.out.println("Print out the default Person fields via the accessor method : ");
		System.out.println(person1.getFirstName() + " " + person1.getLastName() + " " + person1.getAge() + " " + person1.getHeight());
		person1.setFirstName("Green");
		person1.setLastName("Smoothie");
		person1.setAge(27);
		person1.setHeight(180);
		System.out.println("Print out newly mutate values : ");
		System.out.println(person1.getFirstName() + " " + person1.getLastName() + " " + person1.getAge() + " " + person1.getHeight());
		System.out.println("Call the isTall() and isOld() methods and print out string : ");
		if(person1.isTall()){
			System.out.println(person1.getFirstName() + " is tall");
		}else{
			System.out.println(person1.getFirstName() + " is not tall");
		}
		if(person1.isOld()){
			System.out.println(person1.getFirstName() + " is old");
		}else{
			System.out.println(person1.getFirstName() + " is not old");
		}
	}//run

}
