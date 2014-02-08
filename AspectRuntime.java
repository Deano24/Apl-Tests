package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * @author Deano
 * Finds the runtim of ApsectJ to count numbers and do file proccessing
 *
 */

public class Main {

	/**
	* @descriptin Main functiont hat starts the application
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main count = new Main();
		long startTime = System.nanoTime();
		//count.count_function();
		count.copy_file();
		long endTime = System.nanoTime();

		long duration = endTime - startTime;
		
		System.out.println(duration);
	}


	/**
	* @dscription counts to 100,000
	*/
	public void count_function(){
		for(int x = 0; x < 100000;x++){}
	}

	/**
	* Opens a file read in it line by line and writes it to a next file
	*/
	public void copy_file(){
		
	    try{
	    	BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Deano\\Documents\\test\\dummy.txt"));
	    	BufferedWriter writer = new BufferedWriter(new FileWriter(new File("C:\\Users\\Deano\\Documents\\test\\AJavadummy.txt")));
	    	String line = br.readLine();
	      while (line != null){
	    	  writer.write(line);
		      writer.newLine();
	          line = br.readLine();
	      }    
	      writer.close();
	      br.close();
	    }catch(IOException e){
	    	e.printStackTrace();
	    }
	}
}
