import java.io.*;
class Employee implements Serializable
{
	String Name;
	int MobNo;
	Employee(String Name,int MobNo)
	{
	this.Name=Name;
	this.MobNo=MobNo;
	}
}
public class SerializeTest {
	public static void main(String[] args) {
		Employee e1=new Employee("venkatesh",709);
		try
		{
		FileOutputStream fout=new FileOutputStream("C:\\Users\\FE839\\Desktop\\Test\\test.txt");
		ObjectOutputStream oout=new ObjectOutputStream(fout);
		oout.writeObject(e1);
		oout.close();
		fout.close();
		System.out.println("Successfully converted into bytecode for transferring");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
