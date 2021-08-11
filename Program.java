import java.util.Scanner;
public class Program {

      public static void main(String[] args) {
        System.out.print("Algorithm Euclid's for calculating greatest common divisor of two numbers\n\n\n");
        System.out.print("Enter the first number: ");
        Scanner scan = new Scanner(System.in);
        int first_number = scan.nextInt();
        System.out.print("Enter the second number: ");
        int second_number = scan.nextInt();
        int result;
        if (first_number == 0 && second_number == 0) {
            System.out.print("Uncertainty");
            System.exit(0);
        }
        if (second_number == 0) {
            System.out.print("Uncertainty");
            System.exit(0);
        }
        if (first_number < 0 || second_number < 0) {
            System.out.print("Algorithm not for negative numbers");
            System.exit(0);
        }
        if (first_number > second_number) {
           result = first_number - second_number;
           while (result != second_number) {
               while (result > second_number) {
               result -= second_number;
           }
               while (result < second_number) {
             second_number -= result;
            }
        }
           if (result == second_number) {
                System.out.print("Greatest common divisor equal: "+ result);
            }
        }
        else if (first_number < second_number) {
            result = second_number - first_number;
            while (result != first_number) {
                while (result > first_number) {
                    result -= first_number;
                }
                while (result < first_number) {
                    first_number -= result;
                }
            }
            if (result == first_number) {
                System.out.print("Greatest common divisor equal: "+ result);
            }
        }
        else {
            System.out.print("Greatest common divisor equal: " + first_number);
        }
      }
}