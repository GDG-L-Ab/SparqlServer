package com.gdgrome.sparql.camera.server;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SparqlQueryOpenData {
	public String sparqlData() throws IOException{
	//init reader
		BufferedReader reader = null;
		String line = null;	
		String sparqlQuery = null;
		try {
			File file = new File("C://anagraficaANSI.txt");			
			reader = new BufferedReader(new FileReader(file));
			//defining SPARQL Query				
			//read line
			while((line = reader.readLine()) != null){	
				if(sparqlQuery == null){
					sparqlQuery = line;
				}
				else{
					sparqlQuery += line;
					//System.out.println("server, sparqlQuery -------- " + sparqlQuery);
				}
			}
			System.out.println("server, sparqlQuery -------- " + sparqlQuery);
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		}
		finally {
		    try {
		        reader.close();
		    } catch (IOException e) {
		        e.printStackTrace();
		    }
		}
		
		return sparqlQuery;
	}
}
