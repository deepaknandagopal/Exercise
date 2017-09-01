package coreJava_Firstset;

/**
 * @author Deepak Kumar Nandagopal
 * 
 * Program to print the person details
 * Condition: Set the path in the command line and run the program
 */
public class PersonDetails{
	
	private String firstname;
	private String lastname;
	private String phoneno;
	private String address;
	private int age;
	
	public void setFirstname(String fn){
		firstname = fn;
	}
	public void setLastname(String ln){
		lastname = ln;
	}
	public void setPhoneno(String pn){
		phoneno = pn;
	}
	public void setAddress(String add){
		address = add;
	}
	public void setAge(int ae){
		age = ae;
	}
	
	public String getFirstname(){
		return firstname;
	}
	public String getLastname(){
		return lastname;
	}
	public String getPhoneno(){
		return phoneno;
	}
	public String getAddress(){
		return address;
	}
	public int getAge(){
		return age;
	}
	
	public static void main(String[] args)
	{
		PersonDetails pd = new PersonDetails();
		pd.setFirstname("Deepak");
		pd.setLastname("Nandagopal");
		pd.setPhoneno("256-417-2526");
		pd.setAddress("12700 Bartram Park Boulevard #2322, Jacksonville, Florida - 32258");
		pd.setAge(24);
		
		System.out.println(" First Name: "+ pd.getFirstname());
		System.out.println(" Last Name: "+ pd.getLastname());
		System.out.println(" Phone no: "+ pd.getPhoneno());
		System.out.println(" Address "+ pd.getAddress());
		System.out.println(" Age: "+ pd.getAge());
		
	}
}