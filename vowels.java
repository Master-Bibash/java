import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class vowels {
     public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          System.out.println("enter any letters");
          String word = input.nextLine().toUpperCase();
          Set<Character> chara = new HashSet<Character>();
          for (int i = 0; i < word.length(); i++) {
               char c = word.charAt(i);
               if (anser(c)) {
                    chara.add(c);

               }
          }
          System.out.println("vpwels are");
          for (Character Cr : chara) {
               System.out.println(" " + Cr);
          }
          input.close();

     }

     public static boolean anser(char a) {
          if (a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U') {
               return true;
          } else
               return false;
     }

}
