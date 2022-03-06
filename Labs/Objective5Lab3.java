import java.util.Scanner;

public class Objective5Lab3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int userNum;

    System.out.println("Please enter a number: ");
    userNum = scanner.nextInt();

if(userNum > 0) {
  System.out.println("The number is poisitive");
}
else if(userNum == 0) {
  System.out.println("The number is 0");
}
else {
  System.out.println("The number is negative");
}
scanner.close();
  }
}
