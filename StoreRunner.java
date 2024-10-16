import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    // Creates a Scanner object - feel free to delete if not using!
    Scanner input = new Scanner(System.in);
Lego store = new Lego();
Sets one = new Sets(50, 1, "Star wars", "Marvel");
    Age two = new Age(8, 16, "Under 8", "Over 8");
    System.out.println(store);
    System.out.println();
    
    System.out.println(one);
System.out.println();
    
    System.out.println(two);




    // Closes the Scanner object
    input.close();
    
  }
}