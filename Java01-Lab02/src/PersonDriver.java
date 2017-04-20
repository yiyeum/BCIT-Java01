
/**
 * Driver class to run the methods of person.
 * @author KateYeEumLee
 *
 */
public class PersonDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new PersonDriver().run();
	}// main()
	
	public void run(){
		Person person1 = new Person("Jamie","Lee",120,160);
		Person person2 = new Person("Oliver","Lee",22,260);
		
		System.out.println("< Testing over range of age & height mutator > ");
		System.out.println("The name of person who has over age : "+person1.getFirstName());
		System.out.println("The name of person who has over height : "+person2.getFirstName());
		System.out.println("< When calling the accessor of age & height > ");
		System.out.println("Accessor of age : "+person1.getAge());
		System.out.println("Accessor of height : "+person2.getHeight());

		System.out.println("__________________________Set height & age within the range ");
		person1.setAge(30);
		person2.setHeight(165);
		System.out.println("< Calling the accessor of age & height again >");
		System.out.println("Accessor of age : "+person1.getAge());
		System.out.println("Accessor of height : "+person2.getHeight());
		
		System.out.println("__________________________Testing getDetails method ");
		person1.getDetails();
		person2.getDetails();
	}// run()

}
