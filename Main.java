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
      if (dir.equals("L"))
      {
        num = -num;
      }

      dial += num;
      dial %= 100;
      if (dial == 0)
      {
        answer++;
      }
    }

    System.out.println("The password is " + answer);
    sc.close();
  }
}
