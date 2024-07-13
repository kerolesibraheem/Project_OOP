import java.util.*;

public class Workers extends Person {

		Scanner in=new Scanner(System.in);
	
	private double Salary;
	
	public Workers()
	{
		Salary=1200.0;
	}
	
	public void setSalary(double Salary)
	{
		if(Salary>0 && Salary<=6000)
		{
			this.Salary=Salary;
		}
		else
		{
			do {
				System.err.println("Error,please try again");
				Salary=in.nextDouble();
			}while(Salary<=0 || Salary>6000);	
		}	
	}
	
	public double getSalary()
	{
		return Salary;
	}
	
	public void add()
    {
   	 System.out.println("please enter the worker name");
   	 String name=in.nextLine();
   	 setName(name);

	 System.out.println("please enter the worker Age");
	 int age=in.nextInt();
	 setAge(age);

	 System.out.println("please enter the worker address");
		in.nextLine();
	 String address=in.nextLine();
	 setAddress(address);

	 System.out.println("please enter the worker number");
	 String number=in.next();
	 setNumber(number);
	 System.out.println("please enter the worker gender");
	 String gender=in.next();
	 setGender(gender);
	 System.out.println("please enter the worker salary");
	 double salary=in.nextDouble();
	 setSalary(salary);
    }
	public String toString()
	{

		return ("worker Name:  " + getName() +"\n"+
		getName()+"'s Age:   " + getAge() +"\n"+
		getName()+"'s Address:  " + getAddress() +"\n"+
		getName()+"'s Number:   " + getNumber() + "\n"+
		getName()+"'s Gender:   " + getgeneder() + "\n"+
		getName()+"'s salary:      " + getSalary());
	}
}

