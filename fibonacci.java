//Write a code to generate the Fibonacci sequence until a user specified limit.
import java.util.Scanner;
public class fibonacci{
    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number ");
        int n = sc.nextInt();

        if(n <=0){
            System.out.println("Enter the positive number :");
        }
        else{
            System.out.println("Fibonacci series upto" + n +"numbers :");
            for(int i=0;i<n;i++){
                System.out.println(fibseries(i)+" ");
            }
        }
    }
    public static int fibseries(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return n;
        }
        else{
            return fibseries(n-1)+fibseries(n-2);
        }
    }
}
