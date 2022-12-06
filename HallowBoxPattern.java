
import java.util.Scanner;

public class HallowBoxPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number fo Rows: ");
        int row = s.nextInt();
        System.out.print("Enter Number fo Columns: ");
        int col = s.nextInt();
        s.close();
        for(int i=1; i<=row;i++){
            for(int j=1; j<=col;j++){
                if (i==1 || j==1 || i==row || j==col) {
                    System.out.print("* ");
                }
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
