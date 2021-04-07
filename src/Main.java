import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap a");
        double a=scanner.nextDouble();
        System.out.println("nhap b");
        double b=scanner.nextDouble();
        System.out.println("nhap c");
        double c=scanner.nextDouble();
        QuadraticEquation quadraticEquation=new QuadraticEquation(a,b,c);
        System.out.println(quadraticEquation.getRoot1());
        System.out.println(quadraticEquation.getRoot2());
        System.out.println(quadraticEquation.getDiscriminant());
    }
}
