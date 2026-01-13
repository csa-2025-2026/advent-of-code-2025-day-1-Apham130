import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class Day3
{
  public static void main(String[] args) throws IOException
  {
    File file = new File("day3.txt");  
    Scanner sc = new Scanner(file);   
    int answer = 0;
    while (sc.hasNext()) {
      String line = sc.nextLine();
      String m1 = "0";
      int imax = 0;
      for (int h = 11; h >= 0; h--) {
        for (int i = imax; i < line.length() - h; i++) {
          int num = Integer.parseInt(line.substring(i, i + 1));
          String snum = line.substring(i, i + 1);
          if(num > Integer.parseInt(m1)) {
            imax = i;
            m1 += snum;
          }
        }
      answer += Integer.parseInt(m1); 
      }
    }
    System.out.println("The answer is " + answer);
    sc.close();
  }
}
