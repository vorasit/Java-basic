package file;
import java.io.File;  // Import the File class
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class CreateFile {
    public static void main(String[] args) {
        try{
            File myObj = new File("file/filename.txt"); // create file
            if(myObj.createNewFile()){
                System.out.println("File created: " + myObj.getName());
                FileWriter myWriter = new FileWriter(myObj);// load file
                myWriter.write("Files in Java might be tricky, but it is fun enough!"); // write
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            }else {
                System.out.println("File already exists.");
              }

        }catch(IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
