import java.io.IOException;
import java.io.FileWriter;

public class Question1
{
    public static void main (String[] args) throws IOException
    { 
        String [][] myStudents = {
            {"Sophie", "Stanfield", "Class 5" },
            {"James", "Kitson", "Class 5"},
            {"Zoe", "Gaskill", "Class 1"},
            {"Paul", "Johns", "Class 1"},
            {"Freya", "Moore", "Class 5"},   
        };
        
        FileWriter fr = new FileWriter ("U:\\Computer Science\\Projects\\File Handling\\students.txt");
        for (int i = 0; i < myStudents.length; i++){
            for (int j = 0; j < myStudents [i].length; j++){
                fr.write(myStudents[i][j] + "\t");
            }
            fr.write("\n");
        }
        fr.close();
    }
    }
