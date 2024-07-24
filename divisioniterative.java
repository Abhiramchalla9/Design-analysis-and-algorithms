import java.util.Scanner;
public class divisioniterative {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number a :");
        int a = sc.nextInt();

        System.out.println("Enter the number b :");
        int b = sc.nextInt();

        int quotient = 0;
        int remainder = a;

        while(remainder >= b){
            remainder -= b;
            quotient += 1;
        }

        System.out.println("Quotient :"+quotient);
        System.out.println("Remainder :"+remainder);

    } 
    
}
