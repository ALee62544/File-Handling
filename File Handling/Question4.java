import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Question4
{
    static BufferedReader br;
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner (System.in);
        FileReader fr = new FileReader ("U:\\Computer Science\\Projects\\File Handling\\keywords.txt");
        br = new BufferedReader(fr);
        
        //GUI Display
        System.out.println("\n");
        System.out.println("1. Search for a term");
        System.out.println("2. Search for a keyword in the descriptions");
        System.out.println("3. End" + "\n");
        String list = "";
        //Input from user
        int key = 0;
        
        System.out.println("Key in choice.");
        key = sc.nextInt();
        
        //Checks if key is between 0 or 3 - has to be int as well
        while (key > 3 || key <= 0) {
           System.out.println("Please enter a key between 1 and 3.");
           key = sc.nextInt();
        }
        
        //Correlates key to matching choice they've made - procedure modules finds the term/keyword as appropriate
        if (key == 1) {
            System.out.println("Search for a term.");
            sc.nextLine();
            String term = sc.nextLine();
            findTerm(term);
        } 
        else if (key == 2) {
            System.out.println("Search for a keyword in the descriptions.");
            sc.nextLine();
            String keyword = sc.nextLine();
            findKeyword(keyword);
        }
        else if (key == 3) {
            System.out.println("Ending program...");
            System.out.println("Program ended.");
        }
    
        br.close(); 
        }
    
    //findTerm procedure
    public static void findTerm(String term) throws IOException
    {
        boolean found = false;
        String line;
            
        while ((line = br.readLine ()) != null) {
            if (line.equals(term)){
                System.out.println("FOUND FOR " + term);
                System.out.println("Description ...? " + br.readLine());
                found = true;
                break;
            }
        }
        
        if (found == false){
                System.out.println("NO TERM FOUND");
            }
    }
    
    //findKeyword procedure
    public static void findKeyword(String keyword) throws IOException
    {
        boolean found = false;
        String line;
        List<String> lines = new ArrayList<String>();
            
        while ((line = br.readLine ()) != null) {
            lines.add(line);
        }
            
        for (int i = 1; i < lines.size(); i+=3) {
            if (lines.get(i).contains(keyword)) {
                System.out.println(lines.get(i));
                System.out.println("Keyword ...? " + lines.get(i-1));
                found = true;
                break;
            }
        }
            
        if (found == false) {
            System.out.println("NO TERM FOUND");
        }
    }
}


        