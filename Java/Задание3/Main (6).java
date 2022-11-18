import java.util.*;
import java.util.Scanner;



public class Main {
  
  
  
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      int[] numbers = new int[10];
      System.out.println("Введите числа");
      System.out.println("Числа кратные 3: "); 

      for (int i = 0; i < numbers.length && sc.hasNextInt(); i++) {
          
          numbers[i] = sc.nextInt();
        }
      //int[] numbers = new int[] {0, 9, 20, 21, 40, 33};
      
      
      
      for (int i = 0; i < numbers.length ; i++ ) {
          if (numbers[i] % 3 == 0 && numbers[i] !=  0) System.out.print(numbers[i] + " ");
        }
      
  }
}