import java.util.Scanner;
public class Program {
/* Method create object class Scanner. Exit information messages,
 carries out enter name and surname user, causes method name_surname*/
      public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.print("Enter your name: ");
         String name = scan.nextLine();
         System.out.print("Enter your surname: ");
         String surname = scan.nextLine();
         name_surname(name, surname);
      }
// Create new method for exit the name and the surname user
      public static void name_surname(String a, String b) {
        System.out.println(a);
        System.out.print(b);
      }
}