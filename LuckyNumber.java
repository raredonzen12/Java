import java.util.Scanner;

class LuckyNumber{
    public static void main(String[] args) {
        System.out.print("Enter 4 digit number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a,b,c,d;
        a=num%10;
        b=((num/10)%10)%10;
        c=((num/100)%10)%10;
        d=((num/1000)%10)%10;
        sc.close();
        if(a+b == c+d)
            System.out.println("Lucky Number");
        else
            System.out.println("Not a Lucky Number");
    }
}