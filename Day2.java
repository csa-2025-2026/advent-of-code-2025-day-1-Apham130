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
    while() {
      int split = line.indexOf(",");
      String range = line.substring(0, split);
      line = line.substring(split + 1);



      
    }




    
    
    int num = Interger.parseInt(snum);
      if (snum.substring(0, snum.length()/2).equals(snum.substring(snum.length()/2)))
      {
        answer += num;
      }
    sc.close();
  }
}
