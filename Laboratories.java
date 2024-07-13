import java.util.*;

public class Laboratories extends Person {
	Scanner in=new Scanner(System.in);
	private String Lab_departement;
	private int Number_of_devices;
	private String Name;
	private int Floor;
	
	public Laboratories()
	{
		Lab_departement="Undefined Lab_departement";
		Number_of_devices=1;
		Name="Undefined Name";
		Floor=1;
	}
	
	public void setLab_departement(String Lab_departement)
	{
		if(Lab_departement.equals("General")||Lab_departement.equals("general")||Lab_departement.equals("Bio")||Lab_departement.equals("bio")||Lab_departement.equals("Software Engineering")||Lab_departement.equals("software Engineering")||Lab_departement.equals("Software engineering")||Lab_departement.equals("software engineering")||Lab_departement.equals("Information System")||Lab_departement.equals("information System")||Lab_departement.equals("Information system")||Lab_departement.equals("information system")||Lab_departement.equals("Computer Science")||Lab_departement.equals("computer Science")||Lab_departement.equals("Computer science")||Lab_departement.equals("computer science"))
		{
			this.Lab_departement=Lab_departement;
		}
		
		else
		{
			do {
				
				if(!Lab_departement.equals("General")&&!Lab_departement.equals("general")&&!Lab_departement.equals("Bio")&&!Lab_departement.equals("bio")&&!Lab_departement.equals("Software Engineering")&&!Lab_departement.equals("software Engineering")&&!Lab_departement.equals("Software engineering")&&!Lab_departement.equals("software engineering")&&!Lab_departement.equals("Information System")&&!Lab_departement.equals("information System")&&!Lab_departement.equals("Information system")&&!Lab_departement.equals("information system")&&!Lab_departement.equals("Computer Science")&&!Lab_departement.equals("computer Science")&&!Lab_departement.equals("Computer science")&&!Lab_departement.equals("computer science"))
				{
				System.err.println("Error,please try again" );
				Lab_departement=in.next();	
				}
			}while(!Lab_departement.equals("General")&&!Lab_departement.equals("general")&&!Lab_departement.equals("Bio")&&!Lab_departement.equals("bio")&&!Lab_departement.equals("Software Engineering")&&!Lab_departement.equals("software Engineering")&&!Lab_departement.equals("Software engineering")&&!Lab_departement.equals("software engineering")&&!Lab_departement.equals("Information System")&&!Lab_departement.equals("information System")&&!Lab_departement.equals("Information system")&&!Lab_departement.equals("information system")&&!Lab_departement.equals("Computer Science")&&!Lab_departement.equals("computer Science")&&!Lab_departement.equals("Computer science")&&!Lab_departement.equals("computer science"));
			this.Lab_departement=Lab_departement;
			
		}
	}
	
	public void setNumber_of_devices(int  Number_of_devices )
	{
		if (Number_of_devices > 0)
		{
			this.Number_of_devices= Number_of_devices;
		}
		else
		{
			do {
				System.err.println("Error,please try again");
				Number_of_devices= in.nextInt();
			} while (Number_of_devices < 0);
			this.Number_of_devices=Number_of_devices;
		} 
	}
	
	public void setName(String Name)
	{
		this.Name=Name;
	}
	
	public void setFloor(int Floor)
	{
		if (Floor >  0)
		{
			this.Floor=Floor;
		}
		else
		{
			do 
			{
				System.err.println("Error,please try again");
				Floor=in.nextInt();
			} while(Floor <= 0 );
			this.Floor=Floor;
		}
	}
	
	public String getLab_departement()
	{
		return Lab_departement;
	}

	public int getNumber_of_devices()
	{
		return Number_of_devices;
	}
	
	public String getName()
	{
		return Name;
	}
	
	public int getFloor()
	{
		return Floor;
	}
	
	public void add()
	{

   	 System.out.println("please enter the Laboratorie name");
   	 String name=in.nextLine();
   	 setName(name);

   	System.out.println("please enter the Lab_departement\n "
   			+"[ General - Bio - Software Engineering - Information System- Computer Science]");
  	 String nm=in.next();
  	setLab_departement(nm);
  	
  	System.out.println("please enter the Number_of_devices ");
 	 int v=in.nextInt();
 	setNumber_of_devices(v);
  	 
 	System.out.println("please enter the Floor ");
	 int f=in.nextInt();
	 setFloor(f);
 	 
	 
	}
	public String toString()
	{
			return ("Laboratorie Name:  " + getName() +"\n"+
			"Number of devices in " + getName () +" is "+getNumber_of_devices()+"\n"+
			getName()+"'s departement:  " + getLab_departement() +"\n"+
			getName()+"'s Floor:   " + getFloor() );
	}
}






