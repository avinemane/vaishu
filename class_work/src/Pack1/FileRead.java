package Pack1;

import java.io.*;
public class FileRead {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader(args[0]);
			int i;
			while((i=fr.read())!=-1)
			{
				System.out.println((char)i);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
