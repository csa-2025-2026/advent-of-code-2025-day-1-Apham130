import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class Day2
{
  public static void main(String[] args) throws IOException
  {
    File file = new File("day2.txt");  // this is your problem input as a File object
    Scanner sc = new Scanner(file);   // the Scanner object is now reading from the file object
    String line = sc.nextLine();
    long answer = 0;
    while (line.indexOf(",") != -1) {
      int split = line.indexOf(",");
      String range = line.substring(0, split);
      line = line.substring(split + 1);
      int split2 = range.indexOf("-");
      long num1 = Long.parseLong(range.substring(0, split2));
      long num2 = Long.parseLong(range.substring(split2 + 1));
      while (num1 <= num2) {
        String snum = Long.toString(num1);
        if (snum.length() % 2 == 0) {
          if (snum.substring(0, snum.length()/2).equals(snum.substring(snum.length()/2)))
          {
            System.out.println(num1);
            answer += num1;
          }
        }
        num1++;
      }
    }
      int split = line.indexOf("-");
      long num1 = Long.parseLong(line.substring(0, split));
      long num2 = Long.parseLong(line.substring(split + 1));
      while (num1 <= num2) {
        String snum = Long.toString(num1);
        if (snum.length() % 2 == 0) {
          
          if (snum.substring(0, snum.length()/2).equals(snum.substring(snum.length()/2)))
          {
            System.out.println(num1);
            answer += num1;
          }
        }
        num1++;
      }
      System.out.println("The answer is " + answer);
    sc.close();
  }
}
