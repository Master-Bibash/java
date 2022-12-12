import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String file="D://java//practice";

        //create a new file text file 
        // File myFile=new File("file.txt");
        // try{
        // myFile.createNewFile();
        // }catch(IOException e){
        //     System.out.println("unable ");
        // }
        
    
    //code to write to a file
//     try{
//     FileWriter fileWriter=new FileWriter("file.txt");
//     fileWriter.write("this is our first file written and im happy");
//     fileWriter.close();
//     }catch (IOException e){
//         e.printStackTrace();
File myfFile=new File("file.txt");
// try {
//     Scanner sc=new Scanner(myfFile);
//     while(sc.hasNextLine()){
//         String line=sc.nextLine();
//         System.out.println(line);
//     }
//     sc.close();

    
// } catch (Exception e) {
//     e.printStackTrace();
    
// }

//delete file
if(myfFile.delete()){
    System.out.println("deleted file "+myfFile.getName());
}else{
    System.out.println("problem occured");
}
    
}
    
}
