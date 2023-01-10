import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = "";

        while(name.isBlank()){
            System.out.println("Digite o seu nome:");
            name = sc.nextLine();
        }

            System.out.println("Ola! "+name);


    }
}