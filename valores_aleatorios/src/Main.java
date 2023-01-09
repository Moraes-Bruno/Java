import java.util.Random;
public class Main {
    public static void main(String[] args) {

        Random rd = new Random();

        int x = rd.nextInt(6)+1;

        System.out.println(x);
    }
}