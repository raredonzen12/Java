// This program converts gallon int liters


import java.util.Scanner;

class GalToLit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double gal = sc.nextDouble();
        double ltr;
        ltr = gal*3.7854;
        System.out.println(gal+" gallon is : "+ltr+"liters");
        sc.close();
    }
}
