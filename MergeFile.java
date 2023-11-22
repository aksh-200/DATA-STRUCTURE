package com.demo.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class MergeFile {

	public static void main(String[] args) {
		String [] arr = new String [20];
		int count = 0;
		try (BufferedReader f1 = new BufferedReader(new FileReader("file1.txt"));
				BufferedReader f2 = new BufferedReader(new FileReader("file2.txt"));
				BufferedWriter f3 = new BufferedWriter(new FileWriter("file4.txt"));
				){
			
			
			
		
			String str1 = f1.readLine();
			
		     String str2 = f2.readLine();
			 while(str1!= null  && str2!=null)
			{
				 
				
			if(Integer.parseInt(str1) < Integer.parseInt(str2) )
			{ 
		
			  f3.write(str1);
			  f3.write("\n");
			  
			  System.out.println("Success"+str1);
			  str1 = f1.readLine();
			  
			}
			
		
			
			else
			{ 
		
			System.out.println("ARRAY ----" + arr[count++]);
				f3.write(str2);
				  f3.write("\n");
				 System.out.println("Success"+str2);
				  str2 = f2.readLine();
				 
			}
			}
			
			
			while(str1!= null)
			{
				 
				
			 f3.write(str1);
			  f3.write("\n");
			 System.out.println("Success"+str1);
			 str1 = f1.readLine();
			 
			 
			}
			
			while(str2!= null)
			{
				 
				
			 f3.write(str2);
			  f3.write("\n");
			 System.out.println("Success"+str2);
			 str2 = f2.readLine();
			 
			}
			
			
		} 
		
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	

	
	
}
