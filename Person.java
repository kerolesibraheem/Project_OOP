import java.util.*;
 abstract public class Person {
	Scanner in=new Scanner(System.in);

private String Name;
private int Age;
private String Address;	
private String Number;
private String Gender;
	
	public Person() 
	{
		Name="undefiend student";
		Age=18;
		Gender="Undefined Gender";
		Address=null;
		Number=null;
	}
	
	public void setName(String Name)
	{
			
		for (int i=0;i<Name.length();i++)
		{
			if ((Name.charAt(i)>='A' && Name.charAt(i)<='Z') || (Name.charAt(i)>='a' && Name.charAt(i)<='z') ||(Name.charAt(i)==' '))
			{
				continue;
			}
			else
			{
				System.err.println("Error,please try again");
				Name=in.nextLine();
				i=-1;
			}
		}
		this.Name=Name;	
	}
	
	public void setAge(int Age)
	{
		if(Age>15)
		{
			this.Age=Age;
		}
		else
		{
			do
			{
				if (Age<15)
				{
					System.err.println("Error,please try again");
					Age = in.nextInt();
				}
			} while(Age < 15);
			this.Age=Age;			
		}
	}
	
	public void setAddress(String Address)
	{
		this.Address=Address;
	}

	public void setNumber(String Number) 
	{
		if( Number.charAt(0)=='0' && Number.charAt(1)=='1' && Number.length()==11 )
		{
			this.Number=Number;			
		}
		else
		{
			do
			{
				if(Number.charAt(0)!='0' || Number.charAt(1)!='1' || Number.length()!=11 );
				{
					System.err.println("Error,please try again");
					Number = in.next();
				}
			} while(Number.charAt(0)!='0' || Number.charAt(1)!='1' || Number.length()!=11);
			this.Number=Number;	
		}
				
	}
	
	public void setGender(String gender)
	{
		if (gender.equals("male")  || gender.equals("Male") || gender.equals("female")|| gender.equals("Female"))
		{
			this.Gender=gender;
		}
		else
		{
			do {
				if (!gender.equals("male")  && !gender.equals("Male") && !gender.equals("female") && !gender.equals("Female"))
				{
				System.err.println("Error,please try again");
				gender=in.next();
				}
			} while (!gender.equals("male")  && !gender.equals("Male") && !gender.equals("female") && !gender.equals("Female"));
			this.Gender=gender;
		}
		
	}
	
	public String getName()

	{
		return Name;
	}
	
	public int getAge()
	{
		return Age;
	}
	
	public String getAddress()
	{
		return Address;
	}
	
	public String getNumber()
	{
	    return Number;	
	}
	
	public String getgeneder()
	{
		return Gender;
	}
	}
	
	


