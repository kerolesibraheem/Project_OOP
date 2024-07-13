import java.util.*;
public class Students extends Person{

	Scanner in=new Scanner(System.in);
	
	private double Gpa;
	private int Id;
	private int Level;
	private static String College;
	private String Academic_Email;
	     
	    public Students()
	    {
	    	Gpa=0.0;
	    	Id=1;
	    	Level=1;
	    	College="FCI";
	    	Academic_Email=null;
	    }

	     public void setGpa(double Gpa)
	     {
	    	if(Gpa<=4.0 && Gpa>0.0)
	    	{
	    		this.Gpa=Gpa;
	    	}
	    	else
	    	{
	    		do
	    		{
	    				System.err.println("Error,please try again");
						Gpa=in.nextDouble();    		
	    		}
	    		while(Gpa>4.0 || Gpa<0.0);
	    	}		
	     }
	     
	     public void setId(int Id)
	     {  
	    	 if(Id>=1 )
	    	 {
	    	    this.Id=Id;     	 
	    	 }
	    	 else
	    	 {
	    		 do {
	    			 System.err.println("Error,please try again");
	    			 Id=in.nextInt(); 
	    		 }while(Id<1 ); 
	    	 }  	 
	     }
	     
	     public void setLevel(int Level)
	     {
	    	if(Level>=1 && Level<=4)
	    	{
	    		this.Level=Level;
	    	}
	    	else
	    	{
	    		do {
	    				System.err.println("Error,please try again");
	    				Level=in.nextInt();
	    		}while(Level<1 || Level>4);
	    	}	
	     }
	     
	     public void setCollege(String College)
	     {
	    	 if(College=="FCI") 
	    	 {
	    	   Students.College=College;
	    	 }
	     }
	     
	     public void setAcademic_Email(String Academic_Email)
	     {
	    	 this.Academic_Email=Academic_Email; 
	     }
	     
	     public double getGpa() 
	     {
	    	 return Gpa;
	     }
	     
	     public int getId()
	     {
	    	return Id; 
	     }
	     
	     public int getLevel()
	     {
	    	 return Level;
	     }   
	     
	     public String getCollege()
	     {
	    	return College;  
	     }
	     
	     public String getAcademic_Email()
	     {
	    	 return Academic_Email; 
	     }     
	     
	  	
	 	 public void add()

	     {
	    	 System.out.println("please enter the student name");
	    	 String name=in.nextLine();
	    	 setName(name);
	    	 System.out.println("please enter the student Gpa");
             double gpa=in.nextDouble();
             setGpa(gpa);
	    	 System.out.println("please enter the student id");
             int id=in.nextInt();
             setId(id);
	    	 System.out.println("please enter the student level");
	    	 int level=in.nextInt();
	    	 setLevel(level);
	    	 System.out.println("please enter the student Academic_Email");
				in.nextLine();
	    	 String academicemail=in.nextLine();
	    	 setAcademic_Email(academicemail);
	    	 System.out.println("please enter the student Age");
	    	 int age=in.nextInt();
	    	 setAge(age);
	    	 System.out.println("please enter the student address");
				in.nextLine();
	    	 String address=in.nextLine();
	    	 setAddress(address);
	    	 System.out.println("please enter the student number");
	    	 String number=in.next();
	    	 setNumber(number);
	    	 System.out.println("please enter the student gender");
	    	 String gender=in.next();
	    	 setGender(gender);
	     }
	 
	 	 public String toString()
		{
			return ("Student Name:  " + getName() +"\n"+
			getName()+"'s Age:   " + getAge() +"\n"+
			getName()+"'s Address:  " + getAddress() +"\n"+
			getName()+"'s Number:   " + getNumber() + "\n"+
			getName()+"'s Gender:   " + getgeneder() + "\n"+
			getName()+"'s Gpa:      " + getGpa() + "\n"+
			getName()+"'s Id:       " + getId()  + "\n"+
			getName()+"'s Level:    " + getLevel() + "\n"+
			getName()+"'s College:  " + getCollege() + "\n"+
			getName()+"'s Academic_Email:    " + getAcademic_Email() +"\n");
		}

}
