package writeToFile;

import java.io.BufferedReader;
//buffering using buffer classes
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderWriter {
	
	public void writeToFile(String data) throws IOException
	{
		FileWriter write = new FileWriter("mybufferfile.txt");
		BufferedWriter buffer = new BufferedWriter(write);
		buffer.write(data);
		buffer.flush();
		write.close();
	}
	public String readFromFile() throws IOException,FileNotFoundException
	{
		FileReader reader=new FileReader("mybufferfile.txt");
		BufferedReader buffer=new BufferedReader(reader);
		char[] cstr=new char[50];
		buffer.read(cstr);
		return new String(cstr);
	}

	public static void main(String[] args) {
		ReaderWriter obj = new ReaderWriter();
		try {
			obj.writeToFile("hello to buffer and file");
			String data = obj.readFromFile();
			System.out.println(data);
		}
		catch(FileNotFoundException e)
		{
			
		}
		catch(IOException e)
		{
			
		}
	}

}
