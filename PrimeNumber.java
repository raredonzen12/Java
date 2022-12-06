import java.util.Scanner;

public class PrimeNumber {
    static boolean isPrime(int n){
        if(n==1){
            return false;
        }

        else if(n==2 || n==3){
            return true;
        }
        
        else if(n%2==0 || n%3==0){
            return false;
        }
        
        for(int i=2; i<=Math.sqrt(n); i=i+6){
            if(n%i == 0 || n%(i+2)==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPrime(n));
    }
}
