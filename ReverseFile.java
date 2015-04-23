/*
 * A command line java program to read one or more files specified
 * as command line arguments.
 * 
 * The output of the program is the characters from the files in
 * the opposite order they appear.
 * 
 */

import java.io.*;
import java.util.*;

/*
 * @author: Samruddhi Rendalkar
 */

public class ReverseFile {
       
	public static void main(String[] args) throws FileNotFoundException {
		String characterEncoding = "utf-8";
        List<String> reversedStringsList = new ArrayList<String>();
        
        if(args.length<1) {   
    		System.out.println("At least one input file should be provided.");
    		return;
    	}
        		 
        try {
        
        	/*
        	 * Input file(s) is given as an argument
        	 */
        	for (int i=0; i<args.length; i++) {  
        		File sourceFile = new File(args[i]);
    	  		Scanner content = new Scanner(sourceFile, characterEncoding);
    	  		
    	  		while(content.hasNextLine()) {
    	  			String str = content.nextLine();
    	  			StringBuffer buffer = new StringBuffer(str);
    	  			buffer = buffer.reverse();
    	  			String reversedStr = buffer.toString();
    	  			reversedStringsList.add(reversedStr);
    	  		} 
    	  		content.close();   
    	  	 }  
        	
    	  	 int length = reversedStringsList.size();
    	  	 
        	 for (int j = length-1; j >= 0; j--) {
        		 String reversedString = reversedStringsList.get(j);
        		 System.out.println(reversedString);
    	  	 } 			
    	  }  

      	  catch(Exception e) {
          System.out.println(e.getMessage());
      	  } 
     } 
}  