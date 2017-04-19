
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
		Person person1 = new Person("Jamie","Lee",25,160);
		Person person2 = new Person("Oliver","Lee",62,183);
		
		System.out.println("Name List : ");
		System.out.println(person1.getFirstName() + " , "+ person2.getFirstName());
		System.out.println("Tall People who are over 180cm : ");
		System.out.println("Person 1 :"+ " " +person1.isTall() + " , " +"Person 2 :"+ " "+ person2.isTall());
		System.out.println("Elder People who are over 60 : ");
		System.out.println("Person 1 :"+ " " +person1.isOld() + " , " +"Person 2 :"+ " "+ person2.isOld());
		System.out.println("__________________________________________Testing Accessor & Mutator");
		System.out.println("Name List : ");
		person1.setFirstName("Elina");
		person2.setFirstName("Katie");
		System.out.println(person1.getFirstName() + " , "+ person2.getFirstName());
		person1.setHeight(185);
		person1.setAge(65);
		person2.setHeight(155);
		person2.setAge(21);
		System.out.println("Tall People who are over 180cm : ");
		System.out.println("Person 1 :"+ " " +person1.isTall() + " , " +"Person 2 :"+ " "+ person2.isTall());
		System.out.println("Elder People who are over 60 : ");
		System.out.println("Person 1 :"+ " " +person1.isOld() + " , " +"Person 2 :"+ " "+ person2.isOld());
	}// run()

}
