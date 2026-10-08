import java.util.Scanner;
public class Booking {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("==================================================================================================");
    System.out.println("Welcome to the Booking System");
    System.out.println("The movies currently available are");
    System.out.println("1. The Batman");
    System.out.println("2. The Flash");
    System.out.println("3. The Avengers");
    System.out.println("4. The Spider-Man");
    System.out.println();
    System.out.println("Please select the movie you want to book (enter the number mapped above to the movie)");
    System.out.println("To exit at any point , press 0 to exit");
    int choice = sc.nextInt();
    switch (choice) {
      case 1:
        {System.out.println("You have selected The Batman");
        System.out.println("Please select the screen you want to book - Screen 1 , Screen 4 . Enter just the number");
        int screen = sc.nextInt();
        System.out.println("You have selected Screen " + screen);
        break;}
      case 2:
        {System.out.println("You have selected The Flash");
        System.out.println("Please select the screen you want to book - Screen 1 , Screen 4 . Enter just the number");
        int screen = sc.nextInt();
        System.out.println("You have selected Screen " + screen);
        break;}
      case 3:
        {System.out.println("You have selected The Avengers");
        System.out.println("Please select the screen you want to book - Screen 1 , Screen 4 . Enter just the number");
        int screen = sc.nextInt();
        System.out.println("You have selected Screen " + screen);
        break;}
      case 4:
        {System.out.println("You have selected The Spider-Man");
        System.out.println("Please select the screen you want to book - Screen 1 , Screen 4 . Enter just the number");
        int screen = sc.nextInt();
        System.out.println("You have selected Screen " + screen);
        break;}
      default:
        System.out.println("Invalid choice");
  }
  System.out.println("Thank you for using the Booking System");
  System.out.println("Please come again");
  System.out.println("==================================================================================================");
 }
 }

