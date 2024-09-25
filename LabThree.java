import java.util.Scanner;

class LabThree {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("How many dollars are you willing to spend? (type a positive integer): ");
     while (!scanner.hasNextInt()) {
      System.out.println("Enter a valid input");
      scanner.next();
    }
    int pricePoint = scanner.nextInt();

    System.out.print("I would be interested in trying boba! (type true or false): ");
    boolean isInterestedInBoba = scanner.nextBoolean();

    System.out.print("I am addicted to warm rolls with cinnamon butter (type true or false): ");
    boolean isAddictedToRolls = scanner.nextBoolean();
    
    System.out.print("I am looking for a full meal as opposed to a pick-me-up snack (type true or false): ");
    boolean isFullMeal = scanner.nextBoolean();

    // TODO: Add your code below here.
    if(pricePoint < 10) {
      if(isInterestedInBoba) {
        System.out.println("Boba Mi Amor");
      }
      else {
        System.out.println("Starbucks");
      }
    }

    if(pricePoint >= 10){
      if(isAddictedToRolls) {
        System.out.println("Texas Roadhouse");
      }
      else {
        if(isFullMeal){
          System.out.println("Chick-fil-a");
        }
        else {
          System.out.println("Starbucks");
        }
      }
    }
  }
}
