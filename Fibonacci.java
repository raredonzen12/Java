import java.util.Scanner;
class Fibonacci{
	public static void main(String[] args){
		int a=1,b=1,c,n;
		Scanner scan = new Scanner(System.in);
		n= scan.nextInt();
		scan.close();
		System.out.print(a+" "+b);
		for (int i=1;i<n-1;i++){
			c=a+b;
			a=b;
			b=c;
			System.out.print(" "+c);
		}
	}
}
