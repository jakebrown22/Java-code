
public class ServiceProvider extends Person {
	int hoursAvailable;
	double payRate;
	
	public ServiceProvider(String firstName, String lastName, String phone, String email, int hoursAvilable, int payRate)
	{
		super(firstName, lastName, phone, email);
		this.hoursAvailable = hoursAvilable;
		this.payRate = payRate;
	}
	
	public String GetType()
	{
		return "Service Provider";
	}
	
	public double DetermineLaborCost(double hoursRequired)
	{
		return hoursRequired * payRate;
	}
	
	public void SendEmail()
	{
		if(IsAvilable())
		{
			//smtp send
		}
	}
	
	private Boolean IsAvilable()
	{
		//Some logic here to determine the SPs availability
		return true;
	}
}
