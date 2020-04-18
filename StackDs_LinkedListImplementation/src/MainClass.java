import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class MainClass {

    public static void main(String args[]){
        //file to get test data
        File myTestFile = new File("C:\\Users\\Prosper's PC\\Documents\\LinkedListTesting.txt");
        LinkedList myLink = new LinkedList();
        try {
            Scanner readInput = new Scanner(myTestFile);
            while (readInput.hasNextLine()){
                String data = readInput.nextLine();
                if(data.equals("-")){
                    System.out.println(myLink.pop());
                }
                else {
                    myLink.push(data);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
