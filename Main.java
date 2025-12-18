import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args) throws IOException
  {
    File file = new File("input.txt");  // this is your problem input as a File object
    Scanner sc = new Scanner(file);   // the Scanner object is now reading from the file object

    int dial = 50;
    int answer = 0;

    while (sc.hasNext())  // as long as the Scanner has more lines to read from the file...
    {
      String line = sc.nextLine();  // gets the next line of input.  This is like "R802"
      String snum = line.substring(1);
      String dir = line.substring(0,1);
      int num = Integer.parseInt(snum);
      if (dir.equals("R"))
      {
        if (num + dial > 99) 
        {
          //set to 0, count rotations, add remainder
        } else {
          dial += num;
        }
      } else 
      {
        dial = -(100 - dial);
        if (dial + num < -99)
        {
          // set to zero, add circle, same as other
        } else {
          
        }

      }
    }

    System.out.println("The password is " + answer);
    sc.close();
  }
}
