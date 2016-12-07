import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class Question2
{
    public static void main (String [] args) throws IOException
    {
        FileReader fr = new FileReader ("U:\\Computer Science\\Projects\\File Handling\\products.txt");
        BufferedReader br = new BufferedReader (fr);
        
        ArrayList <String> lines = new ArrayList<>();
        String line;
        
        System.out.println("The products inside the array are:");
        
        while((line = br.readLine()) !=null){
            System.out.println(line);
            lines.add(line);
        }
    
        br.close();
    }
}
        