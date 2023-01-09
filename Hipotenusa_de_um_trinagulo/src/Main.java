import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double x,y,z;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o lado x: ");
        x = sc.nextDouble();

        System.out.println("Digite o lado y: ");
        y = sc.nextDouble();

        z = Math.sqrt((x*x)+(y*y));

        System.out.println("A hipotenusa do triangulo e: "+z);

        sc.close();
    }
}