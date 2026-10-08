import java.util.Scanner;
public class do_while {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int sum=0;
    int i = 0;
    System.out.print("Enter number :");
    int j = sc.nextInt(); 
    do{
      sum += i++;
    }
    while(i<=j);
    System.out.println("The sum of first " + j + " numbers is " + sum);
    System.out.println("The factorial of " + j + " is " + factorial(j));
  }

  public static int factorial(int n){
    if (n==0){
      return 1;
    }
    int result = 1;
    do {
      result *= n--;
    } while (n>0);
    return result;
  }
  
}

