

import java.util.Scanner;

class CountDigit{
    static int count(int n){
        int count =0;
        while(n>0){
            n/=10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(count(n));
        sc.close();
    }
}
