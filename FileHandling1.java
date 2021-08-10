import java.io.*;
import java.util.Scanner;
public class FileHandling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			String S="This is venkatesh";
			byte[] b=S.getBytes();
		FileOutputStream fout=new FileOutputStream("C:\\Users\\FE839\\Desktop\\Test\\test.txt");
		fout.write(b);
		fout.close();
		System.out.println("Succesfully written");
		}catch(Exception e1)
		{
			System.out.println(e1);
		}
		try
		{
			FileInputStream fin=new FileInputStream("C:\\Users\\FE839\\Desktop\\Test\\test.txt");
		Scanner sc=new Scanner(fin);
		while(sc.hasNextLine())
		{
			System.out.print(sc.nextLine());
		}
	      fin.read();
	      fin.close();
		}catch(Exception e2)
		{
			System.out.println(e2);
		}

	}

}
