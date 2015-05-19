
public class Requestor extends Person {
	String address;
	
	public Requestor(String firstName, String lastName, String phone, String email, String address)
	{
		super(firstName, lastName, phone, email);
		this.address = address;
	}
	
	public String GetType()
	{
		return "Requestor";
	}
	
	public void SubmitRequest(String address)
	{
		//some code to submit a work request with the requestor's address
	}
}
