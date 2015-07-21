import java.io.*;
import java.lang.*;
import java.util.*;


public class createfile {

	private Formatter x;
	
	public void openFile(){
		try{
			x= new Formatter("womile.txt");
		}
		catch(Exception e){
			System.out.println("error");
		}
	}
	
	public void addRecords(){
		x.format("%s%s%s\n", "18"," Peter", " Muturi");
		x.format("%s%s%s\n", "19"," Peter", " Muturi");
		x.format("%s%s%s", "20"," Peter", " Muturi");
	}
	public void closeFile(){
		x.close();
	}
	
}
