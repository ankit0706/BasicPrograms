package com.sample.exceptionhandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
/**
 * Demonstration of try with resources and multiple catch
 * @author AANU
 *
 */
public class SampleTryWithResources {

	public static void main(String[] args) {
		//print current directory
		//System.out.println(System.getProperty("user.dir"));
		//Write a file, the old way
		/*
		File file = new File("." + File.separator + "sample.txt");
		FileWriter writer;
		BufferedWriter bufWriter = null;
		try {
			writer = new FileWriter(file);
			bufWriter = new BufferedWriter(writer);
			bufWriter.write("Yellow");
			bufWriter.write("Blue");
			bufWriter.write("Green");
			bufWriter.write("White");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//this is the ugly part
			try {
				bufWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		//Reading the file old way
		BufferedReader bufReader;
		try {
			bufReader = new BufferedReader(new FileReader(file));
			String line;
			while((line = bufReader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
		/*
		 * Try with resources
		 */
		
		File file = new File("." + File.separator + "sample.txt");
		
		//Write
		try(BufferedWriter bufWriter = new BufferedWriter(new FileWriter(file))){
			bufWriter.write("Yellow" + "\n");
			bufWriter.write("Blue" + "\n");
			bufWriter.write("Green" + "\n");
			bufWriter.write("White" + "\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Read
		try(BufferedReader bufReader = new BufferedReader(new FileReader(file))){
			printSomeLine();
			String line;
			while((line = bufReader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException | SQLException e) {//*multiple catch*
			e.printStackTrace();
		} 
	}
	
	private static void printSomeLine() throws SQLException{
		System.out.println("2018 to 2020");
	}

}
