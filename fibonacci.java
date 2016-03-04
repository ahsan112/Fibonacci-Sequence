import java.util.Scanner;

public class fibonacci {
    
    public static void main(String args[]){
        
    Scanner in = new Scanner(System.in);
        
        System.out.print("Enter number upto which Fibonacci series to print: ");
        int number = in.nextInt();
 
        System.out.println("\n\nFibonacci series upto " + number +" numbers : ");
      
        for(int i=1; i<=number; i++){
            System.out.print(fibonacci(i) +" ");
            }
    }
 
   
    public static int fibonacci(int number){
        if(number == 1 || number == 2){
            return 1;
            }
 
            return fibonacci(number-1) + fibonacci(number-2);
        }
}