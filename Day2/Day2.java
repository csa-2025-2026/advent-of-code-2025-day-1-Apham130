import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class Day2
{
  public static void main(String[] args) throws IOException
  {
    File file = new File("day2.txt");  
    Scanner sc = new Scanner(file);   
    String line = sc.nextLine();
    long answer = 0;
    while (line.indexOf(",") != -1) {
      int split = line.indexOf(",");
      String range = line.substring(0, split);
      line = line.substring(split + 1);
      int split2 = range.indexOf("-");
      String s1 = range.substring(0, split2);
      String s2 = range.substring(split2 + 1);
      long num1 = Long.parseLong(s1);
      long num2 = Long.parseLong(s2);
      //start at substring (0,i) until i is half of length
      //need new for part 2
      while (num1 <= num2) {
        String snum = Long.toString(num1);

        for (int i = snum.length(); i > 1; i--) {
          if (snum.length() % i == 0) {
            boolean add = true;
            for (int k = 0; k + 1 < i; k++)
            {
              String sec1 = snum.substring(k * (snum.length()/i), (k + 1) * (snum.length()/i));
              String sec2 = snum.substring((k + 1)*(snum.length()/i), (k + 2)*(snum.length()/i));
              if (!(sec1.equals(sec2)))
              {
                add = false;
                break;
              }
            }
            if (add == true) {
              answer += num1;
              break;
            }
          }
        }
        num1++;
      }
    }
    System.out.println("The answer is " + answer);
    sc.close();
  }
}
