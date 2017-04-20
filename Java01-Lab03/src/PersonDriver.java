
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
		
		System.out.println("< Testing different constructors for counters > ");
		System.out.println("Try one constructor : ");
		Person person1 = new Person();
		System.out.println(person1.getNumberOfTimesCreated());
		
		System.out.println("Try two constructors : ");
		Person person2 = new Person("Kate","Lee");
		System.out.println(person2.getNumberOfTimesCreated());
		
		System.out.println("Try three constructors : ");
		Person person3 = new Person("Tim","Shockness",20,180);
		System.out.println(person3.getNumberOfTimesCreated());


		
	}// run()

}
