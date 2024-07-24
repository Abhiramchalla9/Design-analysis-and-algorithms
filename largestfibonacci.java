import java.util.Scanner;
public class largestfibonacci {
    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number n :");
        int n = sc.nextInt();

        int a = 0;
        int  b = 1;

        while(true){
            int c = a+b;
            if(c >= n){
                System.out.println("The largest fibonnaci number is "+b);
                break;
            }
            a=b;
            b= c;
        }
        
    }
    
}
