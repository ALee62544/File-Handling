import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Question3
{
    public static void main(String[] args) throws IOException
    {
        boolean[] lotteryNumbers = new boolean [50];
        int numberOfSelectedBalls = 0;
        int winningBall = 0;
        
        while (numberOfSelectedBalls !=6)
        {
            do 
            {
                winningBall = (int) (Math.random()*50);
            } while (winningBall == 0);
            if (lotteryNumbers[winningBall] == false)
            {
                lotteryNumbers[winningBall] = true;
                numberOfSelectedBalls ++;
            }
        }
        
        FileWriter fw = new FileWriter ("U:\\Computer Science\\Projects\\File Handling\\lotterygame.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        
        for (int i = 0; i < lotteryNumbers.length; i++)
        {
            if (lotteryNumbers[i] == true)
            {
                bw.newLine();
                bw.write(i + "\t");
            }
        }
        bw.close();
    }
}
        