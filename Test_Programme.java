import java.util.*;
public class Test_Programme {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		ArrayList <Person>  Faculty =new ArrayList <Person>();
		
		
		System.out.println("Welcome To our Programme");
		
		while(true) {
			
			try {
		System.out.println("\nIf you want to Search press 0 \n" +
							"If you want to Add press 1 \n" +
							"If you want to Delete press 2 \n" +
							"If you want to Display press 3 \n"+
							"if you want to end the programme pres 4");
		
		int Button;
		Button=in.nextInt();
		
		switch (Button)
		{
		case  0:
		{
			System.out.println("If you want to Search about student press 0 \n" +
					"If you want to Search about worker press 1 \n" +
					"If you want to Search about instructor press 2 \n" +
					"If you want to Search about adminstrator press 3 \n" +
					"If you want to Search about technican press 4 \n" +
					"If you want to Search about lab press 5 \n" );
			int x= in.nextInt();
			String name;
			if (x==0)
			{
				boolean p=true;
				System.out.println("Please enter a student name");
				in.nextLine();
				name=in.nextLine();
				for (int i=0;i<Faculty.size();i++)
				{
					
					if (Faculty.get(i) instanceof Students)
					{
						if (Faculty.get(i).getName().equals(name))
						{
							System.out.println(Faculty.get(i).toString());
							p=false;
						}
						
					}
				}
				if (p==true)
				{
					System.out.println("The Name is not found");
				}
				
			}
			else if (x==1)
			{
				boolean p=true;
				System.out.println("Please enter a worker name");
				in.nextLine();

				 name=in.nextLine();

				for (int i=0;i<Faculty.size();i++)
				{
					
					if (Faculty.get(i) instanceof Workers)
					{
						if (Faculty.get(i).getName().equals(name))
						{
							System.out.println(Faculty.get(i).toString());
							p=false;
						}
						
					}
				}
				if (p==true)
				{
					System.out.println("The Name is not found");
				}
			}
			else if (x==2)
			{
				boolean p=true;
				System.out.println("Please enter a instructor name");
				in.nextLine();

				 name=in.nextLine();

				for (int i=0;i<Faculty.size();i++)
				{
					
					if (Faculty.get(i) instanceof Instructors)
					{
						if (Faculty.get(i).getName().equals(name))
						{
							System.out.println(Faculty.get(i).toString());
							p=false;
						}
						
					}
				}
				if (p==true)
				{
					System.out.println("The Name is not found");
				}
				
			}
			else if (x==3)
			{
				boolean p=true;
				System.out.println("Please enter a adminstrator name");
				in.nextLine();
				 name=in.nextLine();

				for (int i=0;i<Faculty.size();i++)
				{
					if (Faculty.get(i) instanceof Adminstrators)
					{
						if (Faculty.get(i).getName().equals(name))
						{
							System.out.println(Faculty.get(i).toString());
							p=false;
						}
						
					}
				}
				if (p==true)
				{
					System.out.println("The Name is not found");
				}
			}
			else if (x==4)
			{
				boolean p=true;
				System.out.println("Please enter a technican name");
				in.nextLine();

				 name=in.nextLine();

				for (int i=0;i<Faculty.size();i++)
				{
					
					if (Faculty.get(i) instanceof Technicians)
					{
						if (Faculty.get(i).getName().equals(name))
						{
							System.out.println(Faculty.get(i).toString());
							p=false;
						}
						
					}
				}
				if (p==true)
				{
					System.out.println("The Name is not found");
				}
			}
			else if (x==5)
			{
				boolean p=true;
				System.out.println("Please enter the lab name");
				in.nextLine();

				 name=in.nextLine();

				for (int i=0;i<Faculty.size();i++)
				{
					
					if (Faculty.get(i) instanceof Laboratories)
					{
						if (Faculty.get(i).getName().equals(name))
						{
							System.out.println(Faculty.get(i).toString());
							p=false;
						}
					}
				}
				if (p==true)
				{
					System.out.println("The Lab is not found");
				}
			}
			
			break;
		}
		case 1:
		{
			System.out.println("If you want to add a student press 0 \n" +
					"If you want to  add a worker press 1 \n" +
					"If you want to  add a instructor press 2 \n" +
					"If you want to add a adminstrator press 3 \n" +
					"If you want to add a technican press 4 \n" +
					"If you want to add a lab press 5 \n" );
			int n=in.nextInt();
			
			if (n==0)
			{
				
				Students ob=new Students();
				ob.add();
				Faculty.add(ob);
				
			}
		
			
			else if (n==1)
			{
				Workers ob=new Workers();
				ob.add();
				Faculty.add(ob);

			}
			else if (n==2)
			{
				Instructors ob= new Instructors();
				ob.add();
				Faculty.add(ob);
			}
			else if (n==3)
			{
				Adminstrators ob=new Adminstrators();
				ob.add();
				Faculty.add(ob);
			}
			else if (n==4)
			{
				Technicians ob=new Technicians();
				ob.add();
				Faculty.add(ob);

			}
			else if (n==5)
			{
				Laboratories ob=new Laboratories();
				ob.add();
				Faculty.add(ob);
			}
			
			
			
			break;
			
		}
		
		case 2:
		{
			System.out.println("If you want to delete a student press 0 \n" +
					"If you want to delete a worker press 1 \n" +
					"If you want to delete an instructor press 2 \n" +					
					"If you want to delete an adminstrator press 3 \n" +
					"If you want to delete a technican press 4 \n" +
					"If you want to delete a lab press 5 \n" 	);	
			String nm;
			int x=in.nextInt();
			if (x==0)
			{
				boolean p=true;
				System.out.println("Please enter a student name");
				in.nextLine();
				 nm=in.nextLine();
				for (int i=0;i<Faculty.size();i++)
				{
					
					if (Faculty.get(i) instanceof Students)
					{
						if (Faculty.get(i).getName().equals(nm))
						{
							Faculty.remove(i);
							System.out.println(nm +" Was deleted succussfully");
							p=false;
						}
					}
				}
				if (p==true)
				{
					System.out.println("The Name is not found");
				}
				
			}
			else if (x==1)
			{
				boolean p=true;
				System.out.println("Please enter a worker name");
				in.nextLine();
				 nm=in.nextLine();

				for (int i=0;i<Faculty.size();i++)
				{
					
					if (Faculty.get(i) instanceof Workers)
					{
						if (Faculty.get(i).getName().equals(nm))
						{
							Faculty.remove(i);
							System.out.println(nm +" Was deleted succussfully");

							p=false;
						}
					}
				}
				
				if (p==true)
				{
					System.out.println("The Name is not found");
				}
			}
			else if (x==2)
			{
				boolean p=true;
				System.out.println("Please enter a instructor name");
				in.nextLine();

				 nm=in.nextLine();

				for (int i=0;i<Faculty.size();i++)
				{
					
					if (Faculty.get(i) instanceof Instructors)
					{
						if (Faculty.get(i).getName().equals(nm))
						{
							Faculty.remove(i);
							System.out.println(nm +" Was deleted succussfully");

							p=false;
						}
					}
				}
				if (p==true)
				{
					System.out.println("The Name is not found");
				}
				
			}
			else if (x==3)
			{
				boolean p=true;
				System.out.println("Please enter a adminstrator name");
				in.nextLine();

				 nm=in.nextLine();

				for (int i=0;i<Faculty.size();i++)
				{
					
					if (Faculty.get(i) instanceof Adminstrators)
					{
						if (Faculty.get(i).getName().equals(nm))
						{
							Faculty.remove(i);
							System.out.println(nm +" Was deleted succussfully");

							p=false;
						}
					}
				}
				if (p==true)
				{
					System.out.println("The Name is not found");
				}
			}
			else if (x==4)
			{
				boolean p=true;
				System.out.println("Please enter a technician name");
				in.nextLine();

				 nm=in.nextLine();

				for (int i=0;i<Faculty.size();i++)
				{
					
					if (Faculty.get(i) instanceof Technicians)
					{
						if (Faculty.get(i).getName().equals(nm))
						{
							Faculty.remove(i);
							System.out.println(nm +" Was deleted succussfully");

							p=false;
						}
					}
				}
				if (p==true)
				{
					System.out.println("The Name is not found");
				}
			}
			else if (x==5)
			{
				boolean p=true;
				System.out.println("Please enter the lab name");
				in.nextLine();

				 nm=in.nextLine();

				for (int i=0;i<Faculty.size();i++)
				{
					
					if (Faculty.get(i) instanceof Laboratories)
					{
						if (Faculty.get(i).getName().equals(nm))
						{
							Faculty.remove(i);
							System.out.println(nm +" Was deleted succussfully");
							p=false;
						}
					}
				}
				if (p==true)
				{
					System.out.println("The Lab is not found");
				}
				
			}
			break;
			
		}
			
		case 3:
		{
			
			System.out.println("If you want to display all students press 0 \n" +
					"If you want to display all workers press 1 \n" +
					"If you want to display all instructor press 2 \n" +					
					"If you want to display all adminstrators press 3 \n" +
					"If you want to display all technicans press 4 \n" +
					"If you want to display all Labs press 5 \n"	);	
			int n=in.nextInt();
			if (n==0)
			{
				boolean p=true;
				
				for (int i=0;i<Faculty.size();i++)
				{
					
					if (Faculty.get(i) instanceof Students)
					{
							System.out.println(Faculty.get(i).getName());
							p=false;	
					}
				}
				if (p==true)
				{
					System.out.println("There is no student");
				}
				
			}
			else if (n==1)
			{
				boolean p=true;

				for (int i=0;i<Faculty.size();i++)
				{
					
					if (Faculty.get(i) instanceof Workers)
					{
						
							System.out.println(Faculty.get(i).getName());
							p=false;
						
					}
				}
				if (p==true)
				{
					System.out.println("There is no worker");
				}
			}
			else if (n==2)
			{
				boolean p=true;
				

				for (int i=0;i<Faculty.size();i++)
				{
					
					if (Faculty.get(i) instanceof Instructors)
					{
						
							System.out.println(Faculty.get(i).getName());
							p=false;
						
						
					}
				}
				if (p==true)
				{
					System.out.println("There is no instructor");
				}
				
			}
			else if (n==3)
			{
				boolean p=true;

				for (int i=0;i<Faculty.size();i++)
				{
					if (Faculty.get(i) instanceof Adminstrators)
					{
						
							System.out.println(Faculty.get(i).getName());
							p=false;
						
						
					}
				}
				if (p==true)
				{
					System.out.println("There is no adminstrator");
				}
			}
			else if (n==4)
			{
				boolean p=true;
				
				for (int i=0;i<Faculty.size();i++)
				{
					
					if (Faculty.get(i) instanceof Technicians)
					{
						
							System.out.println(Faculty.get(i).getName());
							p=false;
						
					}
				}
				if (p==true)
				{
					System.out.println("There is no technician");
				}
			}
			else if (n==5)
			{
				boolean p=true;
				

				for (int i=0;i<Faculty.size();i++)
				{
					
					if (Faculty.get(i) instanceof Laboratories)
					{
						
							System.out.println(Faculty.get(i).getName());
							p=false;
						
					}
				}
				if (p==true)
				{
					System.out.println("There is no lab");
				}
			}
			
			break;
		}
			
		case 4:
		{
			System.out.println("Thank you for using our programme");
			return;
		}
		default:
		{
			System.err.println("Please enter a valid number");
			break;
		}
			
		}
		
			
		
			
		}
			catch(Exception e)
			{

			System.err.println("Error input ... please enter a valid input");
			in.next();
			
			}
	} 
		
	}	
	}		

		




