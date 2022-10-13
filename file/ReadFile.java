package file;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class ReadFile {
    public static void main(String[] args) {
        try{
            File myObj = new File("file/filename.txt");
            Scanner MyReader = new Scanner(myObj);
            while(MyReader.hasNextLine()){
                String data = MyReader.nextLine();
                System.out.println(data);
            }
            if (myObj.exists()){
                System.out.println("File name: " + myObj.getName());
                System.out.println("Absolute path: " + myObj.getAbsolutePath());
                System.out.println("Writeable: " + myObj.canWrite());
                System.out.println("Readable " + myObj.canRead());
                System.out.println("File size in bytes " + myObj.length());
            }
            
        }catch(FileNotFoundException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
