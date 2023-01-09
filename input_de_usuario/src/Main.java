import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome:");
        String nome = sc.nextLine();

        System.out.println("Digite a sua altura em CM:");
        int altura = sc.nextInt();

       sc.nextLine();//utilizado para limpar o teclado

        System.out.println("Digite o seu endereco: ");
        String endereco = sc.nextLine();

        System.out.println("O seu nome e "+nome+" voce tem "+altura+" centimetros de altura e mora na "+endereco);



    }
}