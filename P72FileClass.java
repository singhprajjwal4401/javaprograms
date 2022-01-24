/*File class is just used to create a file and access its various
 properties.It cannot be used to read and write dta to a file.A file 
in actual only get created when: either you use createNewFile() method
of you try to open some file in write mode, if it is not preexisting,
 a new file with that same name will get created*/

import java.util.*;
import java.io.*;
class P72FileClass 
{
	public static void main(String args[])
	    {
		try
		{
 		File f1 = new File("C:\\Users\\hp\\Desktop\\javaaa\\CSE310 programs\\K1653.txt");    //absolute path,just storage available
		f1.createNewFile();   //actual creation of file
		File f2 = new File("b.txt");

		System.out.println("File Name: " + f1.getName());    //name of file including extension
		System.out.println("Path: " + f1.getPath());         //current directory i.e. relative path
		System.out.println("Is Absolute : " + f1.isAbsolute()); //whether the file is specified by providing absolute path  or not
		System.out.println("Absolute Path: " + f1.getAbsolutePath());  //to get the whole specified path
		System.out.println("Parent: " + f1.getParent());         //from start till folder that contains file
		System.out.println(f1.exists() ? "exists" : "does not exist"); //whether filename exist or not 
		System.out.println("Is a Directory: "+ f1.isDirectory());    //if its a directory
		System.out.println("Is a File: "+ f1.isFile());      //if a file
		System.out.println("Can Write? "+ f1.canWrite());    //can i write ?
		System.out.println("Can Read? "+ f1.canRead());      //can i read ?
		System.out.println("File size: " + f1.length() + " Bytes");
		//f1.renameTo(new File("pow.txt"));   //one way
		f1.renameTo(f2);   //second way
		//f1.delete();     //to delete the file

		long min = f1.lastModified();
            	Date dt = new Date(min);
            	System.out.print(" last modified at: "+dt);
		}

		catch(Exception e) //generalized exception handler
		{
		System.out.println("exception are handled and not declared");
		}

	}
}
