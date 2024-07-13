import java.util.*;

public class Technicians extends Person {
	
	Scanner in=new Scanner(System.in);
	
	private int Laboratories_Number;
	
	public Technicians()
	{
		Laboratories_Number=1;
	}
	
	public void setLaboratories(int Laboratories_Number)
	{
		if (Laboratories_Number > 0)
		{
			this.Laboratories_Number=Laboratories_Number;
		}
		else
		{
			do {
				if (Laboratories_Number < 0)
				{
					System.err.println("Error,please try again");
					Laboratories_Number=in.nextInt();
				} 
			 } while(Laboratories_Number < 0);
    		
		}
	}
	
	
	public int getLaboratories()
	{
		return Laboratories_Number;
	}
	
	public void add()
	{

   	 System.out.println("please enter the technician name");
   	 String name=in.nextLine();
   	 setName(name);

	 System.out.println("please enter the technician Age");
	 int age=in.nextInt();
	 setAge(age);
	 
	 System.out.println("please enter the technician address");
		in.nextLine();
	 String address=in.nextLine();
	 setAddress(address);
	 
	 System.out.println("please enter the technnician number");
	 String number=in.next();
	 setNumber(number);

	 System.out.println("please enter the technician gender");
	 String gender=in.next();
	 setGender(gender);

	 System.out.println("please enter the technician's labs number");
	 int laboratories_number=in.nextInt();
	 setLaboratories(laboratories_number);
	}
	public String toString()
	{
			return ("technician Name:  " + getName() +"\n"+
			getName()+"'s Age:   " + getAge() +"\n"+
			getName()+"'s Address:  " + getAddress() +"\n"+
			getName()+"'s Number:   " + getNumber() + "\n"+
			getName()+"'s Gender:   " + getgeneder() + "\n"+
			getName()+"'s laboratories:    " + getLaboratories());
	}
}
