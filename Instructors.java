 import java.util.*;
 
public class Instructors extends Person {
	
		Scanner in=new Scanner(System.in);
		
		 	public Instructors()
		    {
		    	Subject_Number=1;
		    	Subject_Type="";
		    }
		 	
    private int Subject_Number;
   
    private String Subject_Type;
    
    public void setSubject_Number(int Subject_Number)
    {
    	if(Subject_Number<=5 && Subject_Number>=1)
    	{
        	this.Subject_Number=Subject_Number;
    	}
    	else
    	{
    		do
    		{
    	    	if(Subject_Number>5 || Subject_Number<1)
    	    	{
    	    		System.err.println("Error,please try again");
                    Subject_Number=in.nextInt();
    	    	}
    		} while(Subject_Number > 5 || Subject_Number<1);
        	this.Subject_Number=Subject_Number;
    	}
    }
    
    public void setSubject_Type(String Subject_Type)
    {
		this.Subject_Type+=Subject_Type;
    	for (int i=0;i<this.Subject_Number-1;i++)
    	{
    		System.out.println("Please enter the "+(i+2)+"th subject ");
    		Subject_Type=in.next();
    		this.Subject_Type += " - " + Subject_Type;
    	}
    }
   
    
    public int getSubject_Number()
    {
    	return Subject_Number;
    }
    
    public String getSubject_Type()
    {
    	return "["+Subject_Type+"]";
    
    }

    public void add()
    {

   	 System.out.println("please enter the instructor name");
   	 String name=in.nextLine();
   	 setName(name);
	 System.out.println("please enter the instructor Age");
	 int age=in.nextInt();
	 setAge(age);
	 System.out.println("please enter the instructor address");
		in.nextLine();
	 String address=in.nextLine();
	 setAddress(address);
	 System.out.println("please enter the instructor number");
	 String number=in.next();
	 setNumber(number);
	 System.out.println("please enter the instructor gender");
	 String gender=in.next();
	 setGender(gender);
	 
	 System.out.println("please enter the instructor subject_number");
	 int subject_number=in.nextInt();
	 setSubject_Number(subject_number);
	 
	 System.out.println("please enter the 1th subject");
		in.nextLine();
	 String subject_type=in.nextLine();
	 setSubject_Type(subject_type);
    }
    public String toString()
    {

		return ("instructor Name:  " + getName() +"\n"+
		getName()+"'s Age:   " + getAge() +"\n"+
		getName()+"'s Address:  " + getAddress() +"\n"+
		getName()+"'s Number:   " + getNumber() + "\n"+
		getName()+"'s Gender:   " + getgeneder() + "\n"+
		getName()+"'s subjects number:    " + getSubject_Number() + "\n"+
		getName()+"'s  subjects:    " + getSubject_Type());
    }
	
}
