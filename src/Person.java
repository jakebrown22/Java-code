
public abstract class Person {
	public String firstName;
	public String lastName;
	public String phone;
	public String email;
	
	
	public Person(String firstName, String lastName, String phone, String email)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
	}
	
	abstract String GetType();
	
	public String GetFullName()
	{
		return firstName + " " + lastName;
	}
}
