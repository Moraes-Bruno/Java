import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Operadores logicos são utilizados para conectar duas ou mais expressoes

        int temp = 25;

        if(temp > 30){
            System.out.println("Esta quente la fora");
        }
        else if (temp>=20 && temp<=30){ // dois Es comerciais simbolizam 'E' logo ambas as condições devem ser verdadeiras
            System.out.println("Esta relativamente quente la fora");

        }
        else{
            System.out.println("Esta frio la fora");
        }

        Scanner sc = new Scanner(System.in);

        System.out.println("Pressione Q ou q para sair");
        String res = sc.nextLine();

        if(res.equals("q") || res.equals("Q")){ //dois pipes "||" representam "OU" logo pelo menos uma condição deve ser verdadeira
            System.out.println("Saindo....");
        }
        else{
            System.out.println("O programa ainda esta sendo executado");
        }
    }
}