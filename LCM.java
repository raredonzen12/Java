import java.util.Scanner;

class LCM {
    static int euclidGcd(int a, int b){
        while(a != 0 && b != 0 ){
            if(a>b){
                a = a%b;
            }else{
                b = b%a;
            }
        }
        if(a != 0)
        return a;
        else
        return b;
    }

    static int findLcm(int a, int b){
        return (a*b)/euclidGcd(a, b);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(findLcm(a, b));
        sc.close();
    }
}
