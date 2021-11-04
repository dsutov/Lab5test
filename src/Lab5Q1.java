import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Lab5Q1
{
    public static void sortArray(String[] input)
    {
        for(int i = 0; i < input.length-1; i++)
        {


        }

    }



    public static void main(String[] args) throws FileNotFoundException
    {
        File f = new File("input.txt");
        Scanner scan = new Scanner(f);

        ArrayList<String> wordArray = new ArrayList<String>();

        String line = "";

        while(scan.hasNextLine()) // This while loop goes through the input file and removes any special characters then adds the word to the arraylist
        {
            line = scan.next();
            line = line.replace(",","");
            line = line.replace("?","");
            line = line.replace("!","");
            line = line.replace("'","");
            line = line.replace(".","");
            line = line.replace(":","");
            wordArray.add(line);
        }


        String[] copyOfWordArray = wordArray.toArray(new String[wordArray.size()]); // converts the arraylist to a normal array

        sortArray(copyOfWordArray);

        scan.close();
    }

}
