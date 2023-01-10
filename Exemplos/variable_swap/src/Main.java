public class Main {
    public static void main(String[] args) {
        //Swap = Troca
        int x = 1;
        int y = 2;
        int z;

        System.out.println("Antes: x = "+x+" y = "+y);

        z = x;
        x = y;
        y = z;

        System.out.println("Depois: x = "+x+" y = "+y);
    }
}