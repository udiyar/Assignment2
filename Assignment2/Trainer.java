package Assignment2;

public class Trainer {
	
	String name;
	String department;
	String email;
	int id;
	
	public Trainer(String trainerName,String trainerDepartment,String traineremailID,int trainerID)
	{
		name=trainerName;
		department=trainerDepartment;
		email=traineremailID;
		id=trainerID;
	}

	public static void main(String[] args) {
		Object [][]values= {
				{"Mukesh","Testing","mukesh@gmail.com",1},
				{"Hitesh","Dev","mukesh@gmail.com",2},
				{"Mukesh","DevOps","mukesh@gmail.com",3}
		};
		System.out.println(values[0][1]);
		
		//Trainer obj=new Trainer();
		
		Trainer trainer1=new Trainer("Mukesh","Testing","mukesh@gmail.com",1);
		Trainer trainer2=new Trainer("Hitesh","Dev","mukesh@gmail.com",2);
		Trainer trainer3=new Trainer("Mukesh","DevOps","mukesh@gmail.com",3);
		
		System.out.println(trainer1.department);
		System.out.println(trainer2.email);
		System.out.println(trainer3.id);
	}
	
		public void Selenium()
		{
			System.out.println("Trainer1 can teach selenium");
		}
		public void WebDevelopment()
		{
			System.out.println("Trainer2 can teach web development");
		}
		public void DevOps()
	{
		System.out.println("Trainer3 can teach DevOps");
	}
}
