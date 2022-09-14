import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
       int a,b;
       
       int opt = 0;

       do{
           System.out.println("Digite o valor de A: ");
           a = Integer.parseInt(sc.nextLine());

           System.out.println("Digite o valor de B: ");
           b = Integer.parseInt(sc.nextLine());

           opt = menu(sc);
           switch (opt){
               case 1:
               somar (a,b);
               break;

               case 2:
                   subtrair(a,b);
                   break;
               case 3:
                   multiplicar(a,b);
                   break;

               case 4:
                   dividir(a,b);
                   break;
               case 9:
                   System.out.println("Fim");
                   break;
               default:
                   System.out.println("Opcao invalida");
           }


       }while(opt !=9);

    }

    private static int menu(Scanner sc) {
        int opt;
        System.out.println("CALCULADORA");
        System.out.println("1-soma");
        System.out.println("2-subtrair");
        System.out.println("3-multiplicar");
        System.out.println("4-dividir");
        System.out.println("9-sair");
        System.out.println("Escolha uma opcao");
        opt = Integer.parseInt(sc.nextLine());
        return opt;
    }

    private static void dividir(int a, int b) {
        System.out.println("Resultado: "+a/b);
    }

    private static void multiplicar(int a, int b) {
        System.out.println("Resultado:"+a*b);
    }

    private static void subtrair(int a, int b) {
        System.out.println("Resultado: "+(a-b));
    }

    private static void somar(int a, int b) {
        System.out.println("Resultado: "+(a+b));
    }
}