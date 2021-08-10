import java.io.*;
public class DeserializationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=null;
		try
		{
		FileInputStream fin=new FileInputStream("C:\\Users\\FE839\\Desktop\\Test\\test.txt");
		ObjectInputStream oin=new ObjectInputStream(fin);
		e=(Employee) oin.readObject();
		oin.close();
		fin.close();
		System.out.println("Successfully converted from bytecode to object");
		}
		catch(Exception l)
		{
			System.out.println(l);
		}
System.out.println("Deserialized details");
System.out.println(e.MobNo+" "+e.Name);
	}

}
