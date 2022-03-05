import java.util.Scanner;

public class Objective4Lab1{
  public static void main(String[] args){

    Scanner keyboard = new Scanner(System.in);

    String fname = "";
    String lname = "";
    String favoriteAnimal = "";
    String favoriteSong = "";


    System.out.println("What is your first name?");
    fname = keyboard.nextLine();

    System.out.println("What if your last name?");
    lname = keyboard.nextLine();

    System.out.println("What is your favorite animal?");
    favoriteAnimal = keyboard.nextLine();

    System.out.println("What is your favoite song?");
    favoriteSong = keyboard.nextLine();

    System.out.println("My name is " + fname + " " + lname + ".");
    System.out.println("My favorite animal is " + favoriteAnimal + ".");
    System.out.println("My favorite song is " + favoriteSong + ".");

  }
}
