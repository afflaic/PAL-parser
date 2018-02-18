import java.io.*;
import java.util.*;

public class Pal {
	public static void main(String[] args) {
		
		try {
			
			String fileName = null;
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Welcome to PAL!\nPlease input your file name: ");
			fileName = scan.next();
			
			String[] getName = fileName.split("\\.");
			String appendedName = getName[0] + ".pal";
			
			File oldFile = new File(fileName);
			File newFile = new File(appendedName);
			oldFile.renameTo(newFile);
			
			String line,getComment = null;
            FileReader fileReader = new FileReader(newFile);

            BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			String[] substr = null;
			line = bufferedReader.readLine();
			
			do {
			if (line.equals("SRT")){

            while((line = bufferedReader.readLine()) != null) {
				if(line.contains(";"))
					line = line.substring(0, line.indexOf(";"));
				substr = line.split(":| +|,");
				
				for(int i = 0;i < substr.length; i++)
				System.out.println(substr[i]);
					if (line.equals("END")){
						break;
                  }
				}   
				
			}
			else
				System.out.println("Program must begin with SRT command");
			} while((line = bufferedReader.readLine()) != null);

            bufferedReader.close();  
			fileReader.close();
			scan.close();
			
        }
        catch(FileNotFoundException ex) {
            System.out.println("Can't open file");            
        }
        catch(IOException ex) {
            System.out.println("Error reading file");     
        }
		
		
		
	}
}
