package learning;

public class Paraconstructor {
	
	int id;
	String name, dept;
	static String city = "Chennai";
	Paraconstructor()
	{  

		id	= 101;  
		name = "Arun"; 
		dept ="MCA";
		
	}
	
	
/*	Paraconstructor(Paraconstructor p){  

		id = p.id;  
		name = p.name; 
		dept = p.dept;
		
	}*/
	
	void display()
	{
		System.out.println(id+" "+name+" "+dept+" "+city);
	}  
	public static void main(String[] args) {
		 
//		Paraconstructor ts1 = new Paraconstructor(101,"Arun","MCA");
		Paraconstructor ts2 = new Paraconstructor();
//		ts1.display();
		ts2.display();
	}
}