import java.util.Scanner;

public class Calculadora_simples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x,y;
        int opt=0;
        while(opt !=9) {
            System.out.println("-------------------");
            System.out.println("1-Somar");
            System.out.println("2-Subtrair");
            System.out.println("3-Dividir");
            System.out.println("4-Multiplicar");
            System.out.println("9-Sair");
            System.out.println("---------------------");

            System.out.println("Escolha uma opcao:");
            opt = sc.nextInt();


            switch (opt) {
                case 1:
                    System.out.println("Digite um numero:");
                    x = sc.nextDouble();
                    System.out.println("Digite outro numero:");
                    y = sc.nextDouble();

                    System.out.println("O resultado é " + (x + y));

                    break;
                case 2:
                    System.out.println("Digite um numero:");
                    x = sc.nextDouble();
                    System.out.println("Digite outro numero:");
                    y = sc.nextDouble();

                    System.out.println("O resultado é " + (x - y));

                    break;
                case 3:
                    System.out.println("Digite um numero:");
                    x = sc.nextDouble();
                    System.out.println("Digite outro numero:");
                    y = sc.nextDouble();

                    System.out.println("O resultado é " + (x / y));

                    break;
                case 4:
                    System.out.println("Digite um numero:");
                    x = sc.nextDouble();
                    System.out.println("Digite outro numero:");
                    y = sc.nextDouble();

                    System.out.println("O resultado é " + (x * y));

                    break;
                case 9:
                    break;
                default:
                    System.out.println("Digite uma opcao valida");
                    break;
            }

        }

    }
}