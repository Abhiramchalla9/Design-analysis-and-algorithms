import java.util.Scanner;
public class hemachandrafibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number  n:");
        int N = sc.nextInt();

        int ways = Caluclateways(N);
        
        System.out.println("Number of ways to sum" + N +" using 1 and 2's "+ ways );

    }

    public static int Caluclateways(int N){
        if(N==0){
            return 1;
        }
        else if(N < 0){
            return 0;
        }
        else{
            return Caluclateways(N-1)+Caluclateways(N-2);
        }
    }

    
}
