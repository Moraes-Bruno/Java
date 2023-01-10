import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int colunas,linhas;
        String caracter = "";

        System.out.println("Digite a quantidade de linhas");
        linhas = sc.nextInt();

        System.out.println("Digite a quantidade de colunas");
        colunas = sc.nextInt();

        sc.nextLine();

        System.out.println("Digite o simbolo ou caracter que deseja usar");
        caracter = sc.nextLine();

        for(int i = 1; i<=linhas; i++){
            System.out.println();
            for (int y = 1;y <=colunas; y++){
                System.out.print(" "+caracter+" ");
            }
        }

    }
}