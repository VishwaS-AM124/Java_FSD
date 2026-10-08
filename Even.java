import java.util.Scanner;
public class Even {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter starting number :");
    int i = sc.nextInt();
    System.out.print("Enter ending number :");
    int j = sc.nextInt();
    
    if (i%2!=0){
      i++;
    }


    while (i<=j){
      System.out.print(i + " ");
      i+=2;
    }
  }
  
}
