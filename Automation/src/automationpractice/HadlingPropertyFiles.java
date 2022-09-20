package automationpractice;
import java.io.*;
import java.util.*;
public class HadlingPropertyFiles extends _StaticBlockForWebdriver{

	public static void main(String[] args) throws IOException 
		{
	
		FileInputStream fis=new FileInputStream("./data/base.property");
		Properties p=new Properties();
		p.load(fis);
		String url=p.getProperty("url");
		String un=p.getProperty("un");
		String pwd=p.getProperty("pw");
		System.out.println(un);
		System.out.println(pwd);
		System.out.println(url);
	}
}
