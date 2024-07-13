import java.util.*;

public class Adminstrators extends Person {

		Scanner in=new Scanner(System.in);
		public Adminstrators()
	    {
	   	 	Departement="Undefined";
	    }
	
    private String Departement;
    
    public void setDepartment(String Departement)
    {
   	 if(Departement.equals("Management")|| Departement.equals("management")|| Departement.equals("Accounting")|| Departement.equals("accounting")|| Departement.equals("Student Affairs")|| Departement.equals("student Affairs")||Departement.equals("Student affairs")||Departement.equals("student affairs"))
   	 { 
   		 this.Departement=Departement;
   	 }
   	 else
   	 {
   		 do {
   			 
   			 if(!Departement.equals("Management")&&!Departement.equals("management")&&!Departement.equals("Accounting")&&!Departement.equals("accounting")&&!Departement.equals("Student Affairs")&&!Departement.equals("student Affairs")&&!Departement.equals("Student affairs")&&!Departement.equals("student affairs"))
   			 {
   			  System.err.println("Error,please try again");
   			  Departement=in.next();
   			 }
   		 }while(!Departement.equals("Management")&&!Departement.equals("management")&&!Departement.equals("Accounting")&&!Departement.equals("accounting")&&!Departement.equals("Student Affairs")&&!Departement.equals("student Affairs")&&!Departement.equals("Student affairs")&&!Departement.equals("student affairs"));
          this.Departement=Departement;		 
   	 }
    }
   
    public String getDepartement()
    {
   	 return Departement;
    }
  
    public void add()
    {

   	 System.out.println("please enter the administrator name");
   	 String name=in.nextLine();
   	 setName(name);
	 System.out.println("please enter the administrator Age");
	 int age=in.nextInt();
	 setAge(age);
	 System.out.println("please enter the administrator address");
		in.nextLine();
	 String address=in.nextLine();
	 setAddress(address);
	 System.out.println("please enter the administrator number");
	 String number=in.next();
	 setNumber(number);
	 System.out.println("please enter the administrator gender");
	 String gender=in.next();
	 setGender(gender);
	 System.out.println("please enter the administrator departement\n"
	 		+ "[ Management - Accounting - Student Affairs ]");
	 String departement=in.next();
	 setDepartment(departement);	 
    }
    public String toString()
	{
		return ("Administrator Name:  " + getName() +"\n"+
		getName()+"'s Age : "  + getAge() +"\n"+
		getName()+"'s Address:  " + getAddress() +"\n"+
		getName()+"'s Number:   " + getNumber() + "\n"+
		getName()+"'s Gender:   " + getgeneder() + "\n"+
		getName()+"'s Departement:    " + getDepartement());
	}

}
