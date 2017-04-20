
/**
 * Class represents the Person.
 * @author KateYeEumLee
 * @version 1.2
 */
public class Person {
		private String firstName;
		private String lastName;
		private int age;
		private double height;
		
	/**
	 * Default Constructor.
	 */
	public Person(){}
	
	/**
	 * Overloaded Constructor.
	 * @param firstName The first name of this person.
	 * @param lastName The last name of this person.
	 * @param age The age of this person.
	 * @param height The height of this person.
	 */
	public Person(String firstName, String lastName, int age, double height) {
		setFirstName(firstName);
		setLastName(lastName);
		setAge(age);
		setHeight(height);
	}
	
	/**
	 * Method to get the first name of the person.
	 * @return the firstName as a String.
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * Method to set the first name of the person.
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * Method to get the last name of the person.
	 * @return the lastName as a String.
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * Method to set the last name of the person.
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * Method to get the age of the person.
	 * @return the age as an int.
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * Method to set the age of the person.
	 * @param age the age to set
	 */
	public void setAge(int age) {
		if(age <= 0){
			this.age = 1;
		}else if(age > 0 && age <= 100){
			this.age = age;
		}
	}
	
	/**
	 * Method to get the height of the person.
	 * @return the height as a double.
	 */
	public double getHeight() {
		return height;
	}
	
	/**
	 * Method to set the height of the person.
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		if(height <= 0){
			this.height = 1;
		}else if(height > 0 && height <= 250){
			this.height = height;
		}//else
	}// setHeight

	/**
	 * Method to check if this person is old.
	 * @return Returns as a boolean.
	 */
	public boolean isOld(){
		if(this.age >= 60){
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * Method to check if this person is tall.
	 * @return Returns as a boolean.
	 */
	public boolean isTall(){
		if(this.height >= 180){
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * Method to print details of person.
	 */
	public void getDetails(){
		System.out.println("Hello my name is" + " " + getFirstName() + " " + getLastName()+ ", "+ "and my age is " + getAge() +" ."  );
	}
}//class
