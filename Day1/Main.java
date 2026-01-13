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
      String dir = line.substring(0,1);
      int num = Integer.parseInt(line.substring(1));
      if (dir.equals("L"))
      {
        num = -num;
        System.out.println(dial + " " + line);
        for (int i = -1; i >= num; i--) {
          dial--;
          dial %= 100;
          
          if (dial == 0) {
            System.out.println(dial);
            System.out.println(num);
            answer++;
          }
        }
      } else
      {
        System.out.println(dial + " " + line);
        for (int i = 1; i <= num; i++) {
          dial++;
          dial %= 100;

          if (dial == 0) {
            System.out.println(num);
            answer++;
          }
        }
      }
    }

    System.out.println("The answer is " + answer);
    sc.close();
  }
}
