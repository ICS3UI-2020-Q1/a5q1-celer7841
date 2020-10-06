import java.util.Scanner;
/**
 *
 * @author celer7841
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create the counting variable 
   System.out.println("Please enter an integer to create a multiplication table for");
   Scanner input = new Scanner(System.in);
    int num = input.nextInt();
    
      // print the number
    for(int count = 1; count <= 12; count = count + 1){
      int multiplication = count * num;
      System.out.println(count + " x " + num +  " = " + multiplication);
    }
    
  }
}
