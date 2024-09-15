import java.util.Scanner;

public class LabTwo {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter your name");

    String userName = myScanner.nextLine();  // Read user input
    System.out.println("Username is: " + userName);  // Output user input

    //----------
    // Q1
    //----------
    // Use the scanner to get the user to enter 3 movies to rate.
    // Print the movie titles that the user is rating.
    System.out.println("Enter movies: ");
    String movie1 = myScanner.nextLine();
    String movie2 = myScanner.nextLine();
    String movie3 = myScanner.nextLine();
    //TODO: Add code to get user to input 3 movies

    System.out.println(userName + " is rating " + movie1 + ", " + movie2 + ", and " + movie3 + "." );  // Output user input
  
    //----------
    // Q2
    //----------
    // Use the scanner to get the user to rate each movie.
    // Ratings must be integers between 1-5.
    int rating1;
    int rating2;
    int rating3;

    System.out.println("Enter your rating for " + movie1 + ". Rating must be a number between 1 to 5.");  // Output user input
    rating1 = myScanner.nextInt();

    System.out.println("Enter your rating for " + movie2 + ". Rating must be a number between 1 to 5.");  // Output user input
    rating2 = myScanner.nextInt();

    System.out.println("Enter your rating for " + movie3 + ". Rating must be a number between 1 to 5.");  // Output user input
    rating3 = myScanner.nextInt();

    //TODO: Get ratings for the other movies that user entered.

    //----------
    // Q3
    //----------
    // Compare user preference between movies.
    boolean likeMovie1MoreThanMovie2;
    boolean likeMovie2MoreThanMovie3;

    if(rating1 != rating2){
      if (rating1 > rating2) {
        likeMovie1MoreThanMovie2 = true;
      }

      if (rating1 < rating2) {
        likeMovie1MoreThanMovie2 = false;
      }

      if (true) {
        System.out.println(userName + " likes " + movie1 + " more than " + movie2);
      }

      if (false) {
        System.out.println(userName + " likes " + movie2+ " more than " + movie1);
      }
    }

    if(rating2 != rating3){
      if (rating2 > rating3) {
        likeMovie1MoreThanMovie2 = true;
      }

      if (rating2 < rating3) {
        likeMovie1MoreThanMovie2 = false;
      }

      if (true) {
        System.out.println(userName + " likes " + movie2 + " more than " + movie3);
      }

      if (false) {
        System.out.println(userName + " likes " + movie3 + " more than " + movie2);
      }
    }

    //TODO: Compare user preference between movie2 and mosvie3 and print result.

    //----------
    // BONUS
    //----------
    //Print the user's favorite movie. Print all if there are ties.
    if((rating1 == rating3) && (rating2 < rating1)){
      System.out.println(userName + " favorite movies are " + movie1 + " and " + movie3);
    }

    if((rating2 == rating3) && (rating1 < rating2)){
      System.out.println(userName + " favorite movies are " + movie2 + " and " + movie3);
    }

    if((rating1 > rating2) && (rating1 > rating3)){
      System.out.println(userName + " favorite movie is " + movie1);
    }

    if((rating2 > rating1) && (rating2 > rating3)){
      System.out.println(userName + " favorite movie is " + movie2);
    }

    if((rating3 > rating1) && (rating3 > rating2)){
      System.out.println(userName + " favorite movie is " + movie3);
    }

    if((rating1 == rating2) && (rating3 < rating1)){
      System.out.println(userName + " favorite movies are " + movie1 + " and " + movie2);
    }

    if((rating1 == rating2) && (rating1 == rating3)){
        System.out.println(userName + " favorite movies are " + movie1 + ", " + movie2 + " and " + movie3);
      }
    }
}