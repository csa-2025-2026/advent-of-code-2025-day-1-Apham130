import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class Day3
{
  public static void main(String[] args) throws IOException
  {
    File file = new File("day3.txt");  
    Scanner sc = new Scanner(file);   
    String line = sc.nextLine();
    long answer = 0;
    System.out.println("The answer is " + answer);
    sc.close();
  }
}
