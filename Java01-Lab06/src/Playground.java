
/**
 * Class represents the Playground.
 * @author KateYeEumLee
 * @version 1.6
 */

public class Playground {
	private Person[] personArray;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Playground().addPeople();

	}//main method
	
	/**
	 * Method to print the average of all Person objects in the personArray
	 */
	public void addPeople(){
		// For each element of the personArray, instantiate a Person object.
		personArray = new Person[5];
		personArray[0] = new Person();
		personArray[1] = new Person();
		personArray[2] = new Person();
		personArray[3] = new Person();
		personArray[4] = new Person();
		
		// Set the age instance variable to a value, using the setAge() mutator method.
		personArray[0].setAge(10);
		personArray[1].setAge(20);
		personArray[2].setAge(30);
		personArray[3].setAge(40);
		personArray[4].setAge(50);
		
		// Using a while loop, calculate the average age of all Person objects in the personArray.
		int index = 0;
		int total = 0;
		int average = 0;
		while(index < personArray.length){
			total += personArray[index].getAge();
			index++;
		}
		average = total / personArray.length;
		System.out.println("When 5 people age are " + personArray[0].getAge() + "," + personArray[1].getAge() + "," + personArray[2].getAge() + "," + personArray[3].getAge() + "," + personArray[4].getAge() +"," );
		System.out.println("the average age of all Person objects in the personArray is :" + average);
	}

}
